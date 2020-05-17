package typingsSlinky.reactDataGrid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
import typingsSlinky.reactDataGrid.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropDownEditor {
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.DropDownEditor")
  @js.native
  object component extends js.Object
  
  def withProps(p: DropDownEditorProps): Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ] = new Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(options: js.Array[String | Text]): Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ] = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Default[
      tag.type, 
      typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.DropDownEditor
    ](js.Array(this.component, __props.asInstanceOf[DropDownEditorProps]))
  }
}

