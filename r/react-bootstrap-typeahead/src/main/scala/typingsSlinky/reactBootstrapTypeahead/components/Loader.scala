package typingsSlinky.reactBootstrapTypeahead.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrapTypeahead.mod.LoaderProps
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadBsSizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Loader
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-bootstrap-typeahead", "Loader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(bsSize: TypeaheadBsSizes, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(bsSize = bsSize.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LoaderProps
}

