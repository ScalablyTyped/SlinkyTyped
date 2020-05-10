package typingsSlinky.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHapi extends js.Object {
  var hapi: js.UndefOr[String] = js.native
  var node: js.UndefOr[String] = js.native
}

object AnonHapi {
  @scala.inline
  def apply(): AnonHapi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHapi]
  }
  @scala.inline
  implicit class AnonHapiOps[Self <: AnonHapi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHapi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hapi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHapi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hapi")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
  }
  
}

