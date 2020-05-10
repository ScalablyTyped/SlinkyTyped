package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend extends js.Object {
  /**
    * Specifies a virtual service to use as a backend for a virtual node. 
    */
  var virtualService: js.UndefOr[VirtualServiceBackend] = js.native
}

object Backend {
  @scala.inline
  def apply(): Backend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backend]
  }
  @scala.inline
  implicit class BackendOps[Self <: Backend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualService(value: VirtualServiceBackend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualService")(js.undefined)
        ret
    }
  }
  
}

