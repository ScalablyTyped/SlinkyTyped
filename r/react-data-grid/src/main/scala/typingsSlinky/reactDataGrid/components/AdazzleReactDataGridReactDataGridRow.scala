package typingsSlinky.reactDataGrid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object AdazzleReactDataGridReactDataGridRow {
  @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.Row")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGrid.ReactDataGrid.Row
  ] = new Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGrid.ReactDataGrid.Row
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AdazzleReactDataGridReactDataGridRow.type): Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGrid.ReactDataGrid.Row
  ] = new Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGrid.ReactDataGrid.Row
  ](js.Array(this.component, js.Dictionary.empty))()
}

