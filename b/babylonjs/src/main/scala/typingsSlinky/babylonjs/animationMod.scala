package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.animatableInterfaceMod.IAnimatable
import typingsSlinky.babylonjs.animatableMod.Animatable
import typingsSlinky.babylonjs.animationEventMod.AnimationEvent
import typingsSlinky.babylonjs.animationKeyMod.IAnimationKey
import typingsSlinky.babylonjs.animationRangeMod.AnimationRange
import typingsSlinky.babylonjs.easingMod.EasingFunction
import typingsSlinky.babylonjs.easingMod.IEasingFunction
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathSizeMod.Size
import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Quaternion
import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.nodeMod.Node
import typingsSlinky.babylonjs.runtimeAnimationMod.RuntimeAnimation
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod {
  
  @JSImport("babylonjs/Animations/animation", "Animation")
  @js.native
  class Animation protected () extends StObject {
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
    
    /**
      * Stores the easing function of the animation
      */
    var _easingFunction: js.Any = js.native
    
    /**
      * The set of event that will be linked to this animation
      */
    var _events: js.Any = js.native
    
    /**
      * @hidden Internal use only
      */
    def _getKeyValue(value: js.Any): js.Any = js.native
    
    /**
      * @hidden Internal use only
      */
    def _interpolate(currentFrame: Double, state: IAnimationState): js.Any = js.native
    
    /**
      * Stores the key frames of the animation
      */
    var _keys: js.Any = js.native
    
    /**
      * Stores the animation ranges for the animation
      */
    var _ranges: js.Any = js.native
    
    /**
      * @hidden Internal use only
      */
    var _runtimeAnimations: js.Array[RuntimeAnimation] = js.native
    
    /**
      * Add an event to this animation
      * @param event Event to add
      */
    def addEvent(event: AnimationEvent): Unit = js.native
    
    /**
      * Stores the blending speed of the animation
      */
    var blendingSpeed: Double = js.native
    
    /**
      * Interpolates a Color3 linearly
      * @param startValue Start value of the animation curve
      * @param endValue End value of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated Color3 value
      */
    def color3InterpolateFunction(startValue: Color3, endValue: Color3, gradient: Double): Color3 = js.native
    
    /**
      * Interpolates a Color4 linearly
      * @param startValue Start value of the animation curve
      * @param endValue End value of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated Color3 value
      */
    def color4InterpolateFunction(startValue: Color4, endValue: Color4, gradient: Double): Color4 = js.native
    
    /**
      * Creates an animation range
      * @param name Name of the animation range
      * @param from Starting frame of the animation range
      * @param to Ending frame of the animation
      */
    def createRange(name: String, from: Double, to: Double): Unit = js.native
    
    /**The data type of the animation */
    var dataType: Double = js.native
    
    /**
      * Deletes an animation range by name
      * @param name Name of the animation range to delete
      * @param deleteFrames Specifies if the key frames for the range should also be deleted (true) or not (false)
      */
    def deleteRange(name: String): Unit = js.native
    def deleteRange(name: String, deleteFrames: Boolean): Unit = js.native
    
    /**Specifies if blending should be enabled */
    var enableBlending: js.UndefOr[Boolean] = js.native
    
    /**
      * Interpolates a scalar linearly
      * @param startValue Start value of the animation curve
      * @param endValue End value of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated scalar value
      */
    def floatInterpolateFunction(startValue: Double, endValue: Double, gradient: Double): Double = js.native
    
    /**
      * Interpolates a scalar cubically
      * @param startValue Start value of the animation curve
      * @param outTangent End tangent of the animation
      * @param endValue End value of the animation curve
      * @param inTangent Start tangent of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated scalar value
      */
    def floatInterpolateFunctionWithTangents(startValue: Double, outTangent: Double, endValue: Double, inTangent: Double, gradient: Double): Double = js.native
    
    /**The frames per second of the animation */
    var framePerSecond: Double = js.native
    
    /**
      * Gets the easing function of the animation
      * @returns Easing function of the animation
      */
    def getEasingFunction(): IEasingFunction = js.native
    
    /**
      * Retrieves all the events from the animation
      * @returns Events from the animation
      */
    def getEvents(): js.Array[AnimationEvent] = js.native
    
    /**
      * Gets the highest frame rate of the animation
      * @returns Highest frame rate of the animation
      */
    def getHighestFrame(): Double = js.native
    
    /**
      * Gets the key frames from the animation
      * @returns The key frames of the animation
      */
    def getKeys(): js.Array[IAnimationKey] = js.native
    
    /**
      * Gets the animation range by name, or null if not defined
      * @param name Name of the animation range
      * @returns Nullable animation range
      */
    def getRange(name: String): Nullable[AnimationRange] = js.native
    
    /**
      * Specifies if any of the runtime animations are currently running
      */
    def hasRunningRuntimeAnimations: Boolean = js.native
    
    /**The loop mode of the animation */
    var loopMode: js.UndefOr[Double] = js.native
    
    /**
      * Defines the function to use to interpolate matrices
      * @param startValue defines the start matrix
      * @param endValue defines the end matrix
      * @param gradient defines the gradient between both matrices
      * @param result defines an optional target matrix where to store the interpolation
      * @returns the interpolated matrix
      */
    def matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: Double): Matrix = js.native
    def matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: Double, result: Matrix): Matrix = js.native
    
    /**Name of the animation */
    var name: String = js.native
    
    /**
      * Interpolates a quaternion using a spherical linear interpolation
      * @param startValue Start value of the animation curve
      * @param endValue End value of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated quaternion value
      */
    def quaternionInterpolateFunction(startValue: Quaternion, endValue: Quaternion, gradient: Double): Quaternion = js.native
    
    /**
      * Interpolates a quaternion cubically
      * @param startValue Start value of the animation curve
      * @param outTangent End tangent of the animation curve
      * @param endValue End value of the animation curve
      * @param inTangent Start tangent of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated quaternion value
      */
    def quaternionInterpolateFunctionWithTangents(
      startValue: Quaternion,
      outTangent: Quaternion,
      endValue: Quaternion,
      inTangent: Quaternion,
      gradient: Double
    ): Quaternion = js.native
    
    /**
      * Remove all events found at the given frame
      * @param frame The frame to remove events from
      */
    def removeEvents(frame: Double): Unit = js.native
    
    /**
      * Return the array of runtime animations currently using this animation
      */
    def runtimeAnimations: js.Array[RuntimeAnimation] = js.native
    
    /**
      * Serializes the animation to an object
      * @returns Serialized object
      */
    def serialize(): js.Any = js.native
    
    /**
      * Sets the easing function of the animation
      * @param easingFunction A custom mathematical formula for animation
      */
    def setEasingFunction(easingFunction: EasingFunction): Unit = js.native
    
    /**
      * Sets the key frames of the animation
      * @param values The animation key frames to set
      */
    def setKeys(values: js.Array[IAnimationKey]): Unit = js.native
    
    /**
      * Interpolates a size linearly
      * @param startValue Start value of the animation curve
      * @param endValue End value of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated Size value
      */
    def sizeInterpolateFunction(startValue: Size, endValue: Size, gradient: Double): Size = js.native
    
    /** Snippet ID if the animation was created from the snippet server */
    var snippetId: String = js.native
    
    /**Property to animate */
    var targetProperty: String = js.native
    
    /**
      * Stores an array of target property paths
      */
    var targetPropertyPath: js.Array[String] = js.native
    
    def toString(fullDetails: Boolean): String = js.native
    
    /**
      * Interpolates a Vector2 linearly
      * @param startValue Start value of the animation curve
      * @param endValue End value of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated Vector2 value
      */
    def vector2InterpolateFunction(startValue: Vector2, endValue: Vector2, gradient: Double): Vector2 = js.native
    
    /**
      * Interpolates a Vector2 cubically
      * @param startValue Start value of the animation curve
      * @param outTangent End tangent of the animation
      * @param endValue End value of the animation curve
      * @param inTangent Start tangent of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated Vector2 value
      */
    def vector2InterpolateFunctionWithTangents(startValue: Vector2, outTangent: Vector2, endValue: Vector2, inTangent: Vector2, gradient: Double): Vector2 = js.native
    
    /**
      * Interpolates a Vector3 linearl
      * @param startValue Start value of the animation curve
      * @param endValue End value of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns Interpolated scalar value
      */
    def vector3InterpolateFunction(startValue: Vector3, endValue: Vector3, gradient: Double): Vector3 = js.native
    
    /**
      * Interpolates a Vector3 cubically
      * @param startValue Start value of the animation curve
      * @param outTangent End tangent of the animation
      * @param endValue End value of the animation curve
      * @param inTangent Start tangent of the animation curve
      * @param gradient Scalar amount to interpolate
      * @returns InterpolatedVector3 value
      */
    def vector3InterpolateFunctionWithTangents(startValue: Vector3, outTangent: Vector3, endValue: Vector3, inTangent: Vector3, gradient: Double): Vector3 = js.native
  }
  /* static members */
  object Animation {
    
    @JSImport("babylonjs/Animations/animation", "Animation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constant Loop Mode
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONLOOPMODE_CONSTANT")
    @js.native
    val ANIMATIONLOOPMODE_CONSTANT: Double = js.native
    
    /**
      * Cycle Loop Mode
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONLOOPMODE_CYCLE")
    @js.native
    val ANIMATIONLOOPMODE_CYCLE: Double = js.native
    
    /**
      * Relative Loop Mode
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONLOOPMODE_RELATIVE")
    @js.native
    val ANIMATIONLOOPMODE_RELATIVE: Double = js.native
    
    /**
      * Color3 animation type
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONTYPE_COLOR3")
    @js.native
    val ANIMATIONTYPE_COLOR3: Double = js.native
    
    /**
      * Color3 animation type
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONTYPE_COLOR4")
    @js.native
    val ANIMATIONTYPE_COLOR4: Double = js.native
    
    /**
      * Float animation type
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONTYPE_FLOAT")
    @js.native
    val ANIMATIONTYPE_FLOAT: Double = js.native
    
    /**
      * Matrix animation type
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONTYPE_MATRIX")
    @js.native
    val ANIMATIONTYPE_MATRIX: Double = js.native
    
    /**
      * Quaternion animation type
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONTYPE_QUATERNION")
    @js.native
    val ANIMATIONTYPE_QUATERNION: Double = js.native
    
    /**
      * Size animation type
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONTYPE_SIZE")
    @js.native
    val ANIMATIONTYPE_SIZE: Double = js.native
    
    /**
      * Vector2 animation type
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONTYPE_VECTOR2")
    @js.native
    val ANIMATIONTYPE_VECTOR2: Double = js.native
    
    /**
      * Vector3 animation type
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ANIMATIONTYPE_VECTOR3")
    @js.native
    val ANIMATIONTYPE_VECTOR3: Double = js.native
    
    /**
      * Use matrix interpolation instead of using direct key value when animating matrices
      */
    @JSImport("babylonjs/Animations/animation", "Animation.AllowMatricesInterpolation")
    @js.native
    def AllowMatricesInterpolation: Boolean = js.native
    @scala.inline
    def AllowMatricesInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatricesInterpolation")(x.asInstanceOf[js.Any])
    
    /**
      * When matrix interpolation is enabled, this boolean forces the system to use Matrix.DecomposeLerp instead of Matrix.Lerp. Interpolation is more precise but slower
      */
    @JSImport("babylonjs/Animations/animation", "Animation.AllowMatrixDecomposeForInterpolation")
    @js.native
    def AllowMatrixDecomposeForInterpolation: Boolean = js.native
    @scala.inline
    def AllowMatrixDecomposeForInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatrixDecomposeForInterpolation")(x.asInstanceOf[js.Any])
    
    /**
      * Appends the serialized animations from the source animations
      * @param source Source containing the animations
      * @param destination Target to store the animations
      */
    @JSImport("babylonjs/Animations/animation", "Animation.AppendSerializedAnimations")
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
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartAnimation")
    @js.native
    def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartAnimation")
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
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartAnimation")
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
      easingFunction: EasingFunction
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartAnimation")
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
      easingFunction: EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartAnimation")
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
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartAnimation")
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
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartAnimation")
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
      easingFunction: EasingFunction
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartAnimation")
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
      easingFunction: EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[Animatable] = js.native
    
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
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartHierarchyAnimation")
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
    ): Nullable[js.Array[Animatable]] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartHierarchyAnimation")
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
    ): Nullable[js.Array[Animatable]] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartHierarchyAnimation")
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
      easingFunction: EasingFunction
    ): Nullable[js.Array[Animatable]] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartHierarchyAnimation")
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
      easingFunction: EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[Animatable]] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartHierarchyAnimation")
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
    ): Nullable[js.Array[Animatable]] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartHierarchyAnimation")
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
    ): Nullable[js.Array[Animatable]] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartHierarchyAnimation")
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
      easingFunction: EasingFunction
    ): Nullable[js.Array[Animatable]] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAndStartHierarchyAnimation")
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
      easingFunction: EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[Animatable]] = js.native
    
    /**
      * Sets up an animation
      * @param property The property to animate
      * @param animationType The animation type to apply
      * @param framePerSecond The frames per second of the animation
      * @param easingFunction The easing function used in the animation
      * @returns The created animation
      */
    @JSImport("babylonjs/Animations/animation", "Animation.CreateAnimation")
    @js.native
    def CreateAnimation(property: String, animationType: Double, framePerSecond: Double, easingFunction: EasingFunction): Animation = js.native
    
    /**
      * Creates an animation or an array of animations from a snippet saved by the Inspector
      * @param snippetId defines the snippet to load
      * @returns a promise that will resolve to the new animation or a new array of animations
      */
    @JSImport("babylonjs/Animations/animation", "Animation.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String): js.Promise[Animation | js.Array[Animation]] = js.native
    
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
    @JSImport("babylonjs/Animations/animation", "Animation.CreateMergeAndStartAnimation")
    @js.native
    def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateMergeAndStartAnimation")
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
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateMergeAndStartAnimation")
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
      easingFunction: EasingFunction
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateMergeAndStartAnimation")
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
      easingFunction: EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateMergeAndStartAnimation")
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
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateMergeAndStartAnimation")
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
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateMergeAndStartAnimation")
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
      easingFunction: EasingFunction
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.CreateMergeAndStartAnimation")
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
      easingFunction: EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[Animatable] = js.native
    
    /**
      * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
      * @param sourceAnimation defines the Animation containing keyframes to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the Animation to convert
      * @param cloneOriginal defines whether or not to clone the animation and convert the clone or convert the original animation (default is false)
      * @param clonedName defines the name of the resulting cloned Animation if cloneOriginal is true
      * @returns a new Animation if cloneOriginal is true or the original Animation if cloneOriginal is false
      */
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimation: Animation): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean,
      clonedName: String
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimation: Animation, referenceFrame: js.UndefOr[scala.Nothing], range: String): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: Boolean
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimation: Animation, referenceFrame: Double): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean,
      clonedName: String
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimation: Animation, referenceFrame: Double, range: String): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: Double,
      range: String,
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimation: Animation, referenceFrame: Double, range: String, cloneOriginal: Boolean): Animation = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimation: Animation,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): Animation = js.native
    
    /**
      * Parses an animation object and creates an animation
      * @param parsedAnimation Parsed animation object
      * @returns Animation object
      */
    @JSImport("babylonjs/Animations/animation", "Animation.Parse")
    @js.native
    def Parse(parsedAnimation: js.Any): Animation = js.native
    
    /**
      * Creates a new animation or an array of animations from a snippet saved in a remote file
      * @param name defines the name of the animation to create (can be null or empty to use the one from the json data)
      * @param url defines the url to load from
      * @returns a promise that will resolve to the new animation or an array of animations
      */
    @JSImport("babylonjs/Animations/animation", "Animation.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String): js.Promise[Animation | js.Array[Animation]] = js.native
    
    /** Define the Url to load snippets */
    @JSImport("babylonjs/Animations/animation", "Animation.SnippetUrl")
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
    @JSImport("babylonjs/Animations/animation", "Animation.TransitionTo")
    @js.native
    def TransitionTo(
      property: String,
      targetValue: js.Any,
      host: js.Any,
      scene: Scene,
      frameRate: Double,
      transition: Animation,
      duration: Double
    ): Nullable[Animatable] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation.TransitionTo")
    @js.native
    def TransitionTo(
      property: String,
      targetValue: js.Any,
      host: js.Any,
      scene: Scene,
      frameRate: Double,
      transition: Animation,
      duration: Double,
      onAnimationEnd: Nullable[js.Function0[Unit]]
    ): Nullable[Animatable] = js.native
    
    /**
      * @hidden Internal use
      */
    @JSImport("babylonjs/Animations/animation", "Animation._PrepareAnimation")
    @js.native
    def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[Animation] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation._PrepareAnimation")
    @js.native
    def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: js.UndefOr[scala.Nothing],
      easingFunction: EasingFunction
    ): Nullable[Animation] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation._PrepareAnimation")
    @js.native
    def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[Animation] = js.native
    @JSImport("babylonjs/Animations/animation", "Animation._PrepareAnimation")
    @js.native
    def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: EasingFunction
    ): Nullable[Animation] = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Animations/animation", "Animation._UniversalLerp")
    @js.native
    def _UniversalLerp(left: js.Any, right: js.Any, amount: Double): js.Any = js.native
  }
  
  @JSImport("babylonjs/Animations/animation", "_IAnimationState")
  @js.native
  class IAnimationState () extends StObject {
    
    var highLimitValue: js.UndefOr[js.Any] = js.native
    
    var key: Double = js.native
    
    var loopMode: js.UndefOr[Double] = js.native
    
    var offsetValue: js.UndefOr[js.Any] = js.native
    
    var repeatCount: Double = js.native
    
    var workValue: js.UndefOr[js.Any] = js.native
  }
}
