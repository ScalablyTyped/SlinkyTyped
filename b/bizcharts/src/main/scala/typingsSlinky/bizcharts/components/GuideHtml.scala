package typingsSlinky.bizcharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.bizcharts.bizchartsMod.AlignXType
import typingsSlinky.bizcharts.bizchartsMod.AlignYType
import typingsSlinky.bizcharts.bizchartsMod.Guide.Html
import typingsSlinky.bizcharts.bizchartsMod.Guide.HtmlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideHtml
  extends ExternalComponentWithAttributesWithRefType[tag.type, Html] {
  @JSImport("bizcharts", "Guide.Html")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    alignX: AlignXType = null,
    alignY: AlignYType = null,
    html: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    position: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    zIndex: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Html] = {
    val __obj = js.Dynamic.literal()
    if (alignX != null) __obj.updateDynamic("alignX")(alignX.asInstanceOf[js.Any])
    if (alignY != null) __obj.updateDynamic("alignY")(alignY.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Html] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.bizcharts.bizchartsMod.Guide.Html](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HtmlProps
}

