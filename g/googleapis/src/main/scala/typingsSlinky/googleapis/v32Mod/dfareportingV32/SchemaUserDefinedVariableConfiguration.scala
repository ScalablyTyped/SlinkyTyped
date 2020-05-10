package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Defined Variable configuration.
  */
@js.native
trait SchemaUserDefinedVariableConfiguration extends js.Object {
  /**
    * Data type for the variable. This is a required field.
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * User-friendly name for the variable which will appear in reports. This is
    * a required field, must be less than 64 characters long, and cannot
    * contain the following characters: &quot;&quot;&lt;&gt;&quot;.
    */
  var reportName: js.UndefOr[String] = js.native
  /**
    * Variable name in the tag. This is a required field.
    */
  var variableType: js.UndefOr[String] = js.native
}

object SchemaUserDefinedVariableConfiguration {
  @scala.inline
  def apply(): SchemaUserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDefinedVariableConfiguration]
  }
  @scala.inline
  implicit class SchemaUserDefinedVariableConfigurationOps[Self <: SchemaUserDefinedVariableConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withReportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableType")(js.undefined)
        ret
    }
  }
  
}

