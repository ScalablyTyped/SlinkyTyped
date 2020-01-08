package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.rechartsMod.TextProps
import typingsSlinky.recharts.rechartsStrings.end
import typingsSlinky.recharts.rechartsStrings.inherit
import typingsSlinky.recharts.rechartsStrings.middle
import typingsSlinky.recharts.rechartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.Text] {
  @JSImport("recharts", "Text")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    angle: Int | Double = null,
    capHeight: String = null,
    lineHeight: String = null,
    scaleToFit: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    textAnchor: start | middle | end | inherit = null,
    verticalAnchor: start | middle | end = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.Text] = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleToFit)) __obj.updateDynamic("scaleToFit")(scaleToFit.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (verticalAnchor != null) __obj.updateDynamic("verticalAnchor")(verticalAnchor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.Text] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.rechartsMod.Text](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TextProps
}

