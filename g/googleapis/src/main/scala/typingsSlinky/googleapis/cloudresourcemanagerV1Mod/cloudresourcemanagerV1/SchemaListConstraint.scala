package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Constraint` that allows or disallows a list of string values, which are
  * configured by an Organization&#39;s policy administrator with a `Policy`.
  */
@js.native
trait SchemaListConstraint extends js.Object {
  /**
    * Optional. The Google Cloud Console will try to default to a configuration
    * that matches the value specified in this `Constraint`.
    */
  var suggestedValue: js.UndefOr[String] = js.native
  /**
    * Indicates whether subtrees of Cloud Resource Manager resource hierarchy
    * can be used in `Policy.allowed_values` and `Policy.denied_values`. For
    * example, `&quot;under:folders/123&quot;` would match any resource under
    * the &#39;folders/123&#39; folder.
    */
  var supportsUnder: js.UndefOr[Boolean] = js.native
}

object SchemaListConstraint {
  @scala.inline
  def apply(): SchemaListConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConstraint]
  }
  @scala.inline
  implicit class SchemaListConstraintOps[Self <: SchemaListConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSupportsUnder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUnder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsUnder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUnder")(js.undefined)
        ret
    }
  }
  
}

