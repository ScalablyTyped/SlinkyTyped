package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.menuItemMod.MenuItem
import typingsSlinky.primereact.slideMenuMod.SlideMenuProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SlideMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactSlidemenuMod.SlideMenu] {
  @JSImport("primereact/slidemenu", "SlideMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    backLabel: String = null,
    baseZIndex: Int | Double = null,
    easing: String = null,
    effectDuration: Int | Double = null,
    menuWidth: Int | Double = null,
    model: js.Array[MenuItem] = null,
    onHide: /* e */ Event_ => Unit = null,
    onShow: /* e */ Event_ => Unit = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    viewportHeight: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactSlidemenuMod.SlideMenu] = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (backLabel != null) __obj.updateDynamic("backLabel")(backLabel.asInstanceOf[js.Any])
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (effectDuration != null) __obj.updateDynamic("effectDuration")(effectDuration.asInstanceOf[js.Any])
    if (menuWidth != null) __obj.updateDynamic("menuWidth")(menuWidth.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewportHeight != null) __obj.updateDynamic("viewportHeight")(viewportHeight.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactSlidemenuMod.SlideMenu] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactSlidemenuMod.SlideMenu](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SlideMenuProps
}

