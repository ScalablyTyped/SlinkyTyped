package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.footerCellMod.FooterCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FooterCell {
  
  @JSImport("primereact/components/datatable/FooterCell", "FooterCell")
  @js.native
  object component extends js.Object
  
  def withProps(p: FooterCellProps): Default[tag.type, typingsSlinky.primereact.footerCellMod.FooterCell] = new Default[tag.type, typingsSlinky.primereact.footerCellMod.FooterCell](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FooterCell.type): Default[tag.type, typingsSlinky.primereact.footerCellMod.FooterCell] = new Default[tag.type, typingsSlinky.primereact.footerCellMod.FooterCell](js.Array(this.component, js.Dictionary.empty))()
}
