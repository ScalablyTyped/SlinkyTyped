package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaImage extends js.Object {
  /**
    * The date and time the AFI was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * Indicates whether data retention support is enabled for the AFI.
    */
  var DataRetentionSupport: js.UndefOr[Boolean] = js.native
  /**
    * The description of the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.native
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.native
  /**
    * The name of the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The alias of the AFI owner. Possible values include self, amazon, and aws-marketplace.
    */
  var OwnerAlias: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the AFI owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Information about the PCI bus.
    */
  var PciId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.PciId] = js.native
  /**
    * The product codes for the AFI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * Indicates whether the AFI is public.
    */
  var Public: js.UndefOr[Boolean] = js.native
  /**
    * The version of the AWS Shell that was used to create the bitstream.
    */
  var ShellVersion: js.UndefOr[String] = js.native
  /**
    * Information about the state of the AFI.
    */
  var State: js.UndefOr[FpgaImageState] = js.native
  /**
    * Any tags assigned to the AFI.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The time of the most recent update to the AFI.
    */
  var UpdateTime: js.UndefOr[js.Date] = js.native
}

object FpgaImage {
  @scala.inline
  def apply(): FpgaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaImage]
  }
  @scala.inline
  implicit class FpgaImageOps[Self <: FpgaImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRetentionSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRetentionSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRetentionSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRetentionSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withFpgaImageGlobalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageGlobalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpgaImageGlobalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageGlobalId")(js.undefined)
        ret
    }
    @scala.inline
    def withFpgaImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpgaImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPciId(value: PciId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PciId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPciId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PciId")(js.undefined)
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
    def withPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Public")(js.undefined)
        ret
    }
    @scala.inline
    def withShellVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShellVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShellVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShellVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: FpgaImageState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTime")(js.undefined)
        ret
    }
  }
  
}

