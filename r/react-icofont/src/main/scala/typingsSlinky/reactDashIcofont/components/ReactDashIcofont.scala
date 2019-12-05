package typingsSlinky.reactDashIcofont.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashIcofont.reactDashIcofontMod.IcofontProps
import typingsSlinky.reactDashIcofont.reactDashIcofontMod.default
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`10`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`180`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`1`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`270`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`2`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`3`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`4`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`5`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`6`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`7`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`8`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`90`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.`9`
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.h
import typingsSlinky.reactDashIcofont.reactDashIcofontStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashIcofont
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-icofont", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    icon: String,
    flip: h | v = null,
    rotate: `90` | `180` | `270` = null,
    size: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IcofontProps
}

