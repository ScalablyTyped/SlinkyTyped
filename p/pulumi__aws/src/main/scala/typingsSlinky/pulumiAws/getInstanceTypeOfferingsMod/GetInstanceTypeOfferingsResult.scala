package typingsSlinky.pulumiAws.getInstanceTypeOfferingsMod

import typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Set of EC2 Instance Types.
    */
  val instanceTypes: js.Array[String] = js.native
  val locationType: js.UndefOr[String] = js.native
}

object GetInstanceTypeOfferingsResult {
  @scala.inline
  def apply(id: String, instanceTypes: js.Array[String]): GetInstanceTypeOfferingsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingsResult]
  }
  @scala.inline
  implicit class GetInstanceTypeOfferingsResultOps[Self <: GetInstanceTypeOfferingsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetInstanceTypeOfferingsFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(js.undefined)
        ret
    }
  }
  
}

