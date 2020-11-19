package typingsSlinky.egjsAxes.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.egjsAxes.constMod.DIRECTION
import typingsSlinky.egjsAxes.panInputMod.PanInput
import typingsSlinky.egjsAxes.panInputMod.PanInputOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPanInput
  extends Instantiable1[(/* el */ HTMLElement) | (/* el */ String), PanInput]
     with Instantiable2[(/* el */ HTMLElement) | (/* el */ String), /* options */ PanInputOption, PanInput] {
  
  def getDirectionByAngle(angle: Double, thresholdAngle: Double): DIRECTION = js.native
  
  def getNextOffset(speeds: js.Array[Double], deceleration: Double): js.Array[Double] = js.native
  
  def useDirection(checkType: DIRECTION, direction: DIRECTION): Boolean = js.native
  def useDirection(checkType: DIRECTION, direction: DIRECTION, userDirection: DIRECTION): Boolean = js.native
}
