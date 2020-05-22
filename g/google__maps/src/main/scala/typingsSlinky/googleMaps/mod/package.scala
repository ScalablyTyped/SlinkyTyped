package typingsSlinky.googleMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GoogleMapsClientEndpoint[Request, Response] = js.Function2[
    /* query */ Request, 
    /* callback */ js.UndefOr[typingsSlinky.googleMaps.mod.ResponseCallback[Response]], 
    typingsSlinky.googleMaps.mod.RequestHandle[Response]
  ]
  type GoogleMapsClientEndpointWithPromise[Request, Response] = js.Function2[
    /* query */ Request, 
    /* callback */ js.UndefOr[typingsSlinky.googleMaps.mod.ResponseCallback[Response]], 
    typingsSlinky.googleMaps.mod.RequestHandleWithPromise[Response]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.googleMaps.mod.LatLngArray
    - typingsSlinky.googleMaps.mod.LatLngString
    - typingsSlinky.googleMaps.mod.LatLngLiteral
    - typingsSlinky.googleMaps.mod.LatLngLiteralVerbose
  */
  type LatLng = typingsSlinky.googleMaps.mod._LatLng | typingsSlinky.googleMaps.mod.LatLngArray | typingsSlinky.googleMaps.mod.LatLngString
  type LatLngArray = js.Tuple2[scala.Double, scala.Double]
  type LatLngString = java.lang.String
  type PlaceDetailsAddressComponentType = typingsSlinky.googleMaps.googleMapsStrings.street_number
  type PlacePhotoResponse = java.lang.String
  type ResponseCallback[T] = js.Function2[
    /* err */ typingsSlinky.googleMaps.googleMapsStrings.timeout | typingsSlinky.googleMaps.mod.ClientResponse[T], 
    /* response */ typingsSlinky.googleMaps.mod.ClientResponse[T], 
    scala.Unit
  ]
  type ReverseGeocodingResponse = typingsSlinky.googleMaps.mod.GeocodingResponse[typingsSlinky.googleMaps.mod.ReverseGeocodingResponseStatus]
}
