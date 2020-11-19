package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Box")
@js.native
class Box protected ()
  extends typingsSlinky.cannon.CANNON.Box {
  def this(halfExtents: typingsSlinky.cannon.CANNON.Vec3) = this()
}
/* static members */
@JSGlobal("CANNON.Box")
@js.native
object Box extends js.Object {
  
  def calculateIntertia(
    halfExtents: typingsSlinky.cannon.CANNON.Vec3,
    mass: Double,
    target: typingsSlinky.cannon.CANNON.Vec3
  ): Unit = js.native
}
