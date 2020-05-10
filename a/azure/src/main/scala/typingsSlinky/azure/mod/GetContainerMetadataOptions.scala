package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerMetadataOptions extends GetContainerPropertiesOptions {
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.native
}

object GetContainerMetadataOptions {
  @scala.inline
  def apply(): GetContainerMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerMetadataOptions]
  }
  @scala.inline
  implicit class GetContainerMetadataOptionsOps[Self <: GetContainerMetadataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessConditions(value: StorageAccessCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessConditions")(js.undefined)
        ret
    }
  }
  
}

