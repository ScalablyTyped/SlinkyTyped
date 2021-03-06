package typingsSlinky.ngmap

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PositionOptions
import typingsSlinky.angular.mod.IPromise
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.Map
import typingsSlinky.ngmap.anon.AnchorPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object map {
    
    @js.native
    trait IGetMapOptions extends StObject {
      
      var id: js.UndefOr[String] = js.native
      
      var timeout: js.UndefOr[Double] = js.native
    }
    object IGetMapOptions {
      
      @scala.inline
      def apply(): IGetMapOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGetMapOptions]
      }
      
      @scala.inline
      implicit class IGetMapOptionsMutableBuilder[Self <: IGetMapOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    @js.native
    trait INgMap extends StObject {
      
      def addMap(mapCtrl: js.Array[_]): Unit = js.native
      /**
        * Add map to pool
        * @param {Function | any[]} mapCtrl Map controller
        */
      def addMap(mapCtrl: js.Function): Unit = js.native
      
      /**
        * Delete map from pool
        * @param {Function | any[]} mapCtrl Map controller optional. Defaults to last
        * controller in pool
        */
      def deleteMap(): Unit = js.native
      def deleteMap(mapCtrl: js.Array[_]): Unit = js.native
      def deleteMap(mapCtrl: js.Function): Unit = js.native
      
      /**
        * Get map coordinates from address.
        * @param  {string}                               address Use 'current' to get users location
        * @param  {PositionOptions}                      options optional
        * @return {angular.IPromise<google.maps.LatLng>}         Latitude ang longitude of the address
        */
      def getGeoLocation(address: String): IPromise[LatLng] = js.native
      def getGeoLocation(address: String, options: PositionOptions): IPromise[LatLng] = js.native
      
      /**
        * Get map from the pool of all shown maps.
        * @param  {IGetMapOptions}                    options optional
        * @return {angular.IPromise<google.maps.Map>}         promise
        */
      def getMap(): IPromise[Map[Element]] = js.native
      def getMap(options: IGetMapOptions): IPromise[Map[Element]] = js.native
      
      /**
        * Initialize map from mapId or the current first shown map
        * @param  {string}          mapId id of the map. default 0
        * @return {google.maps.Map}       map
        */
      def initMap(): Map[Element] = js.native
      def initMap(mapId: String): Map[Element] = js.native
      
      /**
        * Observe attribute
        * @param  {string}             attrName attribute name
        * @param  {Object}             object   a Google maps object to be changed
        * @return {IObserveAndSetFunc}          attribute obvserve function
        */
      def observeAndSet(attrName: String, `object`: js.Object): IObserveAndSetFunc = js.native
      
      /**
        * Set display, width, height of map container element
        * @param {HTMLElement} el map container element
        */
      def setStyle(el: HTMLElement): Unit = js.native
    }
    
    @js.native
    trait INgMapOptions extends StObject {
      
      var marker: AnchorPoint = js.native
    }
    object INgMapOptions {
      
      @scala.inline
      def apply(marker: AnchorPoint): INgMapOptions = {
        val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
        __obj.asInstanceOf[INgMapOptions]
      }
      
      @scala.inline
      implicit class INgMapOptionsMutableBuilder[Self <: INgMapOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMarker(value: AnchorPoint): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait INgMapProvider extends StObject {
      
      /**
        * @param {Hash} options
        * @example
        *  app.config(function(NgMapProvider) {
        *    NgMapProvider.setDefaultOptions({
        *      marker: {
        *        optimized: false
        *      }
        *    });
        *  });
        */
      def setDefaultOptions(options: INgMapOptions): Unit = js.native
    }
    object INgMapProvider {
      
      @scala.inline
      def apply(setDefaultOptions: INgMapOptions => Unit): INgMapProvider = {
        val __obj = js.Dynamic.literal(setDefaultOptions = js.Any.fromFunction1(setDefaultOptions))
        __obj.asInstanceOf[INgMapProvider]
      }
      
      @scala.inline
      implicit class INgMapProviderMutableBuilder[Self <: INgMapProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetDefaultOptions(value: INgMapOptions => Unit): Self = StObject.set(x, "setDefaultOptions", js.Any.fromFunction1(value))
      }
    }
    
    type IObserveAndSetFunc = js.Function1[/* val */ js.Any, Unit]
  }
}
