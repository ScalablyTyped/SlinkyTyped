package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.headerCellMod.HeaderCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderCell {
  @JSImport("primereact/components/datatable/HeaderCell", "HeaderCell")
  @js.native
  object component extends js.Object
  
  def withProps(p: HeaderCellProps): Default[tag.type, typingsSlinky.primereact.headerCellMod.HeaderCell] = new Default[tag.type, typingsSlinky.primereact.headerCellMod.HeaderCell](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HeaderCell.type): Default[tag.type, typingsSlinky.primereact.headerCellMod.HeaderCell] = new Default[tag.type, typingsSlinky.primereact.headerCellMod.HeaderCell](js.Array(this.component, js.Dictionary.empty))()
}

