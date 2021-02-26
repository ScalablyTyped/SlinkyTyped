package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BouncingBehavior")
@js.native
class BouncingBehavior ()
  extends typingsSlinky.babylonjs.indexMod.BouncingBehavior
/* static members */
object BouncingBehavior {
  
  @JSImport("babylonjs/Legacy/legacy", "BouncingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The easing function used by animations
    */
  @JSImport("babylonjs/Legacy/legacy", "BouncingBehavior.EasingFunction")
  @js.native
  def EasingFunction: typingsSlinky.babylonjs.easingMod.BackEase = js.native
  @scala.inline
  def EasingFunction_=(x: typingsSlinky.babylonjs.easingMod.BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
  
  /**
    * The easing mode used by animations
    */
  @JSImport("babylonjs/Legacy/legacy", "BouncingBehavior.EasingMode")
  @js.native
  def EasingMode: Double = js.native
  @scala.inline
  def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
}
