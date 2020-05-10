package typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy for container image binary authorization.
  */
@js.native
trait SchemaPolicy extends js.Object {
  /**
    * Optional. Admission policy whitelisting. A matching admission request
    * will always be permitted. This feature is typically used to exclude
    * Google or third-party infrastructure images from Binary Authorization
    * policies.
    */
  var admissionWhitelistPatterns: js.UndefOr[js.Array[SchemaAdmissionWhitelistPattern]] = js.native
  /**
    * Optional. Per-cluster admission rules. Cluster spec format:
    * `location.clusterId`. There can be at most one admission rule per cluster
    * spec. A `location` is either a compute zone (e.g. us-central1-a) or a
    * region (e.g. us-central1). For `clusterId` syntax restrictions see
    * https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
    */
  var clusterAdmissionRules: js.UndefOr[StringDictionary[SchemaAdmissionRule]] = js.native
  /**
    * Required. Default admission rule for a cluster without a per-cluster,
    * per- kubernetes-service-account, or per-istio-service-identity admission
    * rule.
    */
  var defaultAdmissionRule: js.UndefOr[SchemaAdmissionRule] = js.native
  /**
    * Optional. A descriptive comment.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. Controls the evaluation of a Google-maintained global admission
    * policy for common system-level images. Images not covered by the global
    * policy will be subject to the project admission policy. This setting has
    * no effect when specified inside a global admission policy.
    */
  var globalPolicyEvaluationMode: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name, in the format `projects/x/policy`. There
    * is at most one policy per project.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Time when the policy was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaPolicy {
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  @scala.inline
  implicit class SchemaPolicyOps[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmissionWhitelistPatterns(value: js.Array[SchemaAdmissionWhitelistPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admissionWhitelistPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmissionWhitelistPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admissionWhitelistPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterAdmissionRules(value: StringDictionary[SchemaAdmissionRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterAdmissionRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterAdmissionRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterAdmissionRules")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAdmissionRule(value: SchemaAdmissionRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAdmissionRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAdmissionRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAdmissionRule")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalPolicyEvaluationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalPolicyEvaluationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalPolicyEvaluationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalPolicyEvaluationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

