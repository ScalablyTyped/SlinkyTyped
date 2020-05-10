package typingsSlinky.pulumiAws.getElasticIpMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.GetElasticIpFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetElasticIpArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
    */
  val filters: js.UndefOr[js.Array[GetElasticIpFilter]] = js.native
  /**
    * The allocation id of the specific VPC EIP to retrieve. If a classic EIP is required, do NOT set `id`, only set `publicIp`
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The public IP of the specific EIP to retrieve.
    */
  val publicIp: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match a pair on the desired Elastic IP
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetElasticIpArgs {
  @scala.inline
  def apply(): GetElasticIpArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetElasticIpArgs]
  }
  @scala.inline
  implicit class GetElasticIpArgsOps[Self <: GetElasticIpArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[GetElasticIpFilter]): Self = {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

