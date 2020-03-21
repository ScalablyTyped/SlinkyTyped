package typingsSlinky.jupyterlabExtensionmanager.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar] {
  @JSImport("@jupyterlab/extensionmanager", "SearchBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(placeholder: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar] = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IProperties
}

