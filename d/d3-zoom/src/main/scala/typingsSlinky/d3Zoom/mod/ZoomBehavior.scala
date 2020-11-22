package typingsSlinky.d3Zoom.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.d3Interpolate.mod.ZoomView
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.d3Selection.mod.TransitionLike
import typingsSlinky.d3Selection.mod.ValueFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomBehavior[ZoomRefElement /* <: Element */, Datum]
  extends js.Function {
  
  /**
    * Applies this zoom behavior to the specified selection, binding the necessary event listeners to
    * allow panning and zooming, and initializing the zoom transform on each selected element to the identity transform if not already defined. This function is typically not invoked directly,
    * and is instead invoked via selection.call.
    *
    * For details see: {@link https://github.com/d3/d3-zoom#_zoom}
    *
    * @param selection A D3 selection of elements.
    * @param args Optional arguments to be passed in.
    */
  def apply(selection: Selection_[ZoomRefElement, Datum, _, _], args: js.Any*): Unit = js.native
  
  /**
    * Return the current click distance threshold, which defaults to zero.
    */
  def clickDistance(): Double = js.native
  /**
    * Set the maximum distance that the mouse can move between mousedown and mouseup that will trigger
    * a subsequent click event. If at any point between mousedown and mouseup the mouse is greater than or equal to
    * distance from its position on mousedown, the click event following mouseup will be suppressed.
    *
    * @param distance The distance threshold between mousedown and mouseup measured in client coordinates (event.clientX and event.clientY).
    * The default is zero.
    */
  def clickDistance(distance: Double): this.type = js.native
  
  /**
    * Returns the current constraint function.
    * The default implementation attempts to ensure that the viewport extent does not go outside the translate extent.
    */
  def constrain(): js.Function3[
    /* transform */ ZoomTransform_, 
    /* extent */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* translateExtent */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    ZoomTransform_
  ] = js.native
  /**
    * Sets the transform constraint function to the specified function and returns the zoom behavior.
    *
    * @param constraint A constraint function which returns a transform given the current transform, viewport extent and translate extent.
    * The default implementation attempts to ensure that the viewport extent does not go outside the translate extent.
    */
  def constrain(
    constraint: js.Function3[
      /* transform */ ZoomTransform_, 
      /* extent */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
      /* translateExtent */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
      ZoomTransform_
    ]
  ): this.type = js.native
  
  /**
    * Get the duration for zoom transitions on double-click and double-tap in milliseconds.
    */
  def duration(): Double = js.native
  /**
    * Set the duration for zoom transitions on double-click and double-tap to the specified number of milliseconds and returns the zoom behavior.
    *
    * To disable double-click and double-tap transitions, you can remove the zoom behavior’s dblclick event listener after applying the zoom behavior to the selection.
    *
    * @param duration in milliseconds.
    */
  def duration(duration: Double): this.type = js.native
  
  /**
    * Return the current extent accessor, which defaults to [[0, 0], [width, height]] where width is the client width of the element and height is its client height;
    * for SVG elements, the nearest ancestor SVG element’s width and height is used. In this case,
    * the owner SVG element must have defined width and height attributes rather than (for example) relying on CSS properties or the viewBox attribute;
    * SVG provides no programmatic method for retrieving the initial viewport size. Alternatively, consider using element.getBoundingClientRect.
    * (In Firefox, element.clientWidth and element.clientHeight is zero for SVG elements!)
    */
  def extent(): js.ThisFunction1[
    /* this */ ZoomRefElement, 
    /* datum */ Datum, 
    js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  ] = js.native
  /**
    * Set the viewport extent to the array of points [[x0, y0], [x1, y1]] returned by the
    * extent accessor function, and return this zoom behavior.
    * The extent accessor function is evaluated for each element.
    *
    * [x0, y0] is the top-left corner of the viewport and [x1, y1] is the bottom-right corner of the viewport.
    *
    * The viewport extent affects several functions: the center of the viewport remains fixed during changes by zoom.scaleBy and zoom.scaleTo;
    * the viewport center and dimensions affect the path chosen by d3.interpolateZoom; and the viewport extent is needed to enforce the optional translate extent.
    *
    * The default is [[0, 0], [width, height]] where width is the client width of the element and height is its client height;
    * for SVG elements, the nearest ancestor SVG element’s width and height is used.
    * In this case, the owner SVG element must have defined width and height attributes rather than (for example) relying on CSS properties or the viewBox attribute;
    * SVG provides no programmatic method for retrieving the initial viewport size. Alternatively, consider using element.getBoundingClientRect.
    * (In Firefox, element.clientWidth and element.clientHeight is zero for SVG elements!)
    *
    * @extent An extent accessor function which is evaluated for each selected element, being passed the current datum d, with the this context as the current DOM element.
    * The function returns the extent array.
    */
  def extent(
    extent: js.ThisFunction1[
      /* this */ ZoomRefElement, 
      /* datum */ Datum, 
      js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
    ]
  ): this.type = js.native
  /**
    * Set the viewport extent to the specified array of points [[x0, y0], [x1, y1]],
    * where [x0, y0] is the top-left corner of the viewport and [x1, y1] is the bottom-right corner of the viewport,
    * and return this zoom behavior.
    *
    * The viewport extent affects several functions: the center of the viewport remains fixed during changes by zoom.scaleBy and zoom.scaleTo;
    * the viewport center and dimensions affect the path chosen by d3.interpolateZoom; and the viewport extent is needed to enforce the optional translate extent.
    *
    * @param extent An extent specified as an array of two coordinates.
    */
  def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
  
  /**
    * Returns the current filter function.
    */
  def filter(): js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* datum */ Datum, Boolean] = js.native
  /**
    * Sets the filter to the specified filter function and returns the zoom behavior.
    * The filter function is invoked in the zoom initiating event handlers of each element to which the zoom behavior was applied.
    *
    * If the filter returns falsey, the initiating event is ignored and no zoom gesture is started.
    * Thus, the filter determines which input events are ignored. The default filter ignores mousedown events on secondary buttons,
    * since those buttons are typically intended for other purposes, such as the context menu.
    *
    * @param filter A filter function which is invoked in the zoom initiating event handlers of each element to which the zoom behavior was applied,
    * in order, being passed the current event (event) and datum d, with the this context as the current DOM element.
    * The function returns a boolean value.
    */
  def filter(
    filter: js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* datum */ Datum, Boolean]
  ): this.type = js.native
  
  /**
    * Sets the interpolation factory for zoom transitions to the specified function.
    * Use the default d3.interpolateZoom to implement smooth zooming.
    * To apply direct interpolation between two views, try d3.interpolate instead.
    *
    * Each view is defined as an array of three numbers: cx, cy and width. The first two coordinates cx, cy represent the center of the viewport;
    * the last coordinate width represents the size of the viewport.
    *
    * @param interpolatorFactory An interpolator factory to be used to generate interpolators between zooms for transitions.
    */
  def interpolate(
    interpolatorFactory: js.Function2[/* a */ ZoomView, /* b */ ZoomView, js.Function1[/* t */ Double, ZoomView]]
  ): this.type = js.native
  /**
    * Returns the current interpolation factory, which defaults to d3.interpolateZoom to implement smooth zooming.
    */
  def interpolate[InterpolationFactory /* <: js.Function2[/* a */ ZoomView, /* b */ ZoomView, js.Function1[/* t */ Double, ZoomView]] */](): InterpolationFactory = js.native
  
  /**
    * Return the first currently-assigned listener matching the specified typenames, if any.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after zooming begins [such as mousedown]), zoom (after a change to the zoom  transform [such as mousemove], or
    * end (after an active pointer becomes inactive [such as on mouseup].)
    */
  def on(typenames: String): js.UndefOr[
    js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* d */ Datum, Unit]
  ] = js.native
  /**
    * Set the event listener for the specified typenames and return the zoom behavior.
    * If an event listener was already registered for the same type and name,
    * the existing listener is removed before the new listener is added.
    * When a specified event is dispatched, each listener will be invoked with the same context and arguments as selection.on listeners.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after zooming begins [such as mousedown]), zoom (after a change to the zoom  transform [such as mousemove], or
    * end (after an active pointer becomes inactive [such as on mouseup].)
    * @param listener An event listener function which is evaluated for each selected element,
    * in order, being passed the current event (event) and datum d, with the this context as the current DOM element.
    */
  def on(
    typenames: String,
    listener: js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* d */ Datum, Unit]
  ): this.type = js.native
  /**
    * Remove the current event listeners for the specified typenames, if any, return the drag behavior.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace.
    * Each typename is a type, optionally followed by a period (.) and a name, such as "drag.foo"" and "drag.bar";
    * the name allows multiple listeners to be registered for the same type. The type must be one of the following:
    * start (after zooming begins [such as mousedown]), zoom (after a change to the zoom  transform [such as mousemove], or
    * end (after an active pointer becomes inactive [such as on mouseup].)
    * @param listener Use null to remove the listener.
    */
  def on(typenames: String, listener: Null): this.type = js.native
  
  /**
    * If selection is a selection, scales the current zoom transform of the selected elements by k, such that the new k₁ = k₀k.
    * The reference point p does move.
    * If p is not specified, it defaults to the center of the viewport extent.
    * If selection is a transition, defines a “zoom” tween translating the current transform.
    * This method is a convenience method for zoom.transform.
    *
    * @param selection A selection or a transition.
    * @param k Scale factor. A number or a function that returns a number.
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    * @param p A two-element array [px,py] or a function.
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    */
  def scaleBy(selection: Selection_[ZoomRefElement, Datum, _, _], k: Double): Unit = js.native
  def scaleBy(selection: Selection_[ZoomRefElement, Datum, _, _], k: Double, p: js.Tuple2[Double, Double]): Unit = js.native
  def scaleBy(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    k: Double,
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def scaleBy(selection: Selection_[ZoomRefElement, Datum, _, _], k: ValueFn[ZoomRefElement, Datum, Double]): Unit = js.native
  def scaleBy(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    k: ValueFn[ZoomRefElement, Datum, Double],
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def scaleBy(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    k: ValueFn[ZoomRefElement, Datum, Double],
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def scaleBy(selection: TransitionLike[ZoomRefElement, Datum], k: Double): Unit = js.native
  def scaleBy(selection: TransitionLike[ZoomRefElement, Datum], k: Double, p: js.Tuple2[Double, Double]): Unit = js.native
  def scaleBy(
    selection: TransitionLike[ZoomRefElement, Datum],
    k: Double,
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def scaleBy(selection: TransitionLike[ZoomRefElement, Datum], k: ValueFn[ZoomRefElement, Datum, Double]): Unit = js.native
  def scaleBy(
    selection: TransitionLike[ZoomRefElement, Datum],
    k: ValueFn[ZoomRefElement, Datum, Double],
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def scaleBy(
    selection: TransitionLike[ZoomRefElement, Datum],
    k: ValueFn[ZoomRefElement, Datum, Double],
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  
  /**
    * Return the current scale extent.
    */
  def scaleExtent(): js.Tuple2[Double, Double] = js.native
  /**
    * Set the scale extent to the specified array of numbers [k0, k1] where k0 is the minimum allowed scale factor and k1 is the maximum allowed scale factor,
    * and return this zoom behavior.
    *
    * The scale extent restricts zooming in and out. It is enforced on interaction and when using zoom.scaleBy, zoom.scaleTo and zoom.translateBy;
    * however, it is not enforced when using zoom.transform to set the transform explicitly.
    *
    * The default scale extent is [0, infinity].
    *
    * If the user tries to zoom by wheeling when already at the corresponding limit of the scale extent, the wheel events will be ignored and not initiate a zoom gesture.
    * This allows the user to scroll down past a zoomable area after zooming in, or to scroll up after zooming out.
    * If you would prefer to always prevent scrolling on wheel input regardless of the scale extent, register a wheel event listener to prevent the browser default behavior
    *
    * @param extent A scale extent array of two numbers representing the scale boundaries.
    */
  def scaleExtent(extent: js.Tuple2[Double, Double]): this.type = js.native
  
  /**
    * If selection is a selection, scales the current zoom transform of the selected elements to k, such that the new k₁ = k.
    * The reference point p does move.
    * If p is not specified, it defaults to the center of the viewport extent.
    * If selection is a transition, defines a “zoom” tween translating the current transform.
    * This method is a convenience method for zoom.transform.
    *
    * @param selection: A selection or a transition.
    * @param k Scale factor. A number or a function that returns a number.
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    * @param p A two-element array [px,py] or a function.
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    */
  def scaleTo(selection: Selection_[ZoomRefElement, Datum, _, _], k: Double): Unit = js.native
  def scaleTo(selection: Selection_[ZoomRefElement, Datum, _, _], k: Double, p: js.Tuple2[Double, Double]): Unit = js.native
  def scaleTo(selection: Selection_[ZoomRefElement, Datum, _, _], k: ValueFn[ZoomRefElement, Datum, Double]): Unit = js.native
  def scaleTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    k: ValueFn[ZoomRefElement, Datum, Double],
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def scaleTo(selection: TransitionLike[ZoomRefElement, Datum], k: Double): Unit = js.native
  def scaleTo(selection: TransitionLike[ZoomRefElement, Datum], k: Double, p: js.Tuple2[Double, Double]): Unit = js.native
  def scaleTo(selection: TransitionLike[ZoomRefElement, Datum], k: ValueFn[ZoomRefElement, Datum, Double]): Unit = js.native
  def scaleTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    k: ValueFn[ZoomRefElement, Datum, Double],
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  
  /**
    * Return the current tap distance threshold, which defaults to 10.
    */
  def tapDistance(): Double = js.native
  /**
    * Sets the maximum distance that a double-tap gesture can move between first touchstart and second touchend that will trigger a subsequent double-click event.
    *
    * @param distance The distance threshold between mousedown and mouseup measured in client coordinates (event.clientX and event.clientY).
    * The default is 10.
    */
  def tapDistance(distance: Double): this.type = js.native
  
  /**
    * Returns the current touch support detector, which defaults to a function returning true,
    * if the "ontouchstart" event is supported on the current element.
    */
  def touchable(): ValueFn[ZoomRefElement, Datum, Boolean] = js.native
  /**
    * Sets the touch support detector to the specified boolean value and returns the zoom behavior.
    *
    * Touch event listeners are only registered if the detector returns truthy for the corresponding element when the zoom behavior is applied.
    * The default detector works well for most browsers that are capable of touch input, but not all; Chrome’s mobile device emulator, for example,
    * fails detection.
    *
    * @param touchable A boolean value. true when touch event listeners should be applied to the corresponding element, otherwise false.
    */
  def touchable(touchable: Boolean): this.type = js.native
  /**
    * Sets the touch support detector to the specified function and returns the zoom behavior.
    *
    * Touch event listeners are only registered if the detector returns truthy for the corresponding element when the zoom behavior is applied.
    * The default detector works well for most browsers that are capable of touch input, but not all; Chrome’s mobile device emulator, for example,
    * fails detection.
    *
    * @param touchable A touch support detector function, which returns true when touch event listeners should be applied to the corresponding element.
    * The function is evaluated for each selected element to which the zoom behavior was applied, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element. The function returns a boolean value.
    */
  def touchable(touchable: ValueFn[ZoomRefElement, Datum, Boolean]): this.type = js.native
  
  def transform(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    transform: js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* d */ Datum, ZoomTransform_]
  ): Unit = js.native
  def transform(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    transform: js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* d */ Datum, ZoomTransform_],
    point: js.ThisFunction2[
      /* this */ ZoomRefElement, 
      /* event */ js.Any, 
      /* d */ Datum, 
      js.Tuple2[Double, Double]
    ]
  ): Unit = js.native
  def transform(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    transform: js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* d */ Datum, ZoomTransform_],
    point: js.Tuple2[Double, Double]
  ): Unit = js.native
  /**
    * If selection is a selection, sets the current zoom transform of the selected elements to the specified transform, instantaneously emitting start, zoom and end events.
    * If selection is a transition, defines a “zoom” tween to the specified transform using d3.interpolateZoom, emitting a start event when the transition starts,
    * zoom events for each tick of the transition, and then an end event when the transition ends (or is interrupted).
    * The transition will attempt to minimize the visual movement around the specified point; if the point is not specified, it defaults to the center of the viewport extent.
    *
    * This function is typically not invoked directly, and is instead invoked via selection.call or transition.call.
    *
    * @param selection A selection or a transition.
    * @param transform A zoom transform or a function that returns a zoom transform.
    * If a function, it is invoked for each selected element, being passed the current event (event) and datum d, with the this context as the current DOM element.
    * @param point A two-element array [x, y] or a function that returns such an array.
    * If a function, it is invoked for each selected element, being passed the current event (event) and datum d, with the this context as the current DOM element.
    */
  def transform(selection: Selection_[ZoomRefElement, Datum, _, _], transform: ZoomTransform_): Unit = js.native
  def transform(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    transform: ZoomTransform_,
    point: js.ThisFunction2[
      /* this */ ZoomRefElement, 
      /* event */ js.Any, 
      /* d */ Datum, 
      js.Tuple2[Double, Double]
    ]
  ): Unit = js.native
  def transform(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    transform: ZoomTransform_,
    point: js.Tuple2[Double, Double]
  ): Unit = js.native
  def transform(
    selection: TransitionLike[ZoomRefElement, Datum],
    transform: js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* d */ Datum, ZoomTransform_]
  ): Unit = js.native
  def transform(
    selection: TransitionLike[ZoomRefElement, Datum],
    transform: js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* d */ Datum, ZoomTransform_],
    point: js.ThisFunction2[
      /* this */ ZoomRefElement, 
      /* event */ js.Any, 
      /* d */ Datum, 
      js.Tuple2[Double, Double]
    ]
  ): Unit = js.native
  def transform(
    selection: TransitionLike[ZoomRefElement, Datum],
    transform: js.ThisFunction2[/* this */ ZoomRefElement, /* event */ js.Any, /* d */ Datum, ZoomTransform_],
    point: js.Tuple2[Double, Double]
  ): Unit = js.native
  def transform(selection: TransitionLike[ZoomRefElement, Datum], transform: ZoomTransform_): Unit = js.native
  def transform(
    selection: TransitionLike[ZoomRefElement, Datum],
    transform: ZoomTransform_,
    point: js.ThisFunction2[
      /* this */ ZoomRefElement, 
      /* event */ js.Any, 
      /* d */ Datum, 
      js.Tuple2[Double, Double]
    ]
  ): Unit = js.native
  def transform(
    selection: TransitionLike[ZoomRefElement, Datum],
    transform: ZoomTransform_,
    point: js.Tuple2[Double, Double]
  ): Unit = js.native
  
  /**
    * If selection is a selection, translates the current zoom transform of the selected elements by x and y, such that the new tx1 = tx0 + kx and ty1 = ty0 + ky.
    * If selection is a transition, defines a “zoom” tween translating the current transform.
    * This method is a convenience method for zoom.transform.
    *
    * @param selection A selection or a transition.
    * @param x A number or a function that returns a number.
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    * @param y A number or a function that returns a number.
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    */
  def translateBy(selection: Selection_[ZoomRefElement, Datum, _, _], x: Double, y: Double): Unit = js.native
  def translateBy(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  def translateBy(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double
  ): Unit = js.native
  def translateBy(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  def translateBy(selection: TransitionLike[ZoomRefElement, Datum], x: Double, y: Double): Unit = js.native
  def translateBy(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  def translateBy(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double
  ): Unit = js.native
  def translateBy(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  
  /**
    * Return the current translate extent.
    */
  def translateExtent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  /**
    * Set the translate extent to the specified array of points [[x0, y0], [x1, y1]], where [x0, y0] is the top-left corner of the world and [x1, y1]
    * is the bottom-right corner of the world, and return this zoom behavior.
    *
    * The translate extent restricts panning, and may cause translation on zoom out. It is enforced on interaction and when using zoom.scaleBy, zoom.scaleTo and zoom.translateBy;
    * however, it is not enforced when using zoom.transform to set the transform explicitly.
    *
    * The default scale extent is [[-infinity, infinity], [-infinity, infinity]].
    *
    * @param extent A translate extent array, i.e. an array of two arrays, each representing a point.
    */
  def translateExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
  
  /**
    * If selection is a selection, translates the current zoom transform of the selected elements such that the given position ⟨x,y⟩ appears at given point p.
    * The new tx = px - kx and ty = py - ky. If p is not specified, it defaults to the center of the viewport extent.
    * If selection is a transition, defines a “zoom” tween translating the current transform. This method is a convenience method for zoom.transform.
    *
    * Translates the current zoom transform of the selected elements such that the specified position ⟨x,y⟩ appears at the center of the viewport extent.
    * The new tx = cx - kx and ty = cy - ky, where ⟨cx,cy⟩ is the center.
    *
    * x is provided as a constant for all elements.
    * y is provided as a constant for all elements.
    *
    * @param selection A selection or a transition.
    * @param x A number or a function that returns a number.
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    * @param y A number or a function that returns a number.
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    * @param p A two-element array [px,py] or a function
    * If a function, it is invoked for each selected element, being passed the current datum d and index i, with the this context as the current DOM element.
    */
  def translateTo(selection: Selection_[ZoomRefElement, Datum, _, _], x: Double, y: Double): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: Double,
    y: Double,
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: Double,
    y: Double,
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double],
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double],
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double,
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double,
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double],
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def translateTo(
    selection: Selection_[ZoomRefElement, Datum, _, _],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double],
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def translateTo(selection: TransitionLike[ZoomRefElement, Datum], x: Double, y: Double): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: Double,
    y: Double,
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: Double,
    y: Double,
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double],
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: Double,
    y: ValueFn[ZoomRefElement, Datum, Double],
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double,
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: Double,
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double],
    p: js.Tuple2[Double, Double]
  ): Unit = js.native
  def translateTo(
    selection: TransitionLike[ZoomRefElement, Datum],
    x: ValueFn[ZoomRefElement, Datum, Double],
    y: ValueFn[ZoomRefElement, Datum, Double],
    p: ValueFn[ZoomRefElement, Datum, js.Tuple2[Double, Double]]
  ): Unit = js.native
  
  /**
    * Returns the current wheelDelta function.
    */
  def wheelDelta(): ValueFn[ZoomRefElement, Datum, Double] = js.native
  /**
    * Sets the wheel delta function to the specified function and returns the zoom behavior. The wheel delta function which is invoked in the wheel event handler
    * of each element to which the zoom behavior was applied.
    * The value Δ returned by the wheel delta function determines the amount of scaling applied in response to a WheelEvent.
    * The scale factor transform.k is multiplied by 2Δ; for example, a Δ of +1 doubles the scale factor, Δ of -1 halves the scale factor.
    *
    * @param delta Wheel delta function which is invoked in the wheel event handler of each element to which the zoom behavior was applied,
    * in order, being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element. The function returns a numeric value.
    */
  def wheelDelta(delta: ValueFn[ZoomRefElement, Datum, Double]): this.type = js.native
}
