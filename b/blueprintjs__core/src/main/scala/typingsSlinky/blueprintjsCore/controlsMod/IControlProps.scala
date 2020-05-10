package typingsSlinky.blueprintjsCore.controlsMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.alignmentMod.Alignment
import typingsSlinky.react.mod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IControlProps extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * Alignment of the indicator within container.
    * @default Alignment.LEFT
    */
  var alignIndicator: js.UndefOr[Alignment] = js.native
  /** Whether the control should appear as an inline element. */
  var `inline`: js.UndefOr[Boolean] = js.native
  /** Ref handler that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.native
  /**
    * Text label for the control.
    *
    * Use `children` or `labelElement` to supply JSX content. This prop actually supports JSX elements,
    * but TypeScript will throw an error because `HTMLAttributes` only allows strings.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * JSX Element label for the control.
    *
    * This prop is a workaround for TypeScript consumers as the type definition for `label` only
    * accepts strings. JavaScript consumers can provide a JSX element directly to `label`.
    */
  var labelElement: js.UndefOr[TagMod[Any]] = js.native
  /** Whether this control should use large styles. */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * Name of the HTML tag that wraps the checkbox.
    *
    * By default a `<label>` is used, which effectively enlarges the click
    * target to include all of its children. Supply a different tag name if
    * this behavior is undesirable or you're listening to click events from a
    * parent element (as the label can register duplicate clicks).
    *
    * @default "label"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}

object IControlProps {
  @scala.inline
  def apply(): IControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IControlProps]
  }
  @scala.inline
  implicit class IControlPropsOps[Self <: IControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignIndicator(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRef(value: /* ref */ HTMLInputElement | Null => _): Self = {
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelElement(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelElement")(js.undefined)
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
    def withTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
  }
  
}

