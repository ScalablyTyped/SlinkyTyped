package typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`100`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`200`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`300`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`400`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`500`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`600`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`700`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`800`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`900`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`line-through`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`underline line-through`
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.bold
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.italic
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.none
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.normal
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismThemeEntry extends /* styleKey */ StringDictionary[String | Double | Unit] {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.undefined
}

object PrismThemeEntry {
  @scala.inline
  def apply(
    StringDictionary: /* styleKey */ StringDictionary[String | Double | Unit] = null,
    backgroundColor: String = null,
    color: String = null,
    fontStyle: normal | italic = null,
    fontWeight: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` = null,
    opacity: Int | Double = null,
    textDecorationLine: none | underline | `line-through` | (`underline line-through`) = null
  ): PrismThemeEntry = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (textDecorationLine != null) __obj.updateDynamic("textDecorationLine")(textDecorationLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismThemeEntry]
  }
}

