package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedInputBlockTypesMod {
  
  @js.native
  sealed trait AnimatedInputBlockTypes extends StObject
  @JSImport("babylonjs/Materials/Node/Blocks/Input/animatedInputBlockTypes", "AnimatedInputBlockTypes")
  @js.native
  object AnimatedInputBlockTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnimatedInputBlockTypes with Double] = js.native
    
    /** No animation */
    @js.native
    sealed trait None extends AnimatedInputBlockTypes
    /* 0 */ val None: typingsSlinky.babylonjs.animatedInputBlockTypesMod.AnimatedInputBlockTypes.None with Double = js.native
    
    /** Time based animation. Will only work for floats */
    @js.native
    sealed trait Time extends AnimatedInputBlockTypes
    /* 1 */ val Time: typingsSlinky.babylonjs.animatedInputBlockTypesMod.AnimatedInputBlockTypes.Time with Double = js.native
  }
}
