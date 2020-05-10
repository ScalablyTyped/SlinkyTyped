package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceAccessDetailsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about a get instance access request.
    */
  var accessDetails: js.UndefOr[InstanceAccessDetails] = js.native
}

object GetInstanceAccessDetailsResult {
  @scala.inline
  def apply(): GetInstanceAccessDetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceAccessDetailsResult]
  }
  @scala.inline
  implicit class GetInstanceAccessDetailsResultOps[Self <: GetInstanceAccessDetailsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDetails(value: InstanceAccessDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessDetails")(js.undefined)
        ret
    }
  }
  
}

