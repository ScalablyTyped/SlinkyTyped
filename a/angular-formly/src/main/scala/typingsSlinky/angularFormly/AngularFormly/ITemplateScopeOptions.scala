package typingsSlinky.angularFormly.AngularFormly

import typingsSlinky.angular.mod.IFormController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITemplateScopeOptions extends js.Object {
  var formControl: IFormController | js.Array[IFormController] = js.native
  var templateOptions: ITemplateOptions = js.native
  var validation: js.Object = js.native
}

object ITemplateScopeOptions {
  @scala.inline
  def apply(
    formControl: IFormController | js.Array[IFormController],
    templateOptions: ITemplateOptions,
    validation: js.Object
  ): ITemplateScopeOptions = {
    val __obj = js.Dynamic.literal(formControl = formControl.asInstanceOf[js.Any], templateOptions = templateOptions.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateScopeOptions]
  }
  @scala.inline
  implicit class ITemplateScopeOptionsOps[Self <: ITemplateScopeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormControl(value: IFormController | js.Array[IFormController]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateOptions(value: ITemplateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidation(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

