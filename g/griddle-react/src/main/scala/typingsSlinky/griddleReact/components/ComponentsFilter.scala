package typingsSlinky.griddleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleReact.mod.GriddleFilter
import typingsSlinky.griddleReact.mod.components.Filter
import typingsSlinky.griddleReact.mod.components.FilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsFilter
  extends ExternalComponentWithAttributesWithRefType[tag.type, Filter] {
  @JSImport("griddle-react", "components.Filter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, placeholder, style */
  def apply(setFilter: /* filter */ GriddleFilter => Unit = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, Filter] = {
    val __obj = js.Dynamic.literal()
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1(setFilter))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Filter] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.griddleReact.mod.components.Filter](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FilterProps
}

