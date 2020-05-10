package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * Specifies the valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * Indicates when to apply parameter updates.
    */
  var ApplyMethod: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.ApplyMethod] = js.native
  /**
    * Specifies the engine specific parameters type.
    */
  var ApplyType: js.UndefOr[String] = js.native
  /**
    * Specifies the valid data type for the parameter.
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * Provides a description of the parameter.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    *  Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  /**
    * The earliest engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * Specifies the value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  /**
    * Indicates the source of the parameter value.
    */
  var Source: js.UndefOr[String] = js.native
}

object Parameter {
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyMethod(value: ApplyMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModifiable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsModifiable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModifiable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsModifiable")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumEngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
        ret
    }
  }
  
}

