package typingsSlinky.fundamentalDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`1`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`7`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`8`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`9`
import typingsSlinky.fundamentalDashReact.libIdentifierIdentifierMod.IdentifierModifiers
import typingsSlinky.fundamentalDashReact.libIdentifierIdentifierMod.IdentifierProps
import typingsSlinky.fundamentalDashReact.libIdentifierIdentifierMod.IdentifierSizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Identifier
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("fundamental-react/lib/Identifier/Identifier", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    size: IdentifierSizes,
    backgroundImageUrl: String = null,
    color: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    label: String = null,
    modifier: IdentifierModifiers = null,
    role: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IdentifierProps
}

