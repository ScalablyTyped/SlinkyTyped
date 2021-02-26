package typingsSlinky.aframe.mod.global.AFRAME

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.aframe.mod.TweenLib
import typingsSlinky.tweenjsTweenJs.mod.UnknownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TWEEN extends Shortcut {
  
  @JSGlobal("AFRAME.TWEEN")
  @js.native
  val ^ : TweenLib = js.native
  
  /**
    * Controlling groups of tweens
    *
    * Using the TWEEN singleton to manage your tweens can cause issues in large apps with many components.
    * In these cases, you may want to create your own smaller groups of tween
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AFRAME.TWEEN.Group")
  @js.native
  class Group ()
    extends typingsSlinky.tweenjsTweenJs.mod.Group
  
  /**
    * Utils
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AFRAME.TWEEN.Sequence")
  @js.native
  class Sequence ()
    extends typingsSlinky.tweenjsTweenJs.mod.Sequence
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AFRAME.TWEEN.Tween")
  @js.native
  class Tween[T /* <: UnknownProps */] protected ()
    extends typingsSlinky.tweenjsTweenJs.mod.Tween[T] {
    def this(_object: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) = this()
  }
  
  type _To = TweenLib
  
  /* This means you don't have to write `^`, but can instead just say `TWEEN.foo` */
  override def _to: TweenLib = ^
}
