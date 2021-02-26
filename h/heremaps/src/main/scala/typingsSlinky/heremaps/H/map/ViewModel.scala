package typingsSlinky.heremaps.H.map

import typingsSlinky.heremaps.H.geo.AbstractGeometry
import typingsSlinky.heremaps.H.geo.IPoint
import typingsSlinky.heremaps.H.map.ViewModel.ILookAtData
import typingsSlinky.heremaps.H.util.Event
import typingsSlinky.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a view of the map. It consists of a virtual camera and a look-at point both of which have a position in geo-space and orientation angles. The view model allows to
  * change the values of these objects in order to move or rotate the map or zoom in and out.
  */
@js.native
trait ViewModel
  extends EventTarget
     with IControl {
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * A method to set the values for a continuously modification of the ViewModel on different axes. If the current render engine doesn't support certain modifications then they are ignored.
    * @param moveX {number} - The movement on x-axis as levels per millisecond where a level correlates to the distance between camera and look-at point.
    * @param moveY {number} - The movement on y-axis as levels per millisecond where a level correlates to the distance between camera and look-at point
    * @param moveZ {number} - The movement on z-axis as levels per millisecond.
    * @param angleX {number} - The rotation of on screen's x axis as degrees per millisecond.
    * @param angleY {number} - The rotation of on screen's y axis as degrees per millisecond.
    * @param angleZ {number} - The rotation of on screen's z axis as degrees per millisecond.
    * @param opt_zoom {number=} - The modification of the zoom level as levels per millisecond
    */
  def control(moveX: Double, moveY: Double, moveZ: Double, angleX: Double, angleY: Double, angleZ: Double): Unit = js.native
  
  /**
    * {@link https://developer.here.com/documentation/maps/api_reference/H.map.ViewModel.html#getLookAtData}
    */
  def getLookAtData(): ILookAtData = js.native
  
  /**
    * This method returns the zoom level that is currently rendered.
    * @returns {number} - current zoom level (scale)
    */
  def getZoom(): Double = js.native
  
  /**
    * {@link https://developer.here.com/documentation/maps/api_reference/H.map.ViewModel.html#setLookAtData}
    * @param data - The values to be modified. Here are some of the main possibilities to reposition the camera at give look-at point
    * @param opt_animate - A value indicating if an animated transition should be applied, default is false.
    */
  def setLookAtData(data: ILookAtData): ViewModel = js.native
  def setLookAtData(data: ILookAtData, opt_animate: Boolean): ViewModel = js.native
  
  /**
    * This method sets a new zoom level to be processed by the renderer
    * @param zoom {number} - the new zoom level
    * @param animate {boolean}
    */
  def setZoom(zoom: Double, animate: Boolean): Unit = js.native
}
object ViewModel {
  
  /**
    * {@link https://developer.here.com/documentation/maps/api_reference/H.map.ViewModel.html#.ILookAtData}
    */
  @js.native
  trait ILookAtData extends StObject {
    
    var bounds: js.UndefOr[AbstractGeometry] = js.native
    
    var heading: js.UndefOr[Double] = js.native
    
    var incline: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[IPoint] = js.native
    
    var tilt: js.UndefOr[Double] = js.native
    
    var zoom: js.UndefOr[Double] = js.native
  }
  object ILookAtData {
    
    @scala.inline
    def apply(): ILookAtData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILookAtData]
    }
    
    @scala.inline
    implicit class ILookAtDataMutableBuilder[Self <: ILookAtData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: AbstractGeometry): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      @scala.inline
      def setIncline(value: Double): Self = StObject.set(x, "incline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclineUndefined: Self = StObject.set(x, "incline", js.undefined)
      
      @scala.inline
      def setPosition(value: IPoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /**
    * Update event is fired whenever view model data is changed. It contains property which hold currently requested data
    * @fixme find documentation and update constructor typings
    * @property target {*} - Object which triggered the event
    * @property currentTarget {*} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @js.native
  trait UpdateEvent extends Event
  object UpdateEvent {
    
    @scala.inline
    def apply(
      currentTarget: js.Any,
      defaultPrevented: Boolean,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: js.Any,
      `type`: String
    ): UpdateEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateEvent]
    }
  }
}
