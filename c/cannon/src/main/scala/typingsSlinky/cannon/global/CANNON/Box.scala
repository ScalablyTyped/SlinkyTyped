package typingsSlinky.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
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
object Box {
  
  @JSGlobal("CANNON.Box.calculateInertia")
  @js.native
  def calculateInertia(
    halfExtents: typingsSlinky.cannon.CANNON.Vec3,
    mass: Double,
    target: typingsSlinky.cannon.CANNON.Vec3
  ): Unit = js.native
}
