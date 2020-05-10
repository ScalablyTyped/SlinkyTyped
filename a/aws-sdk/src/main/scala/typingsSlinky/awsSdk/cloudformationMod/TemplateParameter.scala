package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateParameter extends js.Object {
  /**
    * The default value associated with the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.native
  /**
    * User defined description associated with the parameter.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
    */
  var NoEcho: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NoEcho] = js.native
  /**
    * The name associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ParameterKey] = js.native
}

object TemplateParameter {
  @scala.inline
  def apply(): TemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateParameter]
  }
  @scala.inline
  implicit class TemplateParameterOps[Self <: TemplateParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: ParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withNoEcho(value: NoEcho): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoEcho")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEcho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoEcho")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterKey(value: ParameterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterKey")(js.undefined)
        ret
    }
  }
  
}

