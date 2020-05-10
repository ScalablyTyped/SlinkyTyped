package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIPSetResponse extends js.Object {
  /**
    * Information about the IPSet that you specified in the GetIPSet request. For more information, see the following topics:    IPSet: Contains IPSetDescriptors, IPSetId, and Name     IPSetDescriptors: Contains an array of IPSetDescriptor objects. Each IPSetDescriptor object contains Type and Value   
    */
  var IPSet: js.UndefOr[typingsSlinky.awsSdk.wafMod.IPSet] = js.native
}

object GetIPSetResponse {
  @scala.inline
  def apply(): GetIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIPSetResponse]
  }
  @scala.inline
  implicit class GetIPSetResponseOps[Self <: GetIPSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPSet(value: IPSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSet")(js.undefined)
        ret
    }
  }
  
}

