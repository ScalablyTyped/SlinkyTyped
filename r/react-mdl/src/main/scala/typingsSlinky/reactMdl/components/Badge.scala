package typingsSlinky.reactMdl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMdl.mod.BadgeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMdl.mod.Badge] {
  @JSImport("react-mdl", "Badge")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    text: String | Double,
    noBackground: js.UndefOr[Boolean] = js.undefined,
    overlap: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMdl.mod.Badge] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(noBackground)) __obj.updateDynamic("noBackground")(noBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BadgeProps
}

