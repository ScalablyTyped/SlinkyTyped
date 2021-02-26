package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.headerCellMod.HeaderCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderCell {
  
  @JSImport("primereact/components/datatable/HeaderCell", "HeaderCell")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: HeaderCell.type): Default[tag.type, typingsSlinky.primereact.headerCellMod.HeaderCell] = new Default[tag.type, typingsSlinky.primereact.headerCellMod.HeaderCell](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeaderCellProps): Default[tag.type, typingsSlinky.primereact.headerCellMod.HeaderCell] = new Default[tag.type, typingsSlinky.primereact.headerCellMod.HeaderCell](js.Array(this.component, p.asInstanceOf[js.Any]))
}
