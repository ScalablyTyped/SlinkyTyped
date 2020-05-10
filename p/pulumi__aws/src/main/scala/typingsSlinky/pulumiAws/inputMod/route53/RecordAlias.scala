package typingsSlinky.pulumiAws.inputMod.route53

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordAlias extends js.Object {
  /**
    * Set to `true` if you want Route 53 to determine whether to respond to DNS queries using this resource record set by checking the health of the resource record set. Some resources have special requirements, see [related part of documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html#rrsets-values-alias-evaluate-target-health).
    */
  var evaluateTargetHealth: Input[Boolean] = js.native
  /**
    * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
    */
  var name: Input[String] = js.native
  /**
    * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See [`resource_elb.zone_id`](https://www.terraform.io/docs/providers/aws/r/elb.html#zone_id) for example.
    */
  var zoneId: Input[String] = js.native
}

object RecordAlias {
  @scala.inline
  def apply(evaluateTargetHealth: Input[Boolean], name: Input[String], zoneId: Input[String]): RecordAlias = {
    val __obj = js.Dynamic.literal(evaluateTargetHealth = evaluateTargetHealth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordAlias]
  }
  @scala.inline
  implicit class RecordAliasOps[Self <: RecordAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluateTargetHealth(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluateTargetHealth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

