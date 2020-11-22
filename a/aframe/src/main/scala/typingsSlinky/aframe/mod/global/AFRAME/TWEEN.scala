package typingsSlinky.aframe.mod.global.AFRAME

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.aframe.mod.TweenLib
import typingsSlinky.tweenjsTweenJs.mod.UnknownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AFRAME.TWEEN")
@js.native
object TWEEN extends TopLevel[TweenLib] {
  
  /**
    * Controlling groups of tweens
    *
    * Using the TWEEN singleton to manage your tweens can cause issues in large apps with many components.
    * In these cases, you may want to create your own smaller groups of tween
    */
  @js.native
  class Group ()
    extends typingsSlinky.tweenjsTweenJs.mod.Group
  
  @js.native
  class Tween[T /* <: UnknownProps */] protected ()
    extends typingsSlinky.tweenjsTweenJs.mod.Tween[T] {
    def this(_object: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) = this()
  }
}
