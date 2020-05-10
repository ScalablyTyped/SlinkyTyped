package typingsSlinky.officeUiFabricReact.commandBarTypesMod

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandBarItemProps extends IContextualMenuItem {
  /**
    * Custom styles for individual button
    */
  var buttonStyles: js.UndefOr[IButtonStyles] = js.native
  /**
    * A custom cache key to be used for this item. If `cacheKey` is changed, the cache will invalidate.
    * Defaults to `key` value.
    */
  var cacheKey: js.UndefOr[String] = js.native
  /**
    * Method to override the render of the individual command bar button.
    * Not used when item is rendered in overflow.
    * @defaultvalue CommandBarButton
    */
  var commandBarButtonAs: js.UndefOr[IComponentAs[ICommandBarItemProps]] = js.native
  /**
    * Show only an icon for this item, not text.
    * Does not apply if item is in the overflow.
    * @defaultvalue false
    */
  var iconOnly: js.UndefOr[Boolean] = js.native
  /**
    * Context under which the item is being rendered.
    * This value is mutated by the CommandBar and is useful for adjusting the `onRender` function.
    */
  var renderedInOverflow: js.UndefOr[Boolean] = js.native
  /**
    * Props for the tooltip when in `iconOnly` mode.
    */
  var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.native
}

object ICommandBarItemProps {
  @scala.inline
  def apply(key: String): ICommandBarItemProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarItemProps]
  }
  @scala.inline
  implicit class ICommandBarItemPropsOps[Self <: ICommandBarItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonStyles(value: IButtonStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandBarButtonAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[ICommandBarItemProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandBarButtonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandBarButtonAsComponentClass(value: ReactComponentClass[IComponentAsProps[ICommandBarItemProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandBarButtonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandBarButtonAs(value: IComponentAs[ICommandBarItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandBarButtonAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandBarButtonAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandBarButtonAs")(js.undefined)
        ret
    }
    @scala.inline
    def withIconOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderedInOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedInOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderedInOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedInOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipHostProps(value: ITooltipHostProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHostProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipHostProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHostProps")(js.undefined)
        ret
    }
  }
  
}

