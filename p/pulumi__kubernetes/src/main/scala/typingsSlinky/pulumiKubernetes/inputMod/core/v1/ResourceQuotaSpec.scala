package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var hard: js.UndefOr[Input[js.Object]] = js.native
  /**
    * scopeSelector is also a collection of filters like scopes that must match each object
    * tracked by a quota but expressed using ScopeSelectorOperator in combination with possible
    * values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must
    * be matched.
    */
  var scopeSelector: js.UndefOr[Input[ScopeSelector]] = js.native
  /**
    * A collection of filters that must match each object tracked by a quota. If not specified,
    * the quota matches all objects.
    */
  var scopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ResourceQuotaSpec {
  @scala.inline
  def apply(): ResourceQuotaSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotaSpec]
  }
  @scala.inline
  implicit class ResourceQuotaSpecOps[Self <: ResourceQuotaSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHard(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeSelector(value: Input[ScopeSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

