package typingsSlinky.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BouncingBehavior")
@js.native
class BouncingBehavior ()
  extends typingsSlinky.babylonjs.behaviorsIndexMod.BouncingBehavior
/* static members */
object BouncingBehavior {
  
  @JSImport("babylonjs/index", "BouncingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The easing function used by animations
    */
  @JSImport("babylonjs/index", "BouncingBehavior.EasingFunction")
  @js.native
  def EasingFunction: typingsSlinky.babylonjs.easingMod.BackEase = js.native
  @scala.inline
  def EasingFunction_=(x: typingsSlinky.babylonjs.easingMod.BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
  
  /**
    * The easing mode used by animations
    */
  @JSImport("babylonjs/index", "BouncingBehavior.EasingMode")
  @js.native
  def EasingMode: Double = js.native
  @scala.inline
  def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
}
