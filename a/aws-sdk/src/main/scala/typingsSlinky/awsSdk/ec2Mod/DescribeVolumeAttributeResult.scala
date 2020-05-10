package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumeAttributeResult extends js.Object {
  /**
    * The state of autoEnableIO attribute.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object DescribeVolumeAttributeResult {
  @scala.inline
  def apply(): DescribeVolumeAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumeAttributeResult]
  }
  @scala.inline
  implicit class DescribeVolumeAttributeResultOps[Self <: DescribeVolumeAttributeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoEnableIO(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoEnableIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEnableIO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoEnableIO")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCodes(value: ProductCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeId")(js.undefined)
        ret
    }
  }
  
}

