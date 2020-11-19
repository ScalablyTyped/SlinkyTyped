package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GridLines extends js.Object
@JSGlobal("ej.Grid.GridLines")
@js.native
object GridLines extends js.Object {
  
  ///Displays both the horizontal and vertical grid lines.
  @js.native
  sealed trait Both extends GridLines
  
  ///Displays the horizontal grid lines only.
  @js.native
  sealed trait Horizontal extends GridLines
  
  ///No grid lines are displayed.
  @js.native
  sealed trait None extends GridLines
  
  ///Displays the vertical grid lines only.
  @js.native
  sealed trait Vertical extends GridLines
}
