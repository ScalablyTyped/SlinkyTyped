package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActiveTool extends js.Object
@JSGlobal("ej.datavisualization.Diagram.ActiveTool")
@js.native
object ActiveTool extends js.Object {
  
  //Activate the port tool to drag when the mouse is moved over the port
  @js.native
  sealed trait Drag extends ActiveTool
  
  //Activate the draw tool to draw when the mouse is moved over the port
  @js.native
  sealed trait Draw extends ActiveTool
  
  //Set the default Tool
  @js.native
  sealed trait None extends ActiveTool
}
