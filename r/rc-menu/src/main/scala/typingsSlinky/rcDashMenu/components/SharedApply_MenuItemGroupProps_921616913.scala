package typingsSlinky.rcDashMenu.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashMenu.esMenuItemGroupMod.MenuItemGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_MenuItemGroupProps_921616913[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    index: Int | Double = null,
    renderMenuItem: (/* item */ ReactElement, /* index */ Double, /* key */ String) => ReactElement = null,
    rootPrefixCls: String = null,
    subMenuKey: String = null,
    title: String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (renderMenuItem != null) __obj.updateDynamic("renderMenuItem")(js.Any.fromFunction3(renderMenuItem))
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (subMenuKey != null) __obj.updateDynamic("subMenuKey")(subMenuKey.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuItemGroupProps
}

