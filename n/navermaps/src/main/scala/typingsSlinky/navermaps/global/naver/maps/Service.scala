package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Service.GeocodeResponse
import typingsSlinky.navermaps.naver.maps.Service.GeocodeServiceOptions
import typingsSlinky.navermaps.naver.maps.Service.ReverseGeocodeResponse
import typingsSlinky.navermaps.naver.maps.Service.ReverseServiceOptions
import typingsSlinky.navermaps.naver.maps.Service.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Service {
  
  // Sub module: geocoder
  @JSGlobal("naver.maps.Service")
  @js.native
  def apply(): Unit = js.native
  
  @JSGlobal("naver.maps.Service.CoordType")
  @js.native
  object CoordType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.navermaps.naver.maps.Service.CoordType with Double] = js.native
    
    /* 0 */ val LATLNG: typingsSlinky.navermaps.naver.maps.Service.CoordType.LATLNG with Double = js.native
    
    /* 1 */ val TM128: typingsSlinky.navermaps.naver.maps.Service.CoordType.TM128 with Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.Encoding")
  @js.native
  object Encoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.navermaps.naver.maps.Service.Encoding with Double] = js.native
    
    /* 1 */ val EUC_KR: typingsSlinky.navermaps.naver.maps.Service.Encoding.EUC_KR with Double = js.native
    
    /* 0 */ val UTF_8: typingsSlinky.navermaps.naver.maps.Service.Encoding.UTF_8 with Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.navermaps.naver.maps.Service.Status with Double] = js.native
    
    /* 1 */ val ERROR: typingsSlinky.navermaps.naver.maps.Service.Status.ERROR with Double = js.native
    
    /* 0 */ val OK: typingsSlinky.navermaps.naver.maps.Service.Status.OK with Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.fromAddrToCoord")
  @js.native
  def fromAddrToCoord(): Unit = js.native
  
  @JSGlobal("naver.maps.Service.fromCoordToAddr")
  @js.native
  def fromCoordToAddr(): Unit = js.native
  
  @JSGlobal("naver.maps.Service.geocode")
  @js.native
  def geocode(options: GeocodeServiceOptions): Unit = js.native
  @JSGlobal("naver.maps.Service.geocode")
  @js.native
  def geocode(
    options: GeocodeServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ GeocodeResponse, Unit]
  ): Unit = js.native
  
  @JSGlobal("naver.maps.Service.reverseGeocode")
  @js.native
  def reverseGeocode(options: ReverseServiceOptions): Unit = js.native
  @JSGlobal("naver.maps.Service.reverseGeocode")
  @js.native
  def reverseGeocode(
    options: ReverseServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ ReverseGeocodeResponse, Unit]
  ): Unit = js.native
}
