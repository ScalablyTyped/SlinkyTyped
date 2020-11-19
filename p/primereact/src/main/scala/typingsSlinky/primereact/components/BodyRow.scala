package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.bodyRowMod.BodyRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BodyRow {
  
  @JSImport("primereact/components/datatable/BodyRow", "BodyRow")
  @js.native
  object component extends js.Object
  
  def withProps(p: BodyRowProps): Default[tag.type, typingsSlinky.primereact.bodyRowMod.BodyRow] = new Default[tag.type, typingsSlinky.primereact.bodyRowMod.BodyRow](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BodyRow.type): Default[tag.type, typingsSlinky.primereact.bodyRowMod.BodyRow] = new Default[tag.type, typingsSlinky.primereact.bodyRowMod.BodyRow](js.Array(this.component, js.Dictionary.empty))()
}
