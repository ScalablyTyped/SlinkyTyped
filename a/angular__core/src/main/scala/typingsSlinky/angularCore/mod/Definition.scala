package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition[DF /* <: DefinitionFactory[_] */] extends js.Object {
  var factory: DF | Null = js.native
}

object Definition {
  @scala.inline
  def apply[DF](): Definition[DF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition[DF]]
  }
  @scala.inline
  implicit class DefinitionOps[Self[df] <: Definition[df], DF] (val x: Self[DF]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DF] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DF]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DF] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DF] with Other]
    @scala.inline
    def withFactory(value: DF): Self[DF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactoryNull: Self[DF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(null)
        ret
    }
  }
  
}

