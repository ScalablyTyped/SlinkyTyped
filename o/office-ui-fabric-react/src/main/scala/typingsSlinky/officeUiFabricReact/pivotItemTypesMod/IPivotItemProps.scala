package typingsSlinky.officeUiFabricReact.pivotItemTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPivotItemProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * The aria label of each pivot link which will read by screen reader instead of linkText.
    *
    * Note that unless you have compelling requirements you should not override aria-label.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  /**
    * Props for the header command button. This provides a way to pass in native props, such as data-* and aria-*,
    * for each pivot header/link element.
    */
  var headerButtonProps: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
  /**
    * The text displayed of each pivot link.
    */
  var headerText: js.UndefOr[String] = js.native
  /**
    * Defines an optional item count displayed in parentheses just after the `linkText`.
    *
    * Examples: completed (4), Unread (99+)
    */
  var itemCount: js.UndefOr[Double | String] = js.native
  /**
    * An optional icon to show next to the pivot link.
    */
  var itemIcon: js.UndefOr[String] = js.native
  /**
    * An required key to uniquely identify a pivot item.
    *
    * Note: The 'key' from react props cannot be used inside component.
    */
  var itemKey: js.UndefOr[String] = js.native
  /**
    * Optional keytip for this PivotItem
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * The text displayed of each pivot link - renaming to `headerText`.
    * @deprecated Use `headerText` instead.
    */
  var linkText: js.UndefOr[String] = js.native
  /**
    * Optional custom renderer for the pivot item link
    */
  var onRenderItemLink: js.UndefOr[IRenderFunction[IPivotItemProps]] = js.native
}

object IPivotItemProps {
  @scala.inline
  def apply(): IPivotItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPivotItemProps]
  }
  @scala.inline
  implicit class IPivotItemPropsOps[Self <: IPivotItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderButtonProps(value: StringDictionary[String | Double | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withItemIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withItemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKeytipProps(value: IKeytipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderItemLink(
      value: (/* props */ js.UndefOr[IPivotItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPivotItemProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItemLink")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderItemLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItemLink")(js.undefined)
        ret
    }
  }
  
}

