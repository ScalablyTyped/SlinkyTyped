package typingsSlinky.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteOptions extends js.Object {
  /**
    * Indicate if the autocomplete is going to be strict case-sensitive to match the options.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * Indicate the KeyCodes for trigger confirm completion, by default those keys are: `[39, 35, 9]` which are the code for `[right, end, tab]`.
    * @default [39, 35, 9]
    */
  var confirmKeys: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Pick one of the two strategies, or define a custom filter function.
    *
    * 'start': Match your input from the start, e.g. 'ap' matches 'apple' but 'pl' does not.
    *
    * 'contain': Contains the user's input or not, e.g. 'pl' matches 'apple' too.
    */
  var filter: js.UndefOr[AutoCompleteMatchingStrategy | (js.Function1[/* query */ String, Boolean])] = js.native
  /**
    * This function will return your possible options for create the autocomplete selection,
    * you can control dynamically which options you want to display according to the current active editing node.
    * @param text The text in the current node part (basically the text that the user is editing).
    * @param path The path of the node that is being edited as an array.
    * @param input Can be 'field' or 'value' depending if the user is editing a field name or a value of a node.
    * @param editor The editor instance object that is being edited.
    */
  var getOptions: js.UndefOr[
    js.Function4[
      /* text */ String, 
      /* path */ JSONPath, 
      /* input */ AutoCompleteElementType, 
      /* editor */ JSONEditor, 
      AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]
    ]
  ] = js.native
  /**
    * Indicate the way to trigger autocomplete menu.
    *
    * 'keydown': When you type something in the field or value, it will trigger autocomplete immediately.
    *
    * 'focus': When you focus in the field or value, it will trigger the autocomplete.
    * @default 'keydown'
    */
  var trigger: js.UndefOr[AutoCompleteTrigger] = js.native
}

object AutoCompleteOptions {
  @scala.inline
  def apply(): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteOptions]
  }
  @scala.inline
  implicit class AutoCompleteOptionsOps[Self <: AutoCompleteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmKeys(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(value: /* query */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: AutoCompleteMatchingStrategy | (js.Function1[/* query */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptions(
      value: (/* text */ String, /* path */ JSONPath, /* input */ AutoCompleteElementType, /* editor */ JSONEditor) => AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: AutoCompleteTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

