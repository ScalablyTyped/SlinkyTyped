package typingsSlinky.blueprintjsCore.textAreaMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.react.mod.TextareaHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait ITextAreaProps
  extends TextareaHTMLAttributes[HTMLTextAreaElement]
     with IIntentProps {
  /**
    * Whether the text area should take up the full width of its container.
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Whether the text area should automatically grow vertically to accomodate content.
    */
  var growVertically: js.UndefOr[Boolean] = js.native
  /**
    * Ref handler that receives HTML `<textarea>` element backing this component.
    */
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLTextAreaElement | Null, _]] = js.native
  /**
    * Whether the text area should appear with large styling.
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * Whether the text area should appear with small styling.
    */
  var small: js.UndefOr[Boolean] = js.native
}

object ITextAreaProps {
  @scala.inline
  def apply(): ITextAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextAreaProps]
  }
  @scala.inline
  implicit class ITextAreaPropsOps[Self <: ITextAreaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowVertically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowVertically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growVertically")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRef(value: /* ref */ HTMLTextAreaElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
  }
  
}

