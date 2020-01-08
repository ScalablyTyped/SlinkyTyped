package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.gestaltMod.HeaderProps
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltNumbers.`6`
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.breakWord
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.eggplant
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.green
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.maroon
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.midnight
import typingsSlinky.gestalt.gestaltStrings.navy
import typingsSlinky.gestalt.gestaltStrings.normal
import typingsSlinky.gestalt.gestaltStrings.olive
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.orchid
import typingsSlinky.gestalt.gestaltStrings.pine
import typingsSlinky.gestalt.gestaltStrings.purple
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.watermelon
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Heading
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.gestaltMod.Heading] {
  @JSImport("gestalt", "Heading")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    accessibilityLevel: `1` | `2` | `3` | `4` | `5` | `6` = null,
    color: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white = null,
    lgSize: xs | sm | md | lg | xl = null,
    mdSize: xs | sm | md | lg | xl = null,
    overflow: normal | breakWord = null,
    size: xs | sm | md | lg | xl = null,
    smSize: xs | sm | md | lg | xl = null,
    truncate: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.Heading] = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLevel != null) __obj.updateDynamic("accessibilityLevel")(accessibilityLevel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lgSize != null) __obj.updateDynamic("lgSize")(lgSize.asInstanceOf[js.Any])
    if (mdSize != null) __obj.updateDynamic("mdSize")(mdSize.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (smSize != null) __obj.updateDynamic("smSize")(smSize.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.Heading] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.gestalt.gestaltMod.Heading](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HeaderProps
}

