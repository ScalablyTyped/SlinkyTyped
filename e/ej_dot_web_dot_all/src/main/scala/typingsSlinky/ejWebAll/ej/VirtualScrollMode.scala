package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualScrollMode extends js.Object
@JSGlobal("ej.VirtualScrollMode")
@js.native
object VirtualScrollMode extends js.Object {
  
  //The data items are loaded from the remote when scroll handle reaches the end of the scrollbar like infinity scrolling.
  @js.native
  sealed trait Continuous extends VirtualScrollMode
  
  //The data is loaded only to the corresponding page (display items). When scrolling some other position, it enables the load on demand with the DropDownList.
  @js.native
  sealed trait Normal extends VirtualScrollMode
}
