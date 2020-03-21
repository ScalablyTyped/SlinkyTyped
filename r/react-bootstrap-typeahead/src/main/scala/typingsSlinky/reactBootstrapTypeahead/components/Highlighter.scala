package typingsSlinky.reactBootstrapTypeahead.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrapTypeahead.mod.HighligherProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Highlighter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Highlighter] {
  @JSImport("react-bootstrap-typeahead", "Highlighter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(search: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Highlighter] = {
    val __obj = js.Dynamic.literal()
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Highlighter] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactBootstrapTypeahead.mod.Highlighter](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HighligherProps
}

