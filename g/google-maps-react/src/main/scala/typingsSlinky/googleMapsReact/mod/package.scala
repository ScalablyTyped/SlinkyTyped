package typingsSlinky.googleMapsReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GoogleApiOptionsFunc = js.Function1[/* props */ js.Any, typingsSlinky.googleMapsReact.mod.GoogleApiOptions]
  type Omit[T1, T2] = typingsSlinky.std.Pick[
    T1, 
    typingsSlinky.std.Exclude[/* keyof T1 */ java.lang.String, /* keyof T2 */ java.lang.String]
  ]
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[typingsSlinky.googleMapsReact.mod.MapProps], 
    /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[typingsSlinky.googleMapsReact.mod.MarkerProps], 
    /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
}
