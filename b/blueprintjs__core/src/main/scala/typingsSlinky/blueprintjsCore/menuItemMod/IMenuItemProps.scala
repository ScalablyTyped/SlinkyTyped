package typingsSlinky.blueprintjsCore.menuItemMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.anon.PartialIPopoverProps
import typingsSlinky.blueprintjsCore.propsMod.IActionProps
import typingsSlinky.blueprintjsCore.propsMod.ILinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuItemProps
  extends IActionProps
     with ILinkProps {
  /** Whether this menu item should appear with an active state. */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Children of this component will be rendered in a __submenu__ that appears when hovering or
    * clicking on this menu item.
    *
    * Use `text` prop for the content of the menu item itself.
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Right-aligned label text content, useful for displaying hotkeys.
    *
    * This prop actually supports JSX elements, but TypeScript will throw an error because
    * `HTMLAttributes` only allows strings. Use `labelElement` to supply a JSX element in TypeScript.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * A space-delimited list of class names to pass along to the right-aligned label wrapper element.
    */
  var labelClassName: js.UndefOr[String] = js.native
  /**
    * Right-aligned label content, useful for displaying hotkeys.
    */
  var labelElement: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Whether the text should be allowed to wrap to multiple lines.
    * If `false`, text will be truncated with an ellipsis when it reaches `max-width`.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.native
  /**
    * Props to spread to `Popover`. Note that `content` and `minimal` cannot be
    * changed and `usePortal` defaults to `false` so all submenus will live in
    * the same container.
    */
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
  /**
    * Whether an enabled item without a submenu should automatically close its parent popover when clicked.
    * @default true
    */
  var shouldDismissPopover: js.UndefOr[Boolean] = js.native
  /**
    * Name of the HTML tag that wraps the MenuItem.
    * @default "a"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  /**
    * A space-delimited list of class names to pass along to the text wrapper element.
    */
  var textClassName: js.UndefOr[String] = js.native
  /** Item text, required for usability. */
  @JSName("text")
  var text_IMenuItemProps: TagMod[Any] = js.native
}

object IMenuItemProps {
  @scala.inline
  def apply(): IMenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuItemProps]
  }
  @scala.inline
  implicit class IMenuItemPropsOps[Self <: IMenuItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withLabelClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClassName")(js.undefined)
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
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverProps(value: PartialIPopoverProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldDismissPopover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDismissPopover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldDismissPopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDismissPopover")(js.undefined)
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
    @scala.inline
    def withText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textClassName")(js.undefined)
        ret
    }
  }
  
}

