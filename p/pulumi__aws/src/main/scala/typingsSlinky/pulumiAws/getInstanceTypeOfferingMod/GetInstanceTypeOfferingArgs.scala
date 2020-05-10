package typingsSlinky.pulumiAws.getInstanceTypeOfferingMod

import typingsSlinky.pulumiAws.inputMod.ec2.GetInstanceTypeOfferingFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingFilter]] = js.native
  /**
    * Location type. Defaults to `region`. Valid values: `availability-zone`, `availability-zone-id`, and `region`.
    */
  val locationType: js.UndefOr[String] = js.native
  /**
    * Ordered list of preferred EC2 Instance Types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
    */
  val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
}

object GetInstanceTypeOfferingArgs {
  @scala.inline
  def apply(): GetInstanceTypeOfferingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceTypeOfferingArgs]
  }
  @scala.inline
  implicit class GetInstanceTypeOfferingArgsOps[Self <: GetInstanceTypeOfferingArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

