package typingsSlinky.pulumiAws.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIpRangesArgs extends js.Object {
  /**
    * Filter IP ranges by regions (or include all regions, if
    * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
    * (e.g. `eu-central-1`)
    */
  val regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filter IP ranges by services. Valid items are `amazon`
    * (for amazon.com), `amazonConnect`, `apiGateway`, `cloud9`, `cloudfront`,
    * `codebuild`, `dynamodb`, `ec2`, `ec2InstanceConnect`, `globalaccelerator`,
    * `route53`, `route53Healthchecks`, `s3` and `workspacesGateways`. See the
    * [`service` attribute][2] documentation for other possible values.
    */
  val services: js.Array[String] = js.native
  /**
    * Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documention][1]. Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
    */
  val url: js.UndefOr[String] = js.native
}

object GetIpRangesArgs {
  @scala.inline
  def apply(services: js.Array[String]): GetIpRangesArgs = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpRangesArgs]
  }
  @scala.inline
  implicit class GetIpRangesArgsOps[Self <: GetIpRangesArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

