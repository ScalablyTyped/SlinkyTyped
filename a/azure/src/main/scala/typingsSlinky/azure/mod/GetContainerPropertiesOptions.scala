package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerPropertiesOptions extends TimeoutIntervalOptions {
  var leaseId: js.UndefOr[String] = js.native
}

object GetContainerPropertiesOptions {
  @scala.inline
  def apply(): GetContainerPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerPropertiesOptions]
  }
  @scala.inline
  implicit class GetContainerPropertiesOptionsOps[Self <: GetContainerPropertiesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseId")(js.undefined)
        ret
    }
  }
  
}

