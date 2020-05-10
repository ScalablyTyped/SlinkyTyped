package typingsSlinky.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers on the AJAX call request beginning.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggers when the AJAX call request failure.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Triggers on the success of AJAX call request.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.native
  /** Sets the data type for the ajax call used within the SpellCheck control, denoting the type of data that are expected to be retrieved from the server. The applicable values are
    * json and jsonp.
    * @Default {jsonp}
    */
  var ajaxDataType: js.UndefOr[String] = js.native
  /** To set either â€˜Postâ€™ or â€˜Getâ€™ for ajax request type which invokes when validate, get suggestion and dictionary action.Possible values are â€˜POSTâ€™ or â€˜GETâ€™
    * @Default {GET}
    */
  var ajaxRequestType: js.UndefOr[String] = js.native
  /** Triggers when the spell check operations completed through dialog mode.
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.native
  /** Triggers when the context menu item clicked.
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.native
  /** Holds all options related to the context menu settings of SpellCheck.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggers before context menu opening.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.native
  /** It allows to spell check the multiple target HTML element's texts and correct its error words.
    * @Default {null}
    */
  var controlsToValidate: js.UndefOr[String] = js.native
  /** Triggers before the spell check dialog opens.
    */
  var dialogBeforeOpen: js.UndefOr[js.Function1[/* e */ DialogBeforeOpenEventArgs, Unit]] = js.native
  /** Triggers when the spell check dialog closed.
    */
  var dialogClose: js.UndefOr[js.Function1[/* e */ DialogCloseEventArgs, Unit]] = js.native
  /** Triggers after the spell check dialog opens.
    */
  var dialogOpen: js.UndefOr[js.Function1[/* e */ DialogOpenEventArgs, Unit]] = js.native
  /** It includes the service method path to find the error words and its suggestions also adding the custom word into the custom dictionary.
    */
  var dictionarySettings: js.UndefOr[DictionarySettings] = js.native
  /** When set to true, allows sending Asynchronous ajax request for checking the spelling errors.
    * @Default {true}
    */
  var enableAsync: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the spellcheck operation on Enter/Space key-press.
    * @Default {false}
    */
  var enableValidateOnType: js.UndefOr[Boolean] = js.native
  /** It helps to ignore the uppercase, mixed case words, alpha numeric words, file path and email addresses based on the property values.
    */
  var ignoreSettings: js.UndefOr[IgnoreSettings] = js.native
  /** To ignore the words from the error word consideration.
    * @Default {[]}
    */
  var ignoreWords: js.UndefOr[js.Array[_]] = js.native
  /** When set to true, allows the spellcheck to render based upon screen size.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Sets the specific culture to the SpellCheck.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** To set the maximum suggestion display count.
    * @Default {6}
    */
  var maxSuggestionCount: js.UndefOr[Double] = js.native
  /** To display the error word in a customized style.
    * @Default {e-errorword}
    */
  var misspellWordCss: js.UndefOr[String] = js.native
  /** Triggers when the dialog mode spell check starting.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
  /** Triggers before loading the target HTML element text into the dialog sentence area.
    */
  var targetUpdating: js.UndefOr[js.Function1[/* e */ TargetUpdatingEventArgs, Unit]] = js.native
  /** Triggers when the spell check control performing the spell check operations such as ignore, ignoreAll, change, changeAll and addToDictionary.
    */
  var validating: js.UndefOr[js.Function1[/* e */ ValidatingEventArgs, Unit]] = js.native
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
    def withActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withActionSuccess(value: /* e */ ActionSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequestType")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* e */ CompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextClick")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuSettings(value: ContextMenuSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsToValidate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsToValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsToValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsToValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogBeforeOpen(value: /* e */ DialogBeforeOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogBeforeOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDialogBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogBeforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogClose(value: /* e */ DialogCloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDialogClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogClose")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogOpen(value: /* e */ DialogOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDialogOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionarySettings(value: DictionarySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionarySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionarySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionarySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableValidateOnType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableValidateOnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableValidateOnType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableValidateOnType")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSettings(value: IgnoreSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreWords(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWords")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSuggestionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSuggestionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMisspellWordCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misspellWordCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMisspellWordCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misspellWordCss")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* e */ StartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUpdating(value: /* e */ TargetUpdatingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUpdating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTargetUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withValidating(value: /* e */ ValidatingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validating")(js.undefined)
        ret
    }
  }
  
}

