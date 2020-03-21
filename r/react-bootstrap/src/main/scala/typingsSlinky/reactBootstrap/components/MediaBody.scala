package typingsSlinky.reactBootstrap.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrap.mediaBodyMod.MediaBodyProps
import typingsSlinky.reactBootstrap.mediaBodyMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MediaBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-bootstrap/lib/MediaBody", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(componentClass: ReactComponentClass[_] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactBootstrap.mediaBodyMod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MediaBodyProps
}

