package typingsSlinky.reactDataGrid.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
import typingsSlinky.reactDataGrid.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropDownEditor
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.Editors.DropDownEditor
    ] {
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.DropDownEditor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(options: js.Array[String | AnonText], _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DropDownEditorProps
}

