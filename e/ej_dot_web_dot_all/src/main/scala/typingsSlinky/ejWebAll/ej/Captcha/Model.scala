package typingsSlinky.ejWebAll.ej.Captcha

import typingsSlinky.ejWebAll.ej.HatchStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the character set of the Captcha that will be used to generate captcha text randomly.
    */
  var characterSet: js.UndefOr[String] = js.native
  /** Specifies the error message to be displayed when the Captcha mismatch.
    */
  var customErrorMessage: js.UndefOr[String] = js.native
  /** Set the Captcha validation automatically.
    */
  var enableAutoValidation: js.UndefOr[Boolean] = js.native
  /** Specifies the case sensitivity for the characters typed in the Captcha.
    */
  var enableCaseSensitivity: js.UndefOr[Boolean] = js.native
  /** Specifies the background patterns for the Captcha.
    */
  var enablePattern: js.UndefOr[Boolean] = js.native
  /** Sets the Captcha direction as right to left alignment.
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies the background appearance for the captcha.
    */
  var hatchStyle: js.UndefOr[HatchStyle | String] = js.native
  /** Specifies the height of the Captcha.
    */
  var height: js.UndefOr[Double] = js.native
  /** Specifies the method with values to be mapped in the Captcha.
    */
  var mapper: js.UndefOr[String] = js.native
  /** Specifies the maximum number of characters used in the Captcha.
    */
  var maximumLength: js.UndefOr[Double] = js.native
  /** Specifies the minimum number of characters used in the Captcha.
    */
  var minimumLength: js.UndefOr[Double] = js.native
  /** Fires when captcha refresh begins.
    */
  var refreshBegin: js.UndefOr[js.Function1[/* e */ RefreshBeginEventArgs, Unit]] = js.native
  /** Fires after captcha refresh completed.
    */
  var refreshComplete: js.UndefOr[js.Function1[/* e */ RefreshCompleteEventArgs, Unit]] = js.native
  /** Fires when captcha refresh fails to load.
    */
  var refreshFailure: js.UndefOr[js.Function1[/* e */ RefreshFailureEventArgs, Unit]] = js.native
  /** Fires after captcha refresh succeeded.
    */
  var refreshSuccess: js.UndefOr[js.Function1[/* e */ RefreshSuccessEventArgs, Unit]] = js.native
  /** Specifies the method to map values to Captcha.
    */
  var requestMapper: js.UndefOr[String] = js.native
  /** Sets the Captcha with audio support, that enables to dictate the captcha text.
    */
  var showAudioButton: js.UndefOr[Boolean] = js.native
  /** Sets the Captcha with a refresh button.
    */
  var showRefreshButton: js.UndefOr[Boolean] = js.native
  /** Specifies the target button of the Captcha to validate the entered text and captcha text.
    */
  var targetButton: js.UndefOr[String] = js.native
  /** Specifies the target input element that will verify the Captcha.
    */
  var targetInput: js.UndefOr[String] = js.native
  /** Specifies the width of the Captcha.
    */
  var width: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacterSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterSet")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCaseSensitivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCaseSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCaseSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCaseSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePattern(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withHatchStyle(value: HatchStyle | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hatchStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHatchStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hatchStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapper")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshBegin(value: /* e */ RefreshBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefreshBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshComplete(value: /* e */ RefreshCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefreshComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshFailure(value: /* e */ RefreshFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefreshFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshSuccess(value: /* e */ RefreshSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefreshSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAudioButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAudioButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAudioButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAudioButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRefreshButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRefreshButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRefreshButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRefreshButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInput")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

