package typingsSlinky.googleDashMapsDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleDashMapsDashReactMod {
  import org.scalajs.dom.raw.Element
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type GoogleApiOptionsFunc = js.Function1[/* props */ js.Any, GoogleApiOptions]
  type Omit[T1, T2] = Pick[T1, Exclude[String, String]]
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[MapProps], 
    /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[MarkerProps], 
    /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
}
