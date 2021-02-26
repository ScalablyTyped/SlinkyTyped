package typingsSlinky.ol

import typingsSlinky.ol.centerconstraintMod.Type
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColoncenter
import typingsSlinky.ol.olStrings.changeColonresolution
import typingsSlinky.ol.olStrings.changeColonrotation
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.projMod.ProjectionLike
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.viewHintMod.ViewHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("ol/View", JSImport.Default)
  @js.native
  class default () extends View {
    def this(opt_options: ViewOptions) = this()
  }
  
  @JSImport("ol/View", "createCenterConstraint")
  @js.native
  def createCenterConstraint(options: ViewOptions): Type = js.native
  
  @JSImport("ol/View", "createResolutionConstraint")
  @js.native
  def createResolutionConstraint(options: ViewOptions): js.Any = js.native
  
  @JSImport("ol/View", "createRotationConstraint")
  @js.native
  def createRotationConstraint(options: ViewOptions): typingsSlinky.ol.rotationconstraintMod.Type = js.native
  
  @JSImport("ol/View", "isNoopAnimation")
  @js.native
  def isNoopAnimation(animation: Animation): Boolean = js.native
  
  @js.native
  trait Animation extends StObject {
    
    var anchor: js.UndefOr[Coordinate] = js.native
    
    def callback(p0: Boolean): Unit = js.native
    
    var complete: Boolean = js.native
    
    var duration: Double = js.native
    
    def easing(p0: Double): Double = js.native
    
    var sourceCenter: js.UndefOr[Coordinate] = js.native
    
    var sourceResolution: js.UndefOr[Double] = js.native
    
    var sourceRotation: js.UndefOr[Double] = js.native
    
    var start: Double = js.native
    
    var targetCenter: js.UndefOr[Coordinate] = js.native
    
    var targetResolution: js.UndefOr[Double] = js.native
    
    var targetRotation: js.UndefOr[Double] = js.native
  }
  object Animation {
    
    @scala.inline
    def apply(
      callback: Boolean => Unit,
      complete: Boolean,
      duration: Double,
      easing: Double => Double,
      start: Double
    ): Animation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), complete = complete.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Coordinate): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value :_*))
      
      @scala.inline
      def setCallback(value: Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceCenter(value: Coordinate): Self = StObject.set(x, "sourceCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCenterUndefined: Self = StObject.set(x, "sourceCenter", js.undefined)
      
      @scala.inline
      def setSourceCenterVarargs(value: Double*): Self = StObject.set(x, "sourceCenter", js.Array(value :_*))
      
      @scala.inline
      def setSourceResolution(value: Double): Self = StObject.set(x, "sourceResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceResolutionUndefined: Self = StObject.set(x, "sourceResolution", js.undefined)
      
      @scala.inline
      def setSourceRotation(value: Double): Self = StObject.set(x, "sourceRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRotationUndefined: Self = StObject.set(x, "sourceRotation", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetCenter(value: Coordinate): Self = StObject.set(x, "targetCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetCenterUndefined: Self = StObject.set(x, "targetCenter", js.undefined)
      
      @scala.inline
      def setTargetCenterVarargs(value: Double*): Self = StObject.set(x, "targetCenter", js.Array(value :_*))
      
      @scala.inline
      def setTargetResolution(value: Double): Self = StObject.set(x, "targetResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetResolutionUndefined: Self = StObject.set(x, "targetResolution", js.undefined)
      
      @scala.inline
      def setTargetRotation(value: Double): Self = StObject.set(x, "targetRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRotationUndefined: Self = StObject.set(x, "targetRotation", js.undefined)
    }
  }
  
  @js.native
  trait AnimationOptions extends StObject {
    
    var anchor: js.UndefOr[Coordinate] = js.native
    
    var center: js.UndefOr[Coordinate] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* p0 */ Double, Double]] = js.native
    
    var resolution: js.UndefOr[Double] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var zoom: js.UndefOr[Double] = js.native
  }
  object AnimationOptions {
    
    @scala.inline
    def apply(): AnimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationOptions]
    }
    
    @scala.inline
    implicit class AnimationOptionsMutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Coordinate): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value :_*))
      
      @scala.inline
      def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* p0 */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait Constraints extends StObject {
    
    def center(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size): js.UndefOr[Coordinate] = js.native
    def center(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size, p3: Boolean): js.UndefOr[Coordinate] = js.native
    def center(p0: Coordinate, p1: Double, p2: Size): js.UndefOr[Coordinate] = js.native
    def center(p0: Coordinate, p1: Double, p2: Size, p3: Boolean): js.UndefOr[Coordinate] = js.native
    @JSName("center")
    var center_Original: Type = js.native
    
    def resolution(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size): js.UndefOr[Double] = js.native
    def resolution(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size, p3: Boolean): js.UndefOr[Double] = js.native
    def resolution(p0: Double, p1: Double, p2: Size): js.UndefOr[Double] = js.native
    def resolution(p0: Double, p1: Double, p2: Size, p3: Boolean): js.UndefOr[Double] = js.native
    @JSName("resolution")
    var resolution_Original: typingsSlinky.ol.resolutionconstraintMod.Type = js.native
    
    def rotation(): js.UndefOr[Double] = js.native
    def rotation(p0: js.UndefOr[scala.Nothing], p1: Boolean): js.UndefOr[Double] = js.native
    def rotation(p0: Double): js.UndefOr[Double] = js.native
    def rotation(p0: Double, p1: Boolean): js.UndefOr[Double] = js.native
    @JSName("rotation")
    var rotation_Original: typingsSlinky.ol.rotationconstraintMod.Type = js.native
  }
  
  @js.native
  trait FitOptions extends StObject {
    
    var callback: js.UndefOr[js.Function1[/* p0 */ Boolean, Unit]] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* p0 */ Double, Double]] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var nearest: js.UndefOr[Boolean] = js.native
    
    var padding: js.UndefOr[js.Array[Double]] = js.native
    
    var size: js.UndefOr[Size] = js.native
  }
  object FitOptions {
    
    @scala.inline
    def apply(): FitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitOptions]
    }
    
    @scala.inline
    implicit class FitOptionsMutableBuilder[Self <: FitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* p0 */ Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* p0 */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setNearest(value: Boolean): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var center: Coordinate = js.native
    
    var projection: typingsSlinky.ol.projectionMod.default = js.native
    
    var resolution: Double = js.native
    
    var rotation: Double = js.native
    
    var zoom: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      center: Coordinate,
      projection: typingsSlinky.ol.projectionMod.default,
      resolution: Double,
      rotation: Double,
      zoom: Double
    ): State = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: typingsSlinky.ol.projectionMod.default): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait View
    extends typingsSlinky.ol.objectMod.default {
    
    /**
      * Adds relative coordinates to the center of the view. Any extent constraint will apply.
      */
    def adjustCenter(deltaCoordinates: Coordinate): Unit = js.native
    
    /**
      * Adds relative coordinates to the center of the view. Any extent constraint will apply.
      */
    def adjustCenterInternal(deltaCoordinates: Coordinate): Unit = js.native
    
    /**
      * Multiply the view resolution by a ratio, optionally using an anchor. Any resolution
      * constraint will apply.
      */
    def adjustResolution(ratio: Double): Unit = js.native
    def adjustResolution(ratio: Double, opt_anchor: Coordinate): Unit = js.native
    
    /**
      * Multiply the view resolution by a ratio, optionally using an anchor. Any resolution
      * constraint will apply.
      */
    def adjustResolutionInternal(ratio: Double): Unit = js.native
    def adjustResolutionInternal(ratio: Double, opt_anchor: Coordinate): Unit = js.native
    
    /**
      * Adds a value to the view rotation, optionally using an anchor. Any rotation
      * constraint will apply.
      */
    def adjustRotation(delta: Double): Unit = js.native
    def adjustRotation(delta: Double, opt_anchor: Coordinate): Unit = js.native
    
    def adjustRotationInternal(delta: Double): Unit = js.native
    def adjustRotationInternal(delta: Double, opt_anchor: Coordinate): Unit = js.native
    
    /**
      * Adds a value to the view zoom level, optionally using an anchor. Any resolution
      * constraint will apply.
      */
    def adjustZoom(delta: Double): Unit = js.native
    def adjustZoom(delta: Double, opt_anchor: Coordinate): Unit = js.native
    
    /**
      * Animate the view.  The view's center, zoom (or resolution), and rotation
      * can be animated for smooth transitions between view states.  For example,
      * to animate the view to a new zoom level:
      * By default, the animation lasts one second and uses in-and-out easing.  You
      * can customize this behavior by including duration (in milliseconds) and
      * easing options (see {@link module:ol/easing}).
      * To chain together multiple animations, call the method with multiple
      * animation objects.  For example, to first zoom and then pan:
      * If you provide a function as the last argument to the animate method, it
      * will get called at the end of an animation series.  The callback will be
      * called with true if the animation series completed on its own or false
      * if it was cancelled.
      * Animations are cancelled by user interactions (e.g. dragging the map) or by
      * calling view.setCenter(), view.setResolution(), or view.setRotation()
      * (or another method that calls one of these).
      */
    def animate(var_args: (AnimationOptions | (js.Function1[/* p0 */ Boolean, Unit]))*): Unit = js.native
    
    def animateInternal(var_args: (AnimationOptions | (js.Function1[/* p0 */ Boolean, Unit]))*): Unit = js.native
    
    /**
      * Set up the view with the given options.
      */
    def applyOptions_(options: ViewOptions): Unit = js.native
    
    /**
      * Notify the View that an interaction has started.
      * The view state will be resolved to a stable one if needed
      * (depending on its constraints).
      */
    def beginInteraction(): Unit = js.native
    
    def calculateCenterRotate(rotation: Double, anchor: Coordinate): js.UndefOr[Coordinate] = js.native
    
    def calculateCenterZoom(resolution: Double, anchor: Coordinate): js.UndefOr[Coordinate] = js.native
    
    /**
      * Calculate the extent for the current view state and the passed size.
      * The size is the pixel dimensions of the box into which the calculated extent
      * should fit. In most cases you want to get the extent of the entire map,
      * that is map.getSize().
      */
    def calculateExtent(): Extent = js.native
    def calculateExtent(opt_size: Size): Extent = js.native
    
    def calculateExtentInternal(): Extent = js.native
    def calculateExtentInternal(opt_size: Size): Extent = js.native
    
    /**
      * Cancel any ongoing animations.
      */
    def cancelAnimations(): Unit = js.native
    
    /**
      * Center on coordinate and view position.
      */
    def centerOn(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
    
    def centerOnInternal(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
    
    /**
      * Notify the View that an interaction has ended. The view state will be resolved
      * to a stable one if needed (depending on its constraints).
      */
    def endInteraction(): Unit = js.native
    def endInteraction(
      opt_duration: js.UndefOr[scala.Nothing],
      opt_resolutionDirection: js.UndefOr[scala.Nothing],
      opt_anchor: Coordinate
    ): Unit = js.native
    def endInteraction(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double): Unit = js.native
    def endInteraction(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
    def endInteraction(opt_duration: Double): Unit = js.native
    def endInteraction(opt_duration: Double, opt_resolutionDirection: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
    def endInteraction(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
    def endInteraction(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
    
    /**
      * Notify the View that an interaction has ended. The view state will be resolved
      * to a stable one if needed (depending on its constraints).
      */
    def endInteractionInternal(): Unit = js.native
    def endInteractionInternal(
      opt_duration: js.UndefOr[scala.Nothing],
      opt_resolutionDirection: js.UndefOr[scala.Nothing],
      opt_anchor: Coordinate
    ): Unit = js.native
    def endInteractionInternal(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double): Unit = js.native
    def endInteractionInternal(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
    def endInteractionInternal(opt_duration: Double): Unit = js.native
    def endInteractionInternal(opt_duration: Double, opt_resolutionDirection: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
    def endInteractionInternal(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
    def endInteractionInternal(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
    
    def fit(geometryOrExtent: Extent): Unit = js.native
    def fit(geometryOrExtent: Extent, opt_options: FitOptions): Unit = js.native
    /**
      * Fit the given geometry or extent based on the given map size and border.
      * The size is pixel dimensions of the box to fit the extent into.
      * In most cases you will want to use the map size, that is map.getSize().
      * Takes care of the map angle.
      */
    def fit(geometryOrExtent: typingsSlinky.ol.simpleGeometryMod.default): Unit = js.native
    def fit(geometryOrExtent: typingsSlinky.ol.simpleGeometryMod.default, opt_options: FitOptions): Unit = js.native
    
    def fitInternal(geometry: typingsSlinky.ol.simpleGeometryMod.default): Unit = js.native
    def fitInternal(geometry: typingsSlinky.ol.simpleGeometryMod.default, opt_options: FitOptions): Unit = js.native
    
    /**
      * Determine if the view is being animated.
      */
    def getAnimating(): Boolean = js.native
    
    /**
      * Get the view center.
      */
    def getCenter(): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get the view center without transforming to user projection.
      */
    def getCenterInternal(): js.UndefOr[Coordinate] = js.native
    
    def getConstrainResolution(): Boolean = js.native
    
    /**
      * Get a valid position for the view center according to the current constraints.
      */
    def getConstrainedCenter(): js.UndefOr[Coordinate] = js.native
    def getConstrainedCenter(targetCenter: js.UndefOr[scala.Nothing], opt_targetResolution: Double): js.UndefOr[Coordinate] = js.native
    def getConstrainedCenter(targetCenter: Coordinate): js.UndefOr[Coordinate] = js.native
    def getConstrainedCenter(targetCenter: Coordinate, opt_targetResolution: Double): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get a valid resolution according to the current view constraints.
      */
    def getConstrainedResolution(): js.UndefOr[Double] = js.native
    def getConstrainedResolution(targetResolution: js.UndefOr[scala.Nothing], opt_direction: Double): js.UndefOr[Double] = js.native
    def getConstrainedResolution(targetResolution: Double): js.UndefOr[Double] = js.native
    def getConstrainedResolution(targetResolution: Double, opt_direction: Double): js.UndefOr[Double] = js.native
    
    /**
      * Get a valid zoom level according to the current view constraints.
      */
    def getConstrainedZoom(): js.UndefOr[Double] = js.native
    def getConstrainedZoom(targetZoom: js.UndefOr[scala.Nothing], opt_direction: Double): js.UndefOr[Double] = js.native
    def getConstrainedZoom(targetZoom: Double): js.UndefOr[Double] = js.native
    def getConstrainedZoom(targetZoom: Double, opt_direction: Double): js.UndefOr[Double] = js.native
    
    def getConstraints(): Constraints = js.native
    
    def getHints(): js.Array[Double] = js.native
    def getHints(opt_hints: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * Determine if the user is interacting with the view, such as panning or zooming.
      */
    def getInteracting(): Boolean = js.native
    
    /**
      * Get the maximum resolution of the view.
      */
    def getMaxResolution(): Double = js.native
    
    /**
      * Get the maximum zoom level for the view.
      */
    def getMaxZoom(): Double = js.native
    
    /**
      * Get the minimum resolution of the view.
      */
    def getMinResolution(): Double = js.native
    
    /**
      * Get the minimum zoom level for the view.
      */
    def getMinZoom(): Double = js.native
    
    /**
      * Get the view projection.
      */
    def getProjection(): typingsSlinky.ol.projectionMod.default = js.native
    
    /**
      * Get the view resolution.
      */
    def getResolution(): js.UndefOr[Double] = js.native
    
    /**
      * Get the resolution for a provided extent (in map units) and size (in pixels).
      */
    def getResolutionForExtent(extent: Extent): Double = js.native
    def getResolutionForExtent(extent: Extent, opt_size: Size): Double = js.native
    
    /**
      * Get the resolution for a provided extent (in map units) and size (in pixels).
      */
    def getResolutionForExtentInternal(extent: Extent): Double = js.native
    def getResolutionForExtentInternal(extent: Extent, opt_size: Size): Double = js.native
    
    /**
      * Return a function that returns a value between 0 and 1 for a
      * resolution. Exponential scaling is assumed.
      */
    def getResolutionForValueFunction(): js.Function1[/* p0 */ Double, Double] = js.native
    def getResolutionForValueFunction(opt_power: Double): js.Function1[/* p0 */ Double, Double] = js.native
    
    /**
      * Get the resolution for a zoom level.
      */
    def getResolutionForZoom(zoom: Double): Double = js.native
    
    /**
      * Get the resolutions for the view. This returns the array of resolutions
      * passed to the constructor of the View, or undefined if none were given.
      */
    def getResolutions(): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Get the view rotation.
      */
    def getRotation(): Double = js.native
    
    def getState(): State = js.native
    
    /**
      * Get an updated version of the view options used to construct the view.  The
      * current resolution (or zoom), center, and rotation are applied to any stored
      * options.  The provided options can be used to apply new min/max zoom or
      * resolution limits.
      */
    def getUpdatedOptions_(newOptions: ViewOptions): ViewOptions = js.native
    
    /**
      * Return a function that returns a resolution for a value between
      * 0 and 1. Exponential scaling is assumed.
      */
    def getValueForResolutionFunction(): js.Function1[/* p0 */ Double, Double] = js.native
    def getValueForResolutionFunction(opt_power: Double): js.Function1[/* p0 */ Double, Double] = js.native
    
    /**
      * Get the current zoom level. This method may return non-integer zoom levels
      * if the view does not constrain the resolution, or if an interaction or
      * animation is underway.
      */
    def getZoom(): js.UndefOr[Double] = js.native
    
    /**
      * Get the zoom level for a resolution.
      */
    def getZoomForResolution(resolution: Double): js.UndefOr[Double] = js.native
    
    def isDef(): Boolean = js.native
    
    @JSName("on")
    def on_changecenter(`type`: changeColoncenter, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeresolution(`type`: changeColonresolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changerotation(`type`: changeColonrotation, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changecenter(`type`: changeColoncenter, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeresolution(`type`: changeColonresolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changerotation(`type`: changeColonrotation, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * If any constraints need to be applied, an animation will be triggered.
      * This is typically done on interaction end.
      * Note: calling this with a duration of 0 will apply the constrained values straight away,
      * without animation.
      */
    def resolveConstraints(): Unit = js.native
    def resolveConstraints(
      opt_duration: js.UndefOr[scala.Nothing],
      opt_resolutionDirection: js.UndefOr[scala.Nothing],
      opt_anchor: Coordinate
    ): Unit = js.native
    def resolveConstraints(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double): Unit = js.native
    def resolveConstraints(opt_duration: js.UndefOr[scala.Nothing], opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
    def resolveConstraints(opt_duration: Double): Unit = js.native
    def resolveConstraints(opt_duration: Double, opt_resolutionDirection: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
    def resolveConstraints(opt_duration: Double, opt_resolutionDirection: Double): Unit = js.native
    def resolveConstraints(opt_duration: Double, opt_resolutionDirection: Double, opt_anchor: Coordinate): Unit = js.native
    
    /**
      * Set the center of the current view. Any extent constraint will apply.
      */
    def setCenter(): Unit = js.native
    def setCenter(center: Coordinate): Unit = js.native
    
    /**
      * Set the center using the view projection (not the user projection).
      */
    def setCenterInternal(): Unit = js.native
    def setCenterInternal(center: Coordinate): Unit = js.native
    
    /**
      * Set whether the view shoud allow intermediary zoom levels.
      */
    def setConstrainResolution(enabled: Boolean): Unit = js.native
    
    def setHint(hint: ViewHint, delta: Double): Double = js.native
    
    /**
      * Set a new maximum zoom level for the view.
      */
    def setMaxZoom(zoom: Double): Unit = js.native
    
    /**
      * Set a new minimum zoom level for the view.
      */
    def setMinZoom(zoom: Double): Unit = js.native
    
    /**
      * Set the resolution for this view. Any resolution constraint will apply.
      */
    def setResolution(): Unit = js.native
    def setResolution(resolution: Double): Unit = js.native
    
    /**
      * Set the rotation for this view. Any rotation constraint will apply.
      */
    def setRotation(rotation: Double): Unit = js.native
    
    /**
      * Stores the viewport size on the view. The viewport size is not read every time from the DOM
      * to avoid performance hit and layout reflow.
      * This should be done on map size change.
      * Note: the constraints are not resolved during an animation to avoid stopping it
      */
    def setViewportSize(): Unit = js.native
    def setViewportSize(opt_size: Size): Unit = js.native
    
    /**
      * Zoom to a specific zoom level. Any resolution constrain will apply.
      */
    def setZoom(zoom: Double): Unit = js.native
    
    @JSName("un")
    def un_changecenter(`type`: changeColoncenter, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeresolution(`type`: changeColonresolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changerotation(`type`: changeColonrotation, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    
    /**
      * Update all animations.
      */
    def updateAnimations_(): Unit = js.native
  }
  
  @js.native
  trait ViewOptions extends StObject {
    
    var center: js.UndefOr[Coordinate] = js.native
    
    var constrainOnlyCenter: js.UndefOr[Boolean] = js.native
    
    var constrainResolution: js.UndefOr[Boolean] = js.native
    
    var constrainRotation: js.UndefOr[Boolean | Double] = js.native
    
    var enableRotation: js.UndefOr[Boolean] = js.native
    
    var extent: js.UndefOr[Extent] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var multiWorld: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var resolution: js.UndefOr[Double] = js.native
    
    var resolutions: js.UndefOr[js.Array[Double]] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var showFullExtent: js.UndefOr[Boolean] = js.native
    
    var smoothExtentConstraint: js.UndefOr[Boolean] = js.native
    
    var smoothResolutionConstraint: js.UndefOr[Boolean] = js.native
    
    var zoom: js.UndefOr[Double] = js.native
    
    var zoomFactor: js.UndefOr[Double] = js.native
  }
  object ViewOptions {
    
    @scala.inline
    def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    @scala.inline
    implicit class ViewOptionsMutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
      
      @scala.inline
      def setConstrainOnlyCenter(value: Boolean): Self = StObject.set(x, "constrainOnlyCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainOnlyCenterUndefined: Self = StObject.set(x, "constrainOnlyCenter", js.undefined)
      
      @scala.inline
      def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
      
      @scala.inline
      def setConstrainRotation(value: Boolean | Double): Self = StObject.set(x, "constrainRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainRotationUndefined: Self = StObject.set(x, "constrainRotation", js.undefined)
      
      @scala.inline
      def setEnableRotation(value: Boolean): Self = StObject.set(x, "enableRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRotationUndefined: Self = StObject.set(x, "enableRotation", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setMultiWorld(value: Boolean): Self = StObject.set(x, "multiWorld", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiWorldUndefined: Self = StObject.set(x, "multiWorld", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      @scala.inline
      def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setShowFullExtent(value: Boolean): Self = StObject.set(x, "showFullExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFullExtentUndefined: Self = StObject.set(x, "showFullExtent", js.undefined)
      
      @scala.inline
      def setSmoothExtentConstraint(value: Boolean): Self = StObject.set(x, "smoothExtentConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothExtentConstraintUndefined: Self = StObject.set(x, "smoothExtentConstraint", js.undefined)
      
      @scala.inline
      def setSmoothResolutionConstraint(value: Boolean): Self = StObject.set(x, "smoothResolutionConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothResolutionConstraintUndefined: Self = StObject.set(x, "smoothResolutionConstraint", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
