package typingsSlinky.officeUiFabricReact.suggestionsTypesMod

import typingsSlinky.officeUiFabricReact.spinnerTypesMod.ISpinnerStyleProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsSubComponentStyles extends js.Object {
  /** Refers to the Spinner rendered within the Suggestions when searching or loading suggestions. */
  var spinner: IStyleFunctionOrObject[ISpinnerStyleProps, _] = js.native
}

object ISuggestionsSubComponentStyles {
  @scala.inline
  def apply(spinner: IStyleFunctionOrObject[ISpinnerStyleProps, _]): ISuggestionsSubComponentStyles = {
    val __obj = js.Dynamic.literal(spinner = spinner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsSubComponentStyles]
  }
  @scala.inline
  implicit class ISuggestionsSubComponentStylesOps[Self <: ISuggestionsSubComponentStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpinnerFunction1(value: ISpinnerStyleProps => Partial[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpinner(value: IStyleFunctionOrObject[ISpinnerStyleProps, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

