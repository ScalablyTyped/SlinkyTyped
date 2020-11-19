package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClipMode extends js.Object
@JSGlobal("ej.Grid.ClipMode")
@js.native
object ClipMode extends js.Object {
  
  ///Truncate the text in the cell
  @js.native
  sealed trait Clip extends ClipMode
  
  ///Shows ellipsis for the overflown cell.
  @js.native
  sealed trait Ellipsis extends ClipMode
  
  ///Shows ellipsis and tooltip for the overflown cell.
  @js.native
  sealed trait EllipsisWithTooltip extends ClipMode
}
