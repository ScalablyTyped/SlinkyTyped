package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Coordinate extends js.Object
@JSGlobal("BABYLON.Coordinate")
@js.native
object Coordinate extends js.Object {
  
  /** X axis */
  @js.native
  sealed trait X extends Coordinate
  
  /** Y axis */
  @js.native
  sealed trait Y extends Coordinate
  
  /** Z axis */
  @js.native
  sealed trait Z extends Coordinate
}
