package typingsSlinky.officeUiFabricReact.textFieldTypesMod

import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldSubComponentStyles extends js.Object {
  /**
    * Styling for Label child component.
    */
  var label: IStyleFunctionOrObject[_, _] = js.native
}

object ITextFieldSubComponentStyles {
  @scala.inline
  def apply(label: IStyleFunctionOrObject[_, _]): ITextFieldSubComponentStyles = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldSubComponentStyles]
  }
  @scala.inline
  implicit class ITextFieldSubComponentStylesOps[Self <: ITextFieldSubComponentStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelFunction1(value: _ => Partial[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: IStyleFunctionOrObject[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

