package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.animatableInterfaceMod.IAnimatable
import typingsSlinky.babylonjs.anon.AdditiveAnimations
import typingsSlinky.babylonjs.anon.Animations
import typingsSlinky.babylonjs.mathVectorMod.Quaternion
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.nodeMod.Node
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsIndexMod {
  
  @JSImport("babylonjs/Animations/index", "Animatable")
  @js.native
  class Animatable protected ()
    extends typingsSlinky.babylonjs.animatableMod.Animatable {
    /**
      * Creates a new Animatable
      * @param scene defines the hosting scene
      * @param target defines the target object
      * @param fromFrame defines the starting frame number (default is 0)
      * @param toFrame defines the ending frame number (default is 100)
      * @param loopAnimation defines if the animation must loop (default is false)
      * @param speedRatio defines the factor to apply to animation speed (default is 1)
      * @param onAnimationEnd defines a callback to call when animation ends if it is not looping
      * @param animations defines a group of animation to add to the new Animatable
      * @param onAnimationLoop defines a callback to call when animation loops
      * @param isAdditive defines whether the animation should be evaluated additively
      */
    def this(
      scene: Scene,
      /** defines the target object */
    target: js.Any,
      /** defines the starting frame number (default is 0) */
    fromFrame: js.UndefOr[Double],
      /** defines the ending frame number (default is 100) */
    toFrame: js.UndefOr[Double],
      /** defines if the animation must loop (default is false)  */
    loopAnimation: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      /** defines a callback to call when animation ends if it is not looping */
    onAnimationEnd: js.UndefOr[js.Function0[Unit] | Null],
      animations: js.UndefOr[js.Array[typingsSlinky.babylonjs.animationMod.Animation]],
      /** defines a callback to call when animation loops */
    onAnimationLoop: js.UndefOr[js.Function0[Unit] | Null],
      /** defines whether the animation should be evaluated additively */
    isAdditive: js.UndefOr[Boolean]
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "Animation")
  @js.native
  class Animation protected ()
    extends typingsSlinky.babylonjs.animationMod.Animation {
    /**
      * Initializes the animation
      * @param name Name of the animation
      * @param targetProperty Property to animate
      * @param framePerSecond The frames per second of the animation
      * @param dataType The data type of the animation
      * @param loopMode The loop mode of the animation
      * @param enableBlending Specifies if blending should be enabled
      */
    def this(
      /**Name of the animation */
    name: String,
      /**Property to animate */
    targetProperty: String,
      /**The frames per second of the animation */
    framePerSecond: Double,
      /**The data type of the animation */
    dataType: Double
    ) = this()
    def this(
      /**Name of the animation */
    name: String,
      /**Property to animate */
    targetProperty: String,
      /**The frames per second of the animation */
    framePerSecond: Double,
      /**The data type of the animation */
    dataType: Double,
      /**The loop mode of the animation */
    loopMode: Double
    ) = this()
    def this(
      /**Name of the animation */
    name: String,
      /**Property to animate */
    targetProperty: String,
      /**The frames per second of the animation */
    framePerSecond: Double,
      /**The data type of the animation */
    dataType: Double,
      /**The loop mode of the animation */
    loopMode: js.UndefOr[scala.Nothing],
      /**Specifies if blending should be enabled */
    enableBlending: Boolean
    ) = this()
    def this(
      /**Name of the animation */
    name: String,
      /**Property to animate */
    targetProperty: String,
      /**The frames per second of the animation */
    framePerSecond: Double,
      /**The data type of the animation */
    dataType: Double,
      /**The loop mode of the animation */
    loopMode: Double,
      /**Specifies if blending should be enabled */
    enableBlending: Boolean
    ) = this()
  }
  /* static members */
  object Animation {
    
    @JSImport("babylonjs/Animations/index", "Animation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constant Loop Mode
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONLOOPMODE_CONSTANT")
    @js.native
    val ANIMATIONLOOPMODE_CONSTANT: Double = js.native
    
    /**
      * Cycle Loop Mode
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONLOOPMODE_CYCLE")
    @js.native
    val ANIMATIONLOOPMODE_CYCLE: Double = js.native
    
    /**
      * Relative Loop Mode
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONLOOPMODE_RELATIVE")
    @js.native
    val ANIMATIONLOOPMODE_RELATIVE: Double = js.native
    
    /**
      * Color3 animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_COLOR3")
    @js.native
    val ANIMATIONTYPE_COLOR3: Double = js.native
    
    /**
      * Color3 animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_COLOR4")
    @js.native
    val ANIMATIONTYPE_COLOR4: Double = js.native
    
    /**
      * Float animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_FLOAT")
    @js.native
    val ANIMATIONTYPE_FLOAT: Double = js.native
    
    /**
      * Matrix animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_MATRIX")
    @js.native
    val ANIMATIONTYPE_MATRIX: Double = js.native
    
    /**
      * Quaternion animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_QUATERNION")
    @js.native
    val ANIMATIONTYPE_QUATERNION: Double = js.native
    
    /**
      * Size animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_SIZE")
    @js.native
    val ANIMATIONTYPE_SIZE: Double = js.native
    
    /**
      * Vector2 animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_VECTOR2")
    @js.native
    val ANIMATIONTYPE_VECTOR2: Double = js.native
    
    /**
      * Vector3 animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_VECTOR3")
    @js.native
    val ANIMATIONTYPE_VECTOR3: Double = js.native
    
    /**
      * Use matrix interpolation instead of using direct key value when animating matrices
      */
    @JSImport("babylonjs/Animations/index", "Animation.AllowMatricesInterpolation")
    @js.native
    def AllowMatricesInterpolation: Boolean = js.native
    @scala.inline
    def AllowMatricesInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatricesInterpolation")(x.asInstanceOf[js.Any])
    
    /**
      * When matrix interpolation is enabled, this boolean forces the system to use Matrix.DecomposeLerp instead of Matrix.Lerp. Interpolation is more precise but slower
      */
    @JSImport("babylonjs/Animations/index", "Animation.AllowMatrixDecomposeForInterpolation")
    @js.native
    def AllowMatrixDecomposeForInterpolation: Boolean = js.native
    @scala.inline
    def AllowMatrixDecomposeForInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatrixDecomposeForInterpolation")(x.asInstanceOf[js.Any])
    
    /**
      * Appends the serialized animations from the source animations
      * @param source Source containing the animations
      * @param destination Target to store the animations
      */
    @JSImport("babylonjs/Animations/index", "Animation.AppendSerializedAnimations")
    @js.native
    def AppendSerializedAnimations(source: IAnimatable, destination: js.Any): Unit = js.native
    
    /**
      * Create and start an animation on a node
      * @param name defines the name of the global animation that will be run on all nodes
      * @param node defines the root node where the animation will take place
      * @param targetProperty defines property to animate
      * @param framePerSecond defines the number of frame per second yo use
      * @param totalFrame defines the number of frames in total
      * @param from defines the initial value
      * @param to defines the final value
      * @param loopMode defines which loop mode you want to use (off by default)
      * @param easingFunction defines the easing function to use (linear by default)
      * @param onAnimationEnd defines the callback to call when animation end
      * @returns the animatable created for this animation
      */
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    
    /**
      * Create and start an animation on a node and its descendants
      * @param name defines the name of the global animation that will be run on all nodes
      * @param node defines the root node where the animation will take place
      * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used
      * @param targetProperty defines property to animate
      * @param framePerSecond defines the number of frame per second to use
      * @param totalFrame defines the number of frames in total
      * @param from defines the initial value
      * @param to defines the final value
      * @param loopMode defines which loop mode you want to use (off by default)
      * @param easingFunction defines the easing function to use (linear by default)
      * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
      * @returns the list of animatables created for all nodes
      * @example https://www.babylonjs-playground.com/#MH0VLI
      */
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartHierarchyAnimation")
    @js.native
    def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[js.Array[typingsSlinky.babylonjs.animatableMod.Animatable]] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartHierarchyAnimation")
    @js.native
    def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[typingsSlinky.babylonjs.animatableMod.Animatable]] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartHierarchyAnimation")
    @js.native
    def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): Nullable[js.Array[typingsSlinky.babylonjs.animatableMod.Animatable]] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartHierarchyAnimation")
    @js.native
    def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[typingsSlinky.babylonjs.animatableMod.Animatable]] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartHierarchyAnimation")
    @js.native
    def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[js.Array[typingsSlinky.babylonjs.animatableMod.Animatable]] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartHierarchyAnimation")
    @js.native
    def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[typingsSlinky.babylonjs.animatableMod.Animatable]] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartHierarchyAnimation")
    @js.native
    def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): Nullable[js.Array[typingsSlinky.babylonjs.animatableMod.Animatable]] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateAndStartHierarchyAnimation")
    @js.native
    def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[typingsSlinky.babylonjs.animatableMod.Animatable]] = js.native
    
    /**
      * Sets up an animation
      * @param property The property to animate
      * @param animationType The animation type to apply
      * @param framePerSecond The frames per second of the animation
      * @param easingFunction The easing function used in the animation
      * @returns The created animation
      */
    @JSImport("babylonjs/Animations/index", "Animation.CreateAnimation")
    @js.native
    def CreateAnimation(
      property: String,
      animationType: Double,
      framePerSecond: Double,
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    
    /**
      * Creates an animation or an array of animations from a snippet saved by the Inspector
      * @param snippetId defines the snippet to load
      * @returns a promise that will resolve to the new animation or a new array of animations
      */
    @JSImport("babylonjs/Animations/index", "Animation.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String): js.Promise[
        typingsSlinky.babylonjs.animationMod.Animation | js.Array[typingsSlinky.babylonjs.animationMod.Animation]
      ] = js.native
    
    /**
      * Creates a new animation, merges it with the existing animations and starts it
      * @param name Name of the animation
      * @param node Node which contains the scene that begins the animations
      * @param targetProperty Specifies which property to animate
      * @param framePerSecond The frames per second of the animation
      * @param totalFrame The total number of frames
      * @param from The frame at the beginning of the animation
      * @param to The frame at the end of the animation
      * @param loopMode Specifies the loop mode of the animation
      * @param easingFunction (Optional) The easing function of the animation, which allow custom mathematical formulas for animations
      * @param onAnimationEnd Callback to run once the animation is complete
      * @returns Nullable animation
      */
    @JSImport("babylonjs/Animations/index", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    
    /**
      * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
      * @param sourceAnimation defines the Animation containing keyframes to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the Animation to convert
      * @param cloneOriginal defines whether or not to clone the animation and convert the clone or convert the original animation (default is false)
      * @param clonedName defines the name of the resulting cloned Animation if cloneOriginal is true
      * @returns a new Animation if cloneOriginal is true or the original Animation if cloneOriginal is false
      */
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean,
      clonedName: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: Boolean
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation, referenceFrame: Double): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean,
      clonedName: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: String,
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    @JSImport("babylonjs/Animations/index", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: typingsSlinky.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): typingsSlinky.babylonjs.animationMod.Animation = js.native
    
    /**
      * Parses an animation object and creates an animation
      * @param parsedAnimation Parsed animation object
      * @returns Animation object
      */
    @JSImport("babylonjs/Animations/index", "Animation.Parse")
    @js.native
    def Parse(parsedAnimation: js.Any): typingsSlinky.babylonjs.animationMod.Animation = js.native
    
    /**
      * Creates a new animation or an array of animations from a snippet saved in a remote file
      * @param name defines the name of the animation to create (can be null or empty to use the one from the json data)
      * @param url defines the url to load from
      * @returns a promise that will resolve to the new animation or an array of animations
      */
    @JSImport("babylonjs/Animations/index", "Animation.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String): js.Promise[
        typingsSlinky.babylonjs.animationMod.Animation | js.Array[typingsSlinky.babylonjs.animationMod.Animation]
      ] = js.native
    
    /** Define the Url to load snippets */
    @JSImport("babylonjs/Animations/index", "Animation.SnippetUrl")
    @js.native
    def SnippetUrl: String = js.native
    @scala.inline
    def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Transition property of an host to the target Value
      * @param property The property to transition
      * @param targetValue The target Value of the property
      * @param host The object where the property to animate belongs
      * @param scene Scene used to run the animation
      * @param frameRate Framerate (in frame/s) to use
      * @param transition The transition type we want to use
      * @param duration The duration of the animation, in milliseconds
      * @param onAnimationEnd Callback trigger at the end of the animation
      * @returns Nullable animation
      */
    @JSImport("babylonjs/Animations/index", "Animation.TransitionTo")
    @js.native
    def TransitionTo(
      property: String,
      targetValue: js.Any,
      host: js.Any,
      scene: Scene,
      frameRate: Double,
      transition: typingsSlinky.babylonjs.animationMod.Animation,
      duration: Double
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    @JSImport("babylonjs/Animations/index", "Animation.TransitionTo")
    @js.native
    def TransitionTo(
      property: String,
      targetValue: js.Any,
      host: js.Any,
      scene: Scene,
      frameRate: Double,
      transition: typingsSlinky.babylonjs.animationMod.Animation,
      duration: Double,
      onAnimationEnd: Nullable[js.Function0[Unit]]
    ): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    
    /**
      * @hidden Internal use
      */
    @JSImport("babylonjs/Animations/index", "Animation._PrepareAnimation")
    @js.native
    def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[typingsSlinky.babylonjs.animationMod.Animation] = js.native
    @JSImport("babylonjs/Animations/index", "Animation._PrepareAnimation")
    @js.native
    def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): Nullable[typingsSlinky.babylonjs.animationMod.Animation] = js.native
    @JSImport("babylonjs/Animations/index", "Animation._PrepareAnimation")
    @js.native
    def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[typingsSlinky.babylonjs.animationMod.Animation] = js.native
    @JSImport("babylonjs/Animations/index", "Animation._PrepareAnimation")
    @js.native
    def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typingsSlinky.babylonjs.easingMod.EasingFunction
    ): Nullable[typingsSlinky.babylonjs.animationMod.Animation] = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Animations/index", "Animation._UniversalLerp")
    @js.native
    def _UniversalLerp(left: js.Any, right: js.Any, amount: Double): js.Any = js.native
  }
  
  @JSImport("babylonjs/Animations/index", "AnimationEvent")
  @js.native
  class AnimationEvent protected ()
    extends typingsSlinky.babylonjs.animationEventMod.AnimationEvent {
    /**
      * Initializes the animation event
      * @param frame The frame for which the event is triggered
      * @param action The event to perform when triggered
      * @param onlyOnce Specifies if the event should be triggered only once
      */
    def this(
      /** The frame for which the event is triggered **/
    frame: Double,
      /** The event to perform when triggered **/
    action: js.Function1[/* currentFrame */ Double, Unit]
    ) = this()
    def this(
      /** The frame for which the event is triggered **/
    frame: Double,
      /** The event to perform when triggered **/
    action: js.Function1[/* currentFrame */ Double, Unit],
      /** Specifies if the event should be triggered only once**/
    onlyOnce: Boolean
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "AnimationGroup")
  @js.native
  class AnimationGroup protected ()
    extends typingsSlinky.babylonjs.animationGroupMod.AnimationGroup {
    /**
      * Instantiates a new Animation Group.
      * This helps managing several animations at once.
      * @see https://doc.babylonjs.com/how_to/group
      * @param name Defines the name of the group
      * @param scene Defines the scene the group belongs to
      */
    def this(/** The name of the animation group */
    name: String) = this()
    def this(/** The name of the animation group */
    name: String, scene: Nullable[Scene]) = this()
  }
  /* static members */
  object AnimationGroup {
    
    /**
      * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
      * @param sourceAnimationGroup defines the AnimationGroup containing animations to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the animations in the group to convert
      * @param cloneOriginal defines whether or not to clone the group and convert the clone or convert the original group (default is false)
      * @param clonedName defines the name of the resulting cloned AnimationGroup if cloneOriginal is true
      * @returns a new AnimationGroup if cloneOriginal is true or the original AnimationGroup if cloneOriginal is false
      */
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean,
      clonedName: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: Boolean
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean,
      clonedName: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    @JSImport("babylonjs/Animations/index", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: typingsSlinky.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
    
    /**
      * Returns a new AnimationGroup object parsed from the source provided.
      * @param parsedAnimationGroup defines the source
      * @param scene defines the scene that will receive the animationGroup
      * @returns a new AnimationGroup
      */
    @JSImport("babylonjs/Animations/index", "AnimationGroup.Parse")
    @js.native
    def Parse(parsedAnimationGroup: js.Any, scene: Scene): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
  }
  
  @JSImport("babylonjs/Animations/index", "AnimationKeyInterpolation")
  @js.native
  object AnimationKeyInterpolation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.babylonjs.animationKeyMod.AnimationKeyInterpolation with Double] = js.native
    
    /* 1 */ val STEP: typingsSlinky.babylonjs.animationKeyMod.AnimationKeyInterpolation.STEP with Double = js.native
  }
  
  @JSImport("babylonjs/Animations/index", "AnimationPropertiesOverride")
  @js.native
  class AnimationPropertiesOverride ()
    extends typingsSlinky.babylonjs.animationPropertiesOverrideMod.AnimationPropertiesOverride
  
  @JSImport("babylonjs/Animations/index", "AnimationRange")
  @js.native
  class AnimationRange protected ()
    extends typingsSlinky.babylonjs.animationRangeMod.AnimationRange {
    /**
      * Initializes the range of an animation
      * @param name The name of the animation range
      * @param from The starting frame of the animation
      * @param to The ending frame of the animation
      */
    def this(
      /**The name of the animation range**/
    name: String,
      /**The starting frame of the animation */
    from: Double,
      /**The ending frame of the animation*/
    to: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "BackEase")
  @js.native
  /**
    * Instantiates a back ease easing
    * @see https://easings.net/#easeInBack
    * @param amplitude Defines the amplitude of the function
    */
  class BackEase ()
    extends typingsSlinky.babylonjs.easingMod.BackEase {
    def this(/** Defines the amplitude of the function */
    amplitude: Double) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "BezierCurveEase")
  @js.native
  /**
    * Instantiates a bezier function
    * @see http://cubic-bezier.com/#.17,.67,.83,.67
    * @param x1 Defines the x component of the start tangent in the bezier curve
    * @param y1 Defines the y component of the start tangent in the bezier curve
    * @param x2 Defines the x component of the end tangent in the bezier curve
    * @param y2 Defines the y component of the end tangent in the bezier curve
    */
  class BezierCurveEase ()
    extends typingsSlinky.babylonjs.easingMod.BezierCurveEase {
    def this(/** Defines the x component of the start tangent in the bezier curve */
    x1: Double) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: js.UndefOr[scala.Nothing],
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: js.UndefOr[scala.Nothing],
      /** Defines the y component of the start tangent in the bezier curve */
    y1: js.UndefOr[scala.Nothing],
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: js.UndefOr[scala.Nothing],
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: js.UndefOr[scala.Nothing],
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: js.UndefOr[scala.Nothing],
      /** Defines the y component of the start tangent in the bezier curve */
    y1: js.UndefOr[scala.Nothing],
      /** Defines the x component of the end tangent in the bezier curve */
    x2: js.UndefOr[scala.Nothing],
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: js.UndefOr[scala.Nothing],
      /** Defines the y component of the start tangent in the bezier curve */
    y1: js.UndefOr[scala.Nothing],
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: js.UndefOr[scala.Nothing],
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: js.UndefOr[scala.Nothing],
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: js.UndefOr[scala.Nothing],
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: js.UndefOr[scala.Nothing],
      /** Defines the x component of the end tangent in the bezier curve */
    x2: js.UndefOr[scala.Nothing],
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: js.UndefOr[scala.Nothing],
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: js.UndefOr[scala.Nothing],
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "BounceEase")
  @js.native
  /**
    * Instantiates a bounce easing
    * @see https://easings.net/#easeInBounce
    * @param bounces Defines the number of bounces
    * @param bounciness Defines the amplitude of the bounce
    */
  class BounceEase ()
    extends typingsSlinky.babylonjs.easingMod.BounceEase {
    def this(/** Defines the number of bounces */
    bounces: Double) = this()
    def this(
      /** Defines the number of bounces */
    bounces: js.UndefOr[scala.Nothing],
      /** Defines the amplitude of the bounce */
    bounciness: Double
    ) = this()
    def this(
      /** Defines the number of bounces */
    bounces: Double,
      /** Defines the amplitude of the bounce */
    bounciness: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "CircleEase")
  @js.native
  class CircleEase ()
    extends typingsSlinky.babylonjs.easingMod.CircleEase
  
  @JSImport("babylonjs/Animations/index", "CubicEase")
  @js.native
  class CubicEase ()
    extends typingsSlinky.babylonjs.easingMod.CubicEase
  
  @JSImport("babylonjs/Animations/index", "EasingFunction")
  @js.native
  class EasingFunction ()
    extends typingsSlinky.babylonjs.easingMod.EasingFunction
  /* static members */
  object EasingFunction {
    
    /**
      * Interpolation follows the mathematical formula associated with the easing function.
      */
    @JSImport("babylonjs/Animations/index", "EasingFunction.EASINGMODE_EASEIN")
    @js.native
    val EASINGMODE_EASEIN: Double = js.native
    
    /**
      * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
      */
    @JSImport("babylonjs/Animations/index", "EasingFunction.EASINGMODE_EASEINOUT")
    @js.native
    val EASINGMODE_EASEINOUT: Double = js.native
    
    /**
      * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
      */
    @JSImport("babylonjs/Animations/index", "EasingFunction.EASINGMODE_EASEOUT")
    @js.native
    val EASINGMODE_EASEOUT: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/index", "ElasticEase")
  @js.native
  /**
    * Instantiates an elastic easing function
    * @see https://easings.net/#easeInElastic
    * @param oscillations Defines the number of oscillations
    * @param springiness Defines the amplitude of the oscillations
    */
  class ElasticEase ()
    extends typingsSlinky.babylonjs.easingMod.ElasticEase {
    def this(/** Defines the number of oscillations*/
    oscillations: Double) = this()
    def this(
      /** Defines the number of oscillations*/
    oscillations: js.UndefOr[scala.Nothing],
      /** Defines the amplitude of the oscillations*/
    springiness: Double
    ) = this()
    def this(
      /** Defines the number of oscillations*/
    oscillations: Double,
      /** Defines the amplitude of the oscillations*/
    springiness: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "ExponentialEase")
  @js.native
  /**
    * Instantiates an exponential easing function
    * @see https://easings.net/#easeInExpo
    * @param exponent Defines the exponent of the function
    */
  class ExponentialEase ()
    extends typingsSlinky.babylonjs.easingMod.ExponentialEase {
    def this(/** Defines the exponent of the function */
    exponent: Double) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "_IAnimationState")
  @js.native
  class IAnimationState ()
    extends typingsSlinky.babylonjs.animationMod.IAnimationState
  
  @JSImport("babylonjs/Animations/index", "PowerEase")
  @js.native
  /**
    * Instantiates an power base easing function
    * @see https://easings.net/#easeInQuad
    * @param power Defines the power of the function
    */
  class PowerEase ()
    extends typingsSlinky.babylonjs.easingMod.PowerEase {
    def this(/** Defines the power of the function */
    power: Double) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "QuadraticEase")
  @js.native
  class QuadraticEase ()
    extends typingsSlinky.babylonjs.easingMod.QuadraticEase
  
  @JSImport("babylonjs/Animations/index", "QuarticEase")
  @js.native
  class QuarticEase ()
    extends typingsSlinky.babylonjs.easingMod.QuarticEase
  
  @JSImport("babylonjs/Animations/index", "QuinticEase")
  @js.native
  class QuinticEase ()
    extends typingsSlinky.babylonjs.easingMod.QuinticEase
  
  @JSImport("babylonjs/Animations/index", "RuntimeAnimation")
  @js.native
  class RuntimeAnimation protected ()
    extends typingsSlinky.babylonjs.runtimeAnimationMod.RuntimeAnimation {
    /**
      * Create a new RuntimeAnimation object
      * @param target defines the target of the animation
      * @param animation defines the source animation object
      * @param scene defines the hosting scene
      * @param host defines the initiating Animatable
      */
    def this(
      target: js.Any,
      animation: typingsSlinky.babylonjs.animationMod.Animation,
      scene: Scene,
      host: typingsSlinky.babylonjs.animatableMod.Animatable
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "SineEase")
  @js.native
  class SineEase ()
    extends typingsSlinky.babylonjs.easingMod.SineEase
  
  @JSImport("babylonjs/Animations/index", "TargetedAnimation")
  @js.native
  class TargetedAnimation ()
    extends typingsSlinky.babylonjs.animationGroupMod.TargetedAnimation
  
  /* augmented module */
  object babylonjsBonesBoneAugmentingMod {
    
    @js.native
    trait Bone extends StObject {
      
      /**
        * Copy an animation range from another bone
        * @param source defines the source bone
        * @param rangeName defines the range name to copy
        * @param frameOffset defines the frame offset
        * @param rescaleAsRequired defines if rescaling must be applied if required
        * @param skelDimensionsRatio defines the scaling ratio
        * @returns true if operation was successful
        */
      def copyAnimationRange(
        source: typingsSlinky.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone,
        rangeName: String,
        frameOffset: Double,
        rescaleAsRequired: Boolean,
        skelDimensionsRatio: Nullable[Vector3]
      ): Boolean = js.native
    }
    object Bone {
      
      @scala.inline
      def apply(
        copyAnimationRange: (typingsSlinky.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[Vector3]) => Boolean
      ): Bone = {
        val __obj = js.Dynamic.literal(copyAnimationRange = js.Any.fromFunction5(copyAnimationRange))
        __obj.asInstanceOf[Bone]
      }
      
      @scala.inline
      implicit class BoneMutableBuilder[Self <: Bone] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCopyAnimationRange(
          value: (typingsSlinky.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[Vector3]) => Boolean
        ): Self = StObject.set(x, "copyAnimationRange", js.Any.fromFunction5(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden */
      def _processLateAnimationBindings(): Unit = js.native
      
      /** @hidden */
      def _processLateAnimationBindingsForMatrices(holder: AdditiveAnimations): js.Any = js.native
      
      /** @hidden */
      def _processLateAnimationBindingsForQuaternions(holder: Animations, refQuaternion: Quaternion): Quaternion = js.native
      
      /** @hidden */
      def _registerTargetForLateAnimationBinding(
        runtimeAnimation: typingsSlinky.babylonjs.runtimeAnimationMod.RuntimeAnimation,
        originalValue: js.Any
      ): Unit = js.native
      
      /**
        * Will start the animation sequence of a given target
        * @param target defines the target
        * @param from defines from which frame should animation start
        * @param to defines until which frame should animation run.
        * @param loop defines if the animation loops
        * @param speedRatio defines the speed in which to run the animation (1.0 by default)
        * @param onAnimationEnd defines the function to be executed when the animation ends
        * @param animatable defines an animatable object. If not provided a new one will be created from the given params
        * @param stopCurrent defines if the current animations must be stopped first (true by default)
        * @param targetMask defines if the target should be animate if animations are present (this is called recursively on descendant animatables regardless of return value)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the animatable object created for this animation
        */
      def beginAnimation(
        target: js.Any,
        from: Double,
        to: Double,
        loop: js.UndefOr[Boolean],
        speedRatio: js.UndefOr[Double],
        onAnimationEnd: js.UndefOr[js.Function0[Unit]],
        animatable: js.UndefOr[typingsSlinky.babylonjs.animatableMod.Animatable],
        stopCurrent: js.UndefOr[Boolean],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      
      /**
        * Begin a new animation on a given node
        * @param target defines the target where the animation will take place
        * @param animations defines the list of animations to start
        * @param from defines the initial value
        * @param to defines the final value
        * @param loop defines if you want animation to loop (off by default)
        * @param speedRatio defines the speed ratio to apply to all animations
        * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the list of created animatables
        */
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      
      /**
        * Begin a new animation on a given node and its hierarchy
        * @param target defines the root node where the animation will take place
        * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
        * @param animations defines the list of animations to start
        * @param from defines the initial value
        * @param to defines the final value
        * @param loop defines if you want animation to loop (off by default)
        * @param speedRatio defines the speed ratio to apply to all animations
        * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the list of animatables created for all nodes
        */
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      
      /**
        * Will start the animation sequence of a given target and its hierarchy
        * @param target defines the target
        * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
        * @param from defines from which frame should animation start
        * @param to defines until which frame should animation run.
        * @param loop defines if the animation loops
        * @param speedRatio defines the speed in which to run the animation (1.0 by default)
        * @param onAnimationEnd defines the function to be executed when the animation ends
        * @param animatable defines an animatable object. If not provided a new one will be created from the given params
        * @param stopCurrent defines if the current animations must be stopped first (true by default)
        * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the list of created animatables
        */
      def beginHierarchyAnimation(
        target: js.Any,
        directDescendantsOnly: Boolean,
        from: Double,
        to: Double,
        loop: js.UndefOr[Boolean],
        speedRatio: js.UndefOr[Double],
        onAnimationEnd: js.UndefOr[js.Function0[Unit]],
        animatable: js.UndefOr[typingsSlinky.babylonjs.animatableMod.Animatable],
        stopCurrent: js.UndefOr[Boolean],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      
      /**
        * Will start the animation sequence of a given target
        * @param target defines the target
        * @param from defines from which frame should animation start
        * @param to defines until which frame should animation run.
        * @param weight defines the weight to apply to the animation (1.0 by default)
        * @param loop defines if the animation loops
        * @param speedRatio defines the speed in which to run the animation (1.0 by default)
        * @param onAnimationEnd defines the function to be executed when the animation ends
        * @param animatable defines an animatable object. If not provided a new one will be created from the given params
        * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the animatable object created for this animation
        */
      def beginWeightedAnimation(
        target: js.Any,
        from: Double,
        to: Double,
        weight: Double,
        loop: js.UndefOr[Boolean],
        speedRatio: js.UndefOr[Double],
        onAnimationEnd: js.UndefOr[js.Function0[Unit]],
        animatable: js.UndefOr[typingsSlinky.babylonjs.animatableMod.Animatable],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
      
      /**
        * Gets the current delta time used by animation engine
        */
      var deltaTime: Double = js.native
      
      /**
        * Gets all animatables associated with a given target
        * @param target defines the target to look animatables for
        * @returns an array of Animatables
        */
      def getAllAnimatablesByTarget(target: js.Any): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      
      /**
        * Gets the animatable associated with a specific target
        * @param target defines the target of the animatable
        * @returns the required animatable if found
        */
      def getAnimatableByTarget(target: js.Any): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
      
      /**
        * Stops and removes all animations that have been applied to the scene
        */
      def stopAllAnimations(): Unit = js.native
    }
  }
}
