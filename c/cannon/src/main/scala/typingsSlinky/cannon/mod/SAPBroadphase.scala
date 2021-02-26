package typingsSlinky.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "SAPBroadphase")
@js.native
class SAPBroadphase ()
  extends typingsSlinky.cannon.CANNON.SAPBroadphase {
  def this(world: typingsSlinky.cannon.CANNON.World) = this()
}
/* static members */
object SAPBroadphase {
  
  @JSImport("cannon", "SAPBroadphase.checkBounds")
  @js.native
  def checkBounds(bi: typingsSlinky.cannon.CANNON.Body, bj: typingsSlinky.cannon.CANNON.Body): Boolean = js.native
  @JSImport("cannon", "SAPBroadphase.checkBounds")
  @js.native
  def checkBounds(bi: typingsSlinky.cannon.CANNON.Body, bj: typingsSlinky.cannon.CANNON.Body, axisIndex: Double): Boolean = js.native
  
  @JSImport("cannon", "SAPBroadphase.insertionSortX")
  @js.native
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("cannon", "SAPBroadphase.insertionSortY")
  @js.native
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("cannon", "SAPBroadphase.insertionSortZ")
  @js.native
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}
