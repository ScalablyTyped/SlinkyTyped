package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPolicy extends js.Object {
  /** The policy all_values state. */
  var allValues: js.UndefOr[String] = js.native
  /**
    * List of values allowed  at this resource. Can only be set if no values
    * are set for `denied_values` and `all_values` is set to
    * `ALL_VALUES_UNSPECIFIED`.
    */
  var allowedValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of values denied at this resource. Can only be set if no values are
    * set for `allowed_values` and `all_values` is set to
    * `ALL_VALUES_UNSPECIFIED`.
    */
  var deniedValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Determines the inheritance behavior for this `Policy`.
    *
    * By default, a `ListPolicy` set at a resource supercedes any `Policy` set
    * anywhere up the resource hierarchy. However, if `inherit_from_parent` is
    * set to `true`, then the values from the effective `Policy` of the parent
    * resource are inherited, meaning the values set in this `Policy` are
    * added to the values inherited up the hierarchy.
    *
    * Setting `Policy` hierarchies that inherit both allowed values and denied
    * values isn't recommended in most circumstances to keep the configuration
    * simple and understandable. However, it is possible to set a `Policy` with
    * `allowed_values` set that inherits a `Policy` with `denied_values` set.
    * In this case, the values that are allowed must be in `allowed_values` and
    * not present in `denied_values`.
    *
    * For example, suppose you have a `Constraint`
    * `constraints/serviceuser.services`, which has a `constraint_type` of
    * `list_constraint`, and with `constraint_default` set to `ALLOW`.
    * Suppose that at the Organization level, a `Policy` is applied that
    * restricts the allowed API activations to {`E1`, `E2`}. Then, if a
    * `Policy` is applied to a project below the Organization that has
    * `inherit_from_parent` set to `false` and field all_values set to DENY,
    * then an attempt to activate any API will be denied.
    *
    * The following examples demonstrate different possible layerings:
    *
    * Example 1 (no inherited values):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values:”E2”}
    * ``projects/bar`` has `inherit_from_parent` `false` and values:
    * {allowed_values: "E3" allowed_values: "E4"}
    * The accepted values at `organizations/foo` are `E1`, `E2`.
    * The accepted values at `projects/bar` are `E3`, and `E4`.
    *
    * Example 2 (inherited values):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values:”E2”}
    * `projects/bar` has a `Policy` with values:
    * {value: “E3” value: ”E4” inherit_from_parent: true}
    * The accepted values at `organizations/foo` are `E1`, `E2`.
    * The accepted values at `projects/bar` are `E1`, `E2`, `E3`, and `E4`.
    *
    * Example 3 (inheriting both allowed and denied values):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: "E1" allowed_values: "E2"}
    * `projects/bar` has a `Policy` with:
    * {denied_values: "E1"}
    * The accepted values at `organizations/foo` are `E1`, `E2`.
    * The value accepted at `projects/bar` is `E2`.
    *
    * Example 4 (RestoreDefault):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values:”E2”}
    * `projects/bar` has a `Policy` with values:
    * {RestoreDefault: {}}
    * The accepted values at `organizations/foo` are `E1`, `E2`.
    * The accepted values at `projects/bar` are either all or none depending on
    * the value of `constraint_default` (if `ALLOW`, all; if
    * `DENY`, none).
    *
    * Example 5 (no policy inherits parent policy):
    * `organizations/foo` has no `Policy` set.
    * `projects/bar` has no `Policy` set.
    * The accepted values at both levels are either all or none depending on
    * the value of `constraint_default` (if `ALLOW`, all; if
    * `DENY`, none).
    *
    * Example 6 (ListConstraint allowing all):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values: ”E2”}
    * `projects/bar` has a `Policy` with:
    * {all: ALLOW}
    * The accepted values at `organizations/foo` are `E1`, E2`.
    * Any value is accepted at `projects/bar`.
    *
    * Example 7 (ListConstraint allowing none):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values: ”E2”}
    * `projects/bar` has a `Policy` with:
    * {all: DENY}
    * The accepted values at `organizations/foo` are `E1`, E2`.
    * No value is accepted at `projects/bar`.
    */
  var inheritFromParent: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The Google Cloud Console will try to default to a configuration
    * that matches the value specified in this `Policy`. If `suggested_value`
    * is not set, it will inherit the value specified higher in the hierarchy,
    * unless `inherit_from_parent` is `false`.
    */
  var suggestedValue: js.UndefOr[String] = js.native
}

object ListPolicy {
  @scala.inline
  def apply(): ListPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicy]
  }
  @scala.inline
  implicit class ListPolicyOps[Self <: ListPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allValues")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDeniedValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deniedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeniedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deniedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritFromParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritFromParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritFromParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritFromParent")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedValue")(js.undefined)
        ret
    }
  }
  
}

