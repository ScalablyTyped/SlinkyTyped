package typingsSlinky.pulumiAws.recordMod

import typingsSlinky.pulumiAws.inputMod.route53.RecordAlias
import typingsSlinky.pulumiAws.inputMod.route53.RecordFailoverRoutingPolicy
import typingsSlinky.pulumiAws.inputMod.route53.RecordGeolocationRoutingPolicy
import typingsSlinky.pulumiAws.inputMod.route53.RecordLatencyRoutingPolicy
import typingsSlinky.pulumiAws.inputMod.route53.RecordWeightedRoutingPolicy
import typingsSlinky.pulumiAws.recordTypeMod.RecordType
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordState extends js.Object {
  /**
    * An alias block. Conflicts with `ttl` & `records`.
    * Alias record documented below.
    */
  val aliases: js.UndefOr[Input[js.Array[Input[RecordAlias]]]] = js.native
  /**
    * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
    */
  val allowOverwrite: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
    */
  val failoverRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordFailoverRoutingPolicy]]]] = js.native
  /**
    * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
    */
  val fqdn: js.UndefOr[Input[String]] = js.native
  /**
    * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
    */
  val geolocationRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordGeolocationRoutingPolicy]]]] = js.native
  /**
    * The health check the record should be associated with.
    */
  val healthCheckId: js.UndefOr[Input[String]] = js.native
  /**
    * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
    */
  val latencyRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordLatencyRoutingPolicy]]]] = js.native
  /**
    * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
    */
  val multivalueAnswerRoutingPolicy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the configuration string (e.g. `"first255characters\"\"morecharacters"`).
    */
  val records: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
    */
  val setIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The TTL of the record.
    */
  val ttl: js.UndefOr[Input[Double]] = js.native
  /**
    * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
    */
  val `type`: js.UndefOr[Input[String | RecordType]] = js.native
  /**
    * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
    */
  val weightedRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordWeightedRoutingPolicy]]]] = js.native
  /**
    * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See [`resource_elb.zone_id`](https://www.terraform.io/docs/providers/aws/r/elb.html#zone_id) for example.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}

object RecordState {
  @scala.inline
  def apply(): RecordState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordState]
  }
  @scala.inline
  implicit class RecordStateOps[Self <: RecordState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: Input[js.Array[Input[RecordAlias]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOverwrite(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withFailoverRoutingPolicies(value: Input[js.Array[Input[RecordFailoverRoutingPolicy]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverRoutingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailoverRoutingPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverRoutingPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withFqdn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fqdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFqdn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fqdn")(js.undefined)
        ret
    }
    @scala.inline
    def withGeolocationRoutingPolicies(value: Input[js.Array[Input[RecordGeolocationRoutingPolicy]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geolocationRoutingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeolocationRoutingPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geolocationRoutingPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckId")(js.undefined)
        ret
    }
    @scala.inline
    def withLatencyRoutingPolicies(value: Input[js.Array[Input[RecordLatencyRoutingPolicy]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyRoutingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatencyRoutingPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyRoutingPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withMultivalueAnswerRoutingPolicy(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multivalueAnswerRoutingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultivalueAnswerRoutingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multivalueAnswerRoutingPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecords(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String | RecordType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedRoutingPolicies(value: Input[js.Array[Input[RecordWeightedRoutingPolicy]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedRoutingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedRoutingPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedRoutingPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(js.undefined)
        ret
    }
  }
  
}

