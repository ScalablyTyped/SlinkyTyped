package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current-generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  /**
    * The type of node that AWS recommends.
    */
  var NodeType: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}

object RedshiftInstanceDetails {
  @scala.inline
  def apply(): RedshiftInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftInstanceDetails]
  }
  @scala.inline
  implicit class RedshiftInstanceDetailsOps[Self <: RedshiftInstanceDetails] (val x: Self) extends AnyVal {
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
    def withFamily(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Family")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(js.undefined)
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

