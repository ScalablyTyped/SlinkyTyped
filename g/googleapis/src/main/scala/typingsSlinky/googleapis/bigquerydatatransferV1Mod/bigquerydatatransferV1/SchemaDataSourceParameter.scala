package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a data source parameter with validation rules, so that
  * parameters can be rendered in the UI. These parameters are given to us by
  * supported data sources, and include all needed information for rendering
  * and validation. Thus, whoever uses this api can decide to generate either
  * generic ui, or custom data source specific forms.
  */
@js.native
trait SchemaDataSourceParameter extends js.Object {
  /**
    * All possible values for the parameter.
    */
  var allowedValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Parameter description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Parameter display name in the user interface.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Deprecated. This field has no effect.
    */
  var fields: js.UndefOr[js.Array[SchemaDataSourceParameter]] = js.native
  /**
    * Cannot be changed after initial creation.
    */
  var immutable: js.UndefOr[Boolean] = js.native
  /**
    * For integer and double values specifies maxminum allowed value.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * For integer and double values specifies minimum allowed value.
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * Parameter identifier.
    */
  var paramId: js.UndefOr[String] = js.native
  /**
    * Deprecated. This field has no effect.
    */
  var recurse: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. This field has no effect.
    */
  var repeated: js.UndefOr[Boolean] = js.native
  /**
    * Is parameter required.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Parameter type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Description of the requirements for this field, in case the user input
    * does not fulfill the regex pattern or min/max values.
    */
  var validationDescription: js.UndefOr[String] = js.native
  /**
    * URL to a help document to further explain the naming requirements.
    */
  var validationHelpUrl: js.UndefOr[String] = js.native
  /**
    * Regular expression which can be used for parameter validation.
    */
  var validationRegex: js.UndefOr[String] = js.native
}

object SchemaDataSourceParameter {
  @scala.inline
  def apply(): SchemaDataSourceParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceParameter]
  }
  @scala.inline
  implicit class SchemaDataSourceParameterOps[Self <: SchemaDataSourceParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFields(value: js.Array[SchemaDataSourceParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withParamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeated")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
    def withValidationDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationHelpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationHelpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationHelpUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationHelpUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRegex")(js.undefined)
        ret
    }
  }
  
}

