package typingsSlinky.pulumiAws.getInstanceTypeOfferingMod

import typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * EC2 Instance Type.
    */
  val instanceType: String = js.native
  val locationType: js.UndefOr[String] = js.native
  val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
}

object GetInstanceTypeOfferingResult {
  @scala.inline
  def apply(id: String, instanceType: String): GetInstanceTypeOfferingResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingResult]
  }
  @scala.inline
  implicit class GetInstanceTypeOfferingResultOps[Self <: GetInstanceTypeOfferingResult] (val x: Self) extends AnyVal {
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
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetInstanceTypeOfferingFilter]): Self = {
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
    @scala.inline
    def withPreferredInstanceTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredInstanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredInstanceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredInstanceTypes")(js.undefined)
        ret
    }
  }
  
}

