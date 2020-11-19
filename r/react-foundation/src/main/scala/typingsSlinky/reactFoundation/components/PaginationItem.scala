package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.paginationMod.PaginationItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaginationItem {
  
  @JSImport("react-foundation", "PaginationItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: PaginationItemProps): SharedBuilder_PaginationItemProps88470200 = new SharedBuilder_PaginationItemProps88470200(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PaginationItem.type): SharedBuilder_PaginationItemProps88470200 = new SharedBuilder_PaginationItemProps88470200(js.Array(this.component, js.Dictionary.empty))()
}
