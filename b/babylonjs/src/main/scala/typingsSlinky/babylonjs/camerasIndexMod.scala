package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.easingMod.BackEase
import typingsSlinky.babylonjs.easingMod.ExponentialEase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasIndexMod {
  
  @JSImport("babylonjs/Behaviors/Cameras/index", "AutoRotationBehavior")
  @js.native
  class AutoRotationBehavior ()
    extends typingsSlinky.babylonjs.autoRotationBehaviorMod.AutoRotationBehavior
  
  @JSImport("babylonjs/Behaviors/Cameras/index", "BouncingBehavior")
  @js.native
  class BouncingBehavior ()
    extends typingsSlinky.babylonjs.bouncingBehaviorMod.BouncingBehavior
  /* static members */
  object BouncingBehavior {
    
    @JSImport("babylonjs/Behaviors/Cameras/index", "BouncingBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The easing function used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "BouncingBehavior.EasingFunction")
    @js.native
    def EasingFunction: BackEase = js.native
    @scala.inline
    def EasingFunction_=(x: BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * The easing mode used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "BouncingBehavior.EasingMode")
    @js.native
    def EasingMode: Double = js.native
    @scala.inline
    def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior")
  @js.native
  class FramingBehavior ()
    extends typingsSlinky.babylonjs.framingBehaviorMod.FramingBehavior
  /* static members */
  object FramingBehavior {
    
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The easing function used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior.EasingFunction")
    @js.native
    def EasingFunction: ExponentialEase = js.native
    @scala.inline
    def EasingFunction_=(x: ExponentialEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * The easing mode used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior.EasingMode")
    @js.native
    def EasingMode: Double = js.native
    @scala.inline
    def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
    
    /**
      * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior.FitFrustumSidesMode")
    @js.native
    def FitFrustumSidesMode: Double = js.native
    @scala.inline
    def FitFrustumSidesMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FitFrustumSidesMode")(x.asInstanceOf[js.Any])
    
    /**
      * The camera can move all the way towards the mesh.
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior.IgnoreBoundsSizeMode")
    @js.native
    def IgnoreBoundsSizeMode: Double = js.native
    @scala.inline
    def IgnoreBoundsSizeMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IgnoreBoundsSizeMode")(x.asInstanceOf[js.Any])
  }
}
