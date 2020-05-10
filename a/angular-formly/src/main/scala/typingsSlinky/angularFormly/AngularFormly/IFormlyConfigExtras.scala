package typingsSlinky.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormlyConfigExtras extends js.Object {
  var apiCheckInstance: js.Any = js.native
  var defaultHideDirective: String = js.native
  var disableNgModelAttrsManipulator: Boolean = js.native
  var errorExistsAndShouldBeVisibleExpression: js.Any = js.native
  var explicitAsync: Boolean = js.native
  var fieldTransform: js.Function | js.Array[js.Function] = js.native
  var getFieldId: js.Function = js.native
  var ngModelAttrsManipulatorPreferUnbound: Boolean = js.native
  var removeChromeAutoComplete: Boolean = js.native
}

object IFormlyConfigExtras {
  @scala.inline
  def apply(
    apiCheckInstance: js.Any,
    defaultHideDirective: String,
    disableNgModelAttrsManipulator: Boolean,
    errorExistsAndShouldBeVisibleExpression: js.Any,
    explicitAsync: Boolean,
    fieldTransform: js.Function | js.Array[js.Function],
    getFieldId: js.Function,
    ngModelAttrsManipulatorPreferUnbound: Boolean,
    removeChromeAutoComplete: Boolean
  ): IFormlyConfigExtras = {
    val __obj = js.Dynamic.literal(apiCheckInstance = apiCheckInstance.asInstanceOf[js.Any], defaultHideDirective = defaultHideDirective.asInstanceOf[js.Any], disableNgModelAttrsManipulator = disableNgModelAttrsManipulator.asInstanceOf[js.Any], errorExistsAndShouldBeVisibleExpression = errorExistsAndShouldBeVisibleExpression.asInstanceOf[js.Any], explicitAsync = explicitAsync.asInstanceOf[js.Any], fieldTransform = fieldTransform.asInstanceOf[js.Any], getFieldId = getFieldId.asInstanceOf[js.Any], ngModelAttrsManipulatorPreferUnbound = ngModelAttrsManipulatorPreferUnbound.asInstanceOf[js.Any], removeChromeAutoComplete = removeChromeAutoComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormlyConfigExtras]
  }
  @scala.inline
  implicit class IFormlyConfigExtrasOps[Self <: IFormlyConfigExtras] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiCheckInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheckInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHideDirective(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHideDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableNgModelAttrsManipulator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNgModelAttrsManipulator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorExistsAndShouldBeVisibleExpression(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorExistsAndShouldBeVisibleExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExplicitAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldTransform(value: js.Function | js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFieldId(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgModelAttrsManipulatorPreferUnbound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModelAttrsManipulatorPreferUnbound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveChromeAutoComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChromeAutoComplete")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

