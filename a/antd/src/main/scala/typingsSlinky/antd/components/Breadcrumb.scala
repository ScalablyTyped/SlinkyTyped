package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.esBreadcrumbBreadcrumbMod.Route
import typingsSlinky.antd.esBreadcrumbMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esBreadcrumbMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className */
  def apply(
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => TagMod[Any] = null,
    params: js.Any = null,
    prefixCls: String = null,
    routes: js.Array[Route] = null,
    separator: TagMod[Any] = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BreadcrumbProps
}

