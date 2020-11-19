package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.paginationMod.PaginationItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaginationEllipsis {
  
  @JSImport("react-foundation", "PaginationEllipsis")
  @js.native
  object component extends js.Object
  
  def withProps(p: PaginationItemProps): SharedBuilder_PaginationItemProps88470200 = new SharedBuilder_PaginationItemProps88470200(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PaginationEllipsis.type): SharedBuilder_PaginationItemProps88470200 = new SharedBuilder_PaginationItemProps88470200(js.Array(this.component, js.Dictionary.empty))()
}
