package typingsSlinky.jsoneditorDashForDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.jsoneditorDashForDashReact.jsoneditorDashForDashReactMod.ReactJsonEditorProps
import typingsSlinky.jsoneditorDashForDashReact.jsoneditorDashForDashReactMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object JsoneditorDashForDashReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("jsoneditor-for-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactJsonEditorProps
}

