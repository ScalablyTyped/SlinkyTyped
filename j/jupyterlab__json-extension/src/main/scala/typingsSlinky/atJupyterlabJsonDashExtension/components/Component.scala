package typingsSlinky.atJupyterlabJsonDashExtension.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atJupyterlabJsonDashExtension.libComponentMod.IProps
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Component
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atJupyterlabJsonDashExtension.libComponentMod.Component] {
  @JSImport("@jupyterlab/json-extension/lib/component", "Component")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(data: JSONValue = null, metadata: JSONObject = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atJupyterlabJsonDashExtension.libComponentMod.Component] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.atJupyterlabJsonDashExtension.libComponentMod.Component] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atJupyterlabJsonDashExtension.libComponentMod.Component](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IProps
}

