package typingsSlinky.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagonalMovement extends StObject
@JSImport("pathfinding", "DiagonalMovement")
@js.native
object DiagonalMovement extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagonalMovement with Double] = js.native
  
  @js.native
  sealed trait Always extends DiagonalMovement
  /* 1 */ val Always: typingsSlinky.pathfinding.mod.DiagonalMovement.Always with Double = js.native
  
  @js.native
  sealed trait IfAtMostOneObstacle extends DiagonalMovement
  /* 3 */ val IfAtMostOneObstacle: typingsSlinky.pathfinding.mod.DiagonalMovement.IfAtMostOneObstacle with Double = js.native
  
  @js.native
  sealed trait Never extends DiagonalMovement
  /* 2 */ val Never: typingsSlinky.pathfinding.mod.DiagonalMovement.Never with Double = js.native
  
  @js.native
  sealed trait OnlyWhenNoObstacles extends DiagonalMovement
  /* 4 */ val OnlyWhenNoObstacles: typingsSlinky.pathfinding.mod.DiagonalMovement.OnlyWhenNoObstacles with Double = js.native
}
