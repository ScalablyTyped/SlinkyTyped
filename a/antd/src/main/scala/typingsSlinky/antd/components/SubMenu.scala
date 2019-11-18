package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esMenuSubMenuMod.SubMenuProps
import typingsSlinky.antd.esMenuSubMenuMod.TitleEventEntity
import typingsSlinky.antd.esMenuSubMenuMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, disabled */
object SubMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esMenuSubMenuMod.default].asInstanceOf[String | js.Object]
  def apply(
    onTitleClick: /* e */ TitleEventEntity => Unit = null,
    onTitleMouseEnter: /* e */ TitleEventEntity => Unit = null,
    onTitleMouseLeave: /* e */ TitleEventEntity => Unit = null,
    popupClassName: String = null,
    popupOffset: js.Tuple2[Double, Double] = null,
    rootPrefixCls: String = null,
    style: CSSProperties = null,
    title: TagMod[Any] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1(onTitleClick))
    if (onTitleMouseEnter != null) __obj.updateDynamic("onTitleMouseEnter")(js.Any.fromFunction1(onTitleMouseEnter))
    if (onTitleMouseLeave != null) __obj.updateDynamic("onTitleMouseLeave")(js.Any.fromFunction1(onTitleMouseLeave))
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SubMenuProps
}

