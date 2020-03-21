package typingsSlinky.halogen.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.halogen.mod.MarginLoaderProps
import typingsSlinky.halogen.mod.PacmanLoaderCls
import typingsSlinky.halogen.mod.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PacmanLoader
  extends ExternalComponentWithAttributesWithRefType[tag.type, PacmanLoaderCls] {
  @JSImport("halogen", "PacmanLoader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, size */
  def apply(
    color: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    verticalAlign: VerticalAlign = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, PacmanLoaderCls] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, PacmanLoaderCls] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.halogen.mod.PacmanLoaderCls](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MarginLoaderProps[Double]
}

