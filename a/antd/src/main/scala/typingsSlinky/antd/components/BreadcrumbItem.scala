package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.a.tag
import typingsSlinky.antd.esBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps
import typingsSlinky.antd.esBreadcrumbBreadcrumbItemMod.default
import typingsSlinky.antd.esDropdownDropdownMod.OverlayFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esBreadcrumbBreadcrumbItemMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: href, onClick */
  def apply(
    overlay: TagMod[Any] | OverlayFunc = null,
    prefixCls: String = null,
    separator: TagMod[Any] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BreadcrumbItemProps
}

