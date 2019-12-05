package typingsSlinky.reactDashDataDashGrid.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
import typingsSlinky.reactDashDataDashGrid.Anon_IdText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropDownEditor
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGridPlugins.Editors.DropDownEditor
    ] {
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.DropDownEditor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(options: js.Array[String | Anon_IdText], _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DropDownEditorProps
}

