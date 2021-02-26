package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.bodyCellMod.BodyCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BodyCell {
  
  @JSImport("primereact/components/datatable/BodyCell", "BodyCell")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BodyCell.type): Default[tag.type, typingsSlinky.primereact.bodyCellMod.BodyCell] = new Default[tag.type, typingsSlinky.primereact.bodyCellMod.BodyCell](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BodyCellProps): Default[tag.type, typingsSlinky.primereact.bodyCellMod.BodyCell] = new Default[tag.type, typingsSlinky.primereact.bodyCellMod.BodyCell](js.Array(this.component, p.asInstanceOf[js.Any]))
}
