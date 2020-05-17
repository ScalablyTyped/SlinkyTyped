package typingsSlinky.jointjs.mod.connectors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericConnectorJSON[K /* <: ConnectorType */] extends js.Object {
  var args: js.UndefOr[GenericConnectorArguments[K]] = js.native
  var name: K = js.native
}

object GenericConnectorJSON {
  @scala.inline
  def apply[K](name: K): GenericConnectorJSON[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericConnectorJSON[K]]
  }
  @scala.inline
  implicit class GenericConnectorJSONOps[Self[k] <: GenericConnectorJSON[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withName(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: GenericConnectorArguments[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
  }
  
}

