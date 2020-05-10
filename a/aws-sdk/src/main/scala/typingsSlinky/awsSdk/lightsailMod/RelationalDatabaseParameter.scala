package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseParameter extends js.Object {
  /**
    * Specifies the valid range of values for the parameter.
    */
  var allowedValues: js.UndefOr[String] = js.native
  /**
    * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
    */
  var applyMethod: js.UndefOr[String] = js.native
  /**
    * Specifies the engine-specific parameter type.
    */
  var applyType: js.UndefOr[String] = js.native
  /**
    * Specifies the valid data type for the parameter.
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * Provides a description of the parameter.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A Boolean value indicating whether the parameter can be modified.
    */
  var isModifiable: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the name of the parameter.
    */
  var parameterName: js.UndefOr[String] = js.native
  /**
    * Specifies the value of the parameter.
    */
  var parameterValue: js.UndefOr[String] = js.native
}

object RelationalDatabaseParameter {
  @scala.inline
  def apply(): RelationalDatabaseParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseParameter]
  }
  @scala.inline
  implicit class RelationalDatabaseParameterOps[Self <: RelationalDatabaseParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValues(value: String): Self = {
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
    def withApplyMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
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
    def withIsModifiable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModifiable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModifiable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModifiable")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValue")(js.undefined)
        ret
    }
  }
  
}

