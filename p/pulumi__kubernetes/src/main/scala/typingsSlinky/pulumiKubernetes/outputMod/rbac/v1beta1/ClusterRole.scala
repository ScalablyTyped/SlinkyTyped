package typingsSlinky.pulumiKubernetes.outputMod.rbac.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
  * unit by a RoleBinding or ClusterRoleBinding. Deprecated in v1.17 in favor of
  * rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.20.
  */
@js.native
trait ClusterRole extends js.Object {
  /**
    * AggregationRule is an optional field that describes how to build the Rules for this
    * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
    * changes to Rules will be stomped by the controller.
    */
  val aggregationRule: AggregationRule = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: rbacDotauthorizationDotk8sDotioSlashv1beta1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole = js.native
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta = js.native
  /**
    * Rules holds all the PolicyRules for this ClusterRole
    */
  val rules: js.Array[PolicyRule] = js.native
}

object ClusterRole {
  @scala.inline
  def apply(
    aggregationRule: AggregationRule,
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1beta1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole,
    metadata: ObjectMeta,
    rules: js.Array[PolicyRule]
  ): ClusterRole = {
    val __obj = js.Dynamic.literal(aggregationRule = aggregationRule.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRole]
  }
  @scala.inline
  implicit class ClusterRoleOps[Self <: ClusterRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationRule(value: AggregationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: rbacDotauthorizationDotk8sDotioSlashv1beta1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[PolicyRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

