package typingsSlinky.angularAgility.aa

import typingsSlinky.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormExtensionsProvider extends IServiceProvider {
  var defaultFieldGroupStrategy: String = js.native
  var defaultLabelStrategy: String = js.native
  var defaultNotifyTarget: String = js.native
  var defaultOnNavigateAwayStrategy: String = js.native
  var defaultSpinnerClickStrategy: String = js.native
  var defaultValMsgPlacementStrategy: String = js.native
  var fieldGroupStrategies: IFieldGroupStrategies = js.native
  var globalSettings: IGlobalSettings = js.native
  var labelStrategies: ILabelStrategies = js.native
  var onNavigateAwayStrategies: IOnNavigateAwayStrategies = js.native
  var spinnerClickStrategies: ISpinnerClickStrategies = js.native
  var valMsgForTemplate: String = js.native
  var valMsgPlacementStrategies: IValMsgPlacementStrategies = js.native
  var validIconStrategy: IValidIconStrategy = js.native
  var validationMessages: IValidationMessages = js.native
  def confirmResetStrategy(): Boolean = js.native
}

object IFormExtensionsProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    confirmResetStrategy: () => Boolean,
    defaultFieldGroupStrategy: String,
    defaultLabelStrategy: String,
    defaultNotifyTarget: String,
    defaultOnNavigateAwayStrategy: String,
    defaultSpinnerClickStrategy: String,
    defaultValMsgPlacementStrategy: String,
    fieldGroupStrategies: IFieldGroupStrategies,
    globalSettings: IGlobalSettings,
    labelStrategies: ILabelStrategies,
    onNavigateAwayStrategies: IOnNavigateAwayStrategies,
    spinnerClickStrategies: ISpinnerClickStrategies,
    valMsgForTemplate: String,
    valMsgPlacementStrategies: IValMsgPlacementStrategies,
    validIconStrategy: IValidIconStrategy,
    validationMessages: IValidationMessages
  ): IFormExtensionsProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], confirmResetStrategy = js.Any.fromFunction0(confirmResetStrategy), defaultFieldGroupStrategy = defaultFieldGroupStrategy.asInstanceOf[js.Any], defaultLabelStrategy = defaultLabelStrategy.asInstanceOf[js.Any], defaultNotifyTarget = defaultNotifyTarget.asInstanceOf[js.Any], defaultOnNavigateAwayStrategy = defaultOnNavigateAwayStrategy.asInstanceOf[js.Any], defaultSpinnerClickStrategy = defaultSpinnerClickStrategy.asInstanceOf[js.Any], defaultValMsgPlacementStrategy = defaultValMsgPlacementStrategy.asInstanceOf[js.Any], fieldGroupStrategies = fieldGroupStrategies.asInstanceOf[js.Any], globalSettings = globalSettings.asInstanceOf[js.Any], labelStrategies = labelStrategies.asInstanceOf[js.Any], onNavigateAwayStrategies = onNavigateAwayStrategies.asInstanceOf[js.Any], spinnerClickStrategies = spinnerClickStrategies.asInstanceOf[js.Any], valMsgForTemplate = valMsgForTemplate.asInstanceOf[js.Any], valMsgPlacementStrategies = valMsgPlacementStrategies.asInstanceOf[js.Any], validIconStrategy = validIconStrategy.asInstanceOf[js.Any], validationMessages = validationMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormExtensionsProvider]
  }
  @scala.inline
  implicit class IFormExtensionsProviderOps[Self <: IFormExtensionsProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmResetStrategy(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmResetStrategy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultFieldGroupStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFieldGroupStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLabelStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabelStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultNotifyTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNotifyTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOnNavigateAwayStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOnNavigateAwayStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSpinnerClickStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSpinnerClickStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValMsgPlacementStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValMsgPlacementStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldGroupStrategies(value: IFieldGroupStrategies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldGroupStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalSettings(value: IGlobalSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelStrategies(value: ILabelStrategies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnNavigateAwayStrategies(value: IOnNavigateAwayStrategies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigateAwayStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinnerClickStrategies(value: ISpinnerClickStrategies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerClickStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValMsgForTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valMsgForTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValMsgPlacementStrategies(value: IValMsgPlacementStrategies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valMsgPlacementStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidIconStrategy(value: IValidIconStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validIconStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationMessages(value: IValidationMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

