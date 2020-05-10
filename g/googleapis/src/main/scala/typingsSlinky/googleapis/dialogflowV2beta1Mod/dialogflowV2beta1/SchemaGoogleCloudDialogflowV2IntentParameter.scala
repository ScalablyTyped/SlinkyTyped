package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents intent parameters.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentParameter extends js.Object {
  /**
    * Optional. The default value to use when the `value` yields an empty
    * result. Default values can be extracted from contexts by using the
    * following syntax: `#context_name.parameter_name`.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * Required. The name of the parameter.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. The name of the entity type, prefixed with `@`, that describes
    * values of the parameter. If the parameter is required, this must be
    * provided.
    */
  var entityTypeDisplayName: js.UndefOr[String] = js.native
  /**
    * Optional. Indicates whether the parameter represents a list of values.
    */
  var isList: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Indicates whether the parameter is required. That is, whether
    * the intent cannot be completed without collecting the parameter value.
    */
  var mandatory: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier of this parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of prompts that the agent can present to the
    * user in order to collect value for the parameter.
    */
  var prompts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The definition of the parameter value. It can be: - a constant
    * string, - a parameter value defined as `$parameter_name`, - an original
    * parameter value defined as `$parameter_name.original`, - a parameter
    * value from some context defined as   `#context_name.parameter_name`.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentParameter {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentParameter]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentParameterOps[Self <: SchemaGoogleCloudDialogflowV2IntentParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypeDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypeDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isList")(js.undefined)
        ret
    }
    @scala.inline
    def withMandatory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandatory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(js.undefined)
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
    def withPrompts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompts")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

