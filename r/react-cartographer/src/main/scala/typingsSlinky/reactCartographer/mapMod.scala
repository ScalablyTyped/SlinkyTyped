package typingsSlinky.reactCartographer

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactCartographer.reactCartographerStrings.bing
import typingsSlinky.reactCartographer.reactCartographerStrings.google
import typingsSlinky.reactCartographer.reactCartographerStrings.yahoo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("react-cartographer/lib/components/Map", JSImport.Default)
  @js.native
  class default ()
    extends Component[MapProps, js.Object, js.Any]
  
  @JSImport("react-cartographer/lib/components/Map", "BingMapService")
  @js.native
  class BingMapService () extends StObject {
    
    def getMap(params: MapProps): MapObject = js.native
    
    def name(): String = js.native
  }
  
  @JSImport("react-cartographer/lib/components/Map", "GoogleMapService")
  @js.native
  class GoogleMapService () extends StObject {
    
    def getMap(params: MapProps): MapObject = js.native
    
    def name(): String = js.native
  }
  
  @JSImport("react-cartographer/lib/components/Map", "MapLocationFactory")
  @js.native
  class MapLocationFactory () extends StObject {
    
    def getMap(params: MapProps): MapObject = js.native
  }
  
  @JSImport("react-cartographer/lib/components/Map", "YahooMapService")
  @js.native
  class YahooMapService () extends StObject {
    
    def getMap(params: MapProps): MapObject = js.native
    
    def name(): String = js.native
  }
  
  type Map = ReactComponentClass[MapProps]
  
  @js.native
  trait MapData extends StObject {
    
    var locationLink: js.Any = js.native
    
    var locationText: String = js.native
  }
  object MapData {
    
    @scala.inline
    def apply(locationLink: js.Any, locationText: String): MapData = {
      val __obj = js.Dynamic.literal(locationLink = locationLink.asInstanceOf[js.Any], locationText = locationText.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapData]
    }
    
    @scala.inline
    implicit class MapDataMutableBuilder[Self <: MapData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationLink(value: js.Any): Self = StObject.set(x, "locationLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationText(value: String): Self = StObject.set(x, "locationText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapObject extends StObject {
    
    var data: MapData = js.native
    
    var mapId: String = js.native
  }
  object MapObject {
    
    @scala.inline
    def apply(data: MapData, mapId: String): MapObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapObject]
    }
    
    @scala.inline
    implicit class MapObjectMutableBuilder[Self <: MapObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: MapData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapProps extends StObject {
    
    var addressLine1: js.UndefOr[String] = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    /** Default: 270 */
    var height: Double = js.native
    
    var latitude: js.UndefOr[Double] = js.native
    
    var longitude: js.UndefOr[Double] = js.native
    
    /** Default: map */
    var mapId: String = js.native
    
    /** Default: yahoo */
    var provider: yahoo | google | bing = js.native
    
    var providerKey: String = js.native
    
    var state: js.UndefOr[String] = js.native
    
    /** Default: false */
    var useBackgroundImageStyle: Boolean = js.native
    
    /** Default: 580 */
    var width: Double = js.native
    
    /** Default: 10 */
    var zoom: Double = js.native
  }
  object MapProps {
    
    @scala.inline
    def apply(
      height: Double,
      mapId: String,
      provider: yahoo | google | bing,
      providerKey: String,
      useBackgroundImageStyle: Boolean,
      width: Double,
      zoom: Double
    ): MapProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], providerKey = providerKey.asInstanceOf[js.Any], useBackgroundImageStyle = useBackgroundImageStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapProps]
    }
    
    @scala.inline
    implicit class MapPropsMutableBuilder[Self <: MapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressLine1Undefined: Self = StObject.set(x, "addressLine1", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: yahoo | google | bing): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderKey(value: String): Self = StObject.set(x, "providerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setUseBackgroundImageStyle(value: Boolean): Self = StObject.set(x, "useBackgroundImageStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
}
