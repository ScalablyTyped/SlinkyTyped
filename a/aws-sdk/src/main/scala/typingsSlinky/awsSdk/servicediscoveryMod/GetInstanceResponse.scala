package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceResponse extends js.Object {
  /**
    * A complex type that contains information about a specified instance.
    */
  var Instance: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Instance] = js.native
}

object GetInstanceResponse {
  @scala.inline
  def apply(): GetInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceResponse]
  }
  @scala.inline
  implicit class GetInstanceResponseOps[Self <: GetInstanceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: Instance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instance")(js.undefined)
        ret
    }
  }
  
}

