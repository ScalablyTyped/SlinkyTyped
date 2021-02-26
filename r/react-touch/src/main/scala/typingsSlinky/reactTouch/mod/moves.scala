package typingsSlinky.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait moves extends StObject
@JSImport("react-touch", "moves")
@js.native
object moves extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[moves with Double] = js.native
  
  @js.native
  sealed trait DOWN extends moves
  /* 6 */ val DOWN: typingsSlinky.reactTouch.mod.moves.DOWN with Double = js.native
  
  @js.native
  sealed trait DOWNLEFT extends moves
  /* 7 */ val DOWNLEFT: typingsSlinky.reactTouch.mod.moves.DOWNLEFT with Double = js.native
  
  @js.native
  sealed trait DOWNRIGHT extends moves
  /* 5 */ val DOWNRIGHT: typingsSlinky.reactTouch.mod.moves.DOWNRIGHT with Double = js.native
  
  @js.native
  sealed trait LEFT extends moves
  /* 3 */ val LEFT: typingsSlinky.reactTouch.mod.moves.LEFT with Double = js.native
  
  @js.native
  sealed trait RIGHT extends moves
  /* 4 */ val RIGHT: typingsSlinky.reactTouch.mod.moves.RIGHT with Double = js.native
  
  @js.native
  sealed trait UP extends moves
  /* 1 */ val UP: typingsSlinky.reactTouch.mod.moves.UP with Double = js.native
  
  @js.native
  sealed trait UPLEFT extends moves
  /* 0 */ val UPLEFT: typingsSlinky.reactTouch.mod.moves.UPLEFT with Double = js.native
  
  @js.native
  sealed trait UPRIGHT extends moves
  /* 2 */ val UPRIGHT: typingsSlinky.reactTouch.mod.moves.UPRIGHT with Double = js.native
}
