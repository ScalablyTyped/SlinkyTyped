package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "CircleBrush")
@js.native
class CircleBrush () extends BaseBrush {
  
  /**
    * @return Just added pointer point
    */
  def addPoint(pointer: js.Any): Point = js.native
  
  /**
    * Invoked inside on mouse down and mouse move
    */
  def drawDot(pointer: js.Any): Unit = js.native
}
