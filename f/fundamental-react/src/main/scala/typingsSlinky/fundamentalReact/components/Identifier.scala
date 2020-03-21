package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`1`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`2`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`3`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`4`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`5`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`6`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`7`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`8`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`9`
import typingsSlinky.fundamentalReact.identifierMod.IdentifierModifiers
import typingsSlinky.fundamentalReact.identifierMod.IdentifierProps
import typingsSlinky.fundamentalReact.identifierMod.IdentifierSizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Identifier
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("fundamental-react/lib/Identifier/Identifier", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, label */
  def apply(
    size: IdentifierSizes,
    backgroundImageUrl: String = null,
    color: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    modifier: IdentifierModifiers = null,
    role: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IdentifierProps
}

