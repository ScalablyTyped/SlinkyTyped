package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
  */
@js.native
trait ResourceQuotaSpec extends js.Object {
  /**
    * hard is the set of desired hard limits for each named resource. More info:
    * https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  val hard: js.Object = js.native
  /**
    * scopeSelector is also a collection of filters like scopes that must match each object
    * tracked by a quota but expressed using ScopeSelectorOperator in combination with possible
    * values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must
    * be matched.
    */
  val scopeSelector: ScopeSelector = js.native
  /**
    * A collection of filters that must match each object tracked by a quota. If not specified,
    * the quota matches all objects.
    */
  val scopes: js.Array[String] = js.native
}

object ResourceQuotaSpec {
  @scala.inline
  def apply(hard: js.Object, scopeSelector: ScopeSelector, scopes: js.Array[String]): ResourceQuotaSpec = {
    val __obj = js.Dynamic.literal(hard = hard.asInstanceOf[js.Any], scopeSelector = scopeSelector.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotaSpec]
  }
  @scala.inline
  implicit class ResourceQuotaSpecOps[Self <: ResourceQuotaSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHard(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeSelector(value: ScopeSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

