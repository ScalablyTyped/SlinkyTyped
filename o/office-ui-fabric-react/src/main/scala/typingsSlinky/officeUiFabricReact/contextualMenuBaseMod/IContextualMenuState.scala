package typingsSlinky.officeUiFabricReact.contextualMenuBaseMod

import org.scalajs.dom.raw.Element
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuState extends js.Object {
  var contextualMenuItems: js.UndefOr[js.Array[IContextualMenuItem]] = js.native
  var contextualMenuTarget: js.UndefOr[Element] = js.native
  var dismissedMenuItemKey: js.UndefOr[String] = js.native
  /** True if the menu was expanded by mouse click OR hover (as opposed to by keyboard) */
  var expandedByMouseClick: js.UndefOr[Boolean] = js.native
  var expandedMenuItemKey: js.UndefOr[String] = js.native
  var positions: js.UndefOr[js.Any] = js.native
  var slideDirectionalClassName: js.UndefOr[String] = js.native
  var subMenuId: js.UndefOr[String] = js.native
  var submenuDirection: js.UndefOr[DirectionalHint] = js.native
  var submenuTarget: js.UndefOr[Element] = js.native
}

object IContextualMenuState {
  @scala.inline
  def apply(): IContextualMenuState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualMenuState]
  }
  @scala.inline
  implicit class IContextualMenuStateOps[Self <: IContextualMenuState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextualMenuItems(value: js.Array[IContextualMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextualMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withContextualMenuTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextualMenuTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissedMenuItemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedMenuItemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissedMenuItemKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedMenuItemKey")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedByMouseClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedByMouseClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedByMouseClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedByMouseClick")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedMenuItemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedMenuItemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedMenuItemKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedMenuItemKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPositions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideDirectionalClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDirectionalClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDirectionalClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDirectionalClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenuDirection(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenuDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenuTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenuTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuTarget")(js.undefined)
        ret
    }
  }
  
}

