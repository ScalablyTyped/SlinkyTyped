package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.gestaltMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.gestaltMod.Card] {
  @JSImport("gestalt", "Card")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onMouseEnter, onMouseLeave */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    image: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.Card] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.Card] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.gestalt.gestaltMod.Card](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CardProps
}

