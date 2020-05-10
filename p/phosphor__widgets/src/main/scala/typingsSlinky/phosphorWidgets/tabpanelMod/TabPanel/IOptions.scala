package typingsSlinky.phosphorWidgets.tabpanelMod.TabPanel

import typingsSlinky.phosphorWidgets.tabbarMod.TabBar.IRenderer
import typingsSlinky.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a tab panel.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The renderer for the panel's tab bar.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer[Widget]] = js.native
  /**
    * The placement of the tab bar relative to the content.
    *
    * The default is `'top'`.
    */
  var tabPlacement: js.UndefOr[TabPlacement] = js.native
  /**
    * Whether the tabs are movable by the user.
    *
    * The default is `false`.
    */
  var tabsMovable: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderer(value: IRenderer[Widget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withTabPlacement(value: TabPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withTabsMovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsMovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabsMovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsMovable")(js.undefined)
        ret
    }
  }
  
}

