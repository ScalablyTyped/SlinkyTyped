package typingsSlinky.blueprintjsCore.buttonGroupMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.blueprintjsCore.alignmentMod.Alignment
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IButtonGroupProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Text alignment within button. By default, icons and text will be centered
    * within the button. Passing `"left"` or `"right"` will align the button
    * text to that side and push `icon` and `rightIcon` to either edge. Passing
    * `"center"` will center the text and icons together.
    */
  var alignText: js.UndefOr[Alignment] = js.native
  /**
    * Whether the button group should take up the full width of its container.
    * @default false
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Whether the child buttons should appear with large styling.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * Whether the child buttons should appear with minimal styling.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.native
  /**
    * Whether the button group should appear with vertical styling.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object IButtonGroupProps {
  @scala.inline
  def apply(): IButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonGroupProps]
  }
  @scala.inline
  implicit class IButtonGroupPropsOps[Self <: IButtonGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignText(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignText")(js.undefined)
        ret
    }
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
    def withMinimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

