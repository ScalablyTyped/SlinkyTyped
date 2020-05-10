package typingsSlinky.arangodb.Foxx

import typingsSlinky.arangodb.AnonData
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDefinition extends js.Object {
  var forClient: js.UndefOr[js.Function1[/* body */ js.Any, AnonData]] = js.native
  var fromClient: js.UndefOr[
    js.Function3[/* body */ String | Buffer, /* req */ Request, /* type */ MediaType, _]
  ] = js.native
}

object TypeDefinition {
  @scala.inline
  def apply(): TypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDefinition]
  }
  @scala.inline
  implicit class TypeDefinitionOps[Self <: TypeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForClient(value: /* body */ js.Any => AnonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutForClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forClient")(js.undefined)
        ret
    }
    @scala.inline
    def withFromClient(value: (/* body */ String | Buffer, /* req */ Request, /* type */ MediaType) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromClient")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFromClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromClient")(js.undefined)
        ret
    }
  }
  
}

