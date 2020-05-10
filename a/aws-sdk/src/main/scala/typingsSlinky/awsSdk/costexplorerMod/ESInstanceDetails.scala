package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ESInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current-generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  /**
    * The class of instance that AWS recommends.
    */
  var InstanceClass: js.UndefOr[GenericString] = js.native
  /**
    * The size of instance that AWS recommends.
    */
  var InstanceSize: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}

object ESInstanceDetails {
  @scala.inline
  def apply(): ESInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESInstanceDetails]
  }
  @scala.inline
  implicit class ESInstanceDetailsOps[Self <: ESInstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentGeneration(value: GenericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceClass(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceSize(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeFlexEligible(value: GenericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeFlexEligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeFlexEligible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeFlexEligible")(js.undefined)
        ret
    }
  }
  
}

