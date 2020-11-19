package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.SAPBroadphase")
@js.native
class SAPBroadphase ()
  extends typingsSlinky.cannon.CANNON.SAPBroadphase {
  def this(world: typingsSlinky.cannon.CANNON.World) = this()
}
/* static members */
@JSGlobal("CANNON.SAPBroadphase")
@js.native
object SAPBroadphase extends js.Object {
  
  def checkBounds(bi: typingsSlinky.cannon.CANNON.Body, bj: typingsSlinky.cannon.CANNON.Body): Boolean = js.native
  def checkBounds(bi: typingsSlinky.cannon.CANNON.Body, bj: typingsSlinky.cannon.CANNON.Body, axisIndex: Double): Boolean = js.native
  
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}
