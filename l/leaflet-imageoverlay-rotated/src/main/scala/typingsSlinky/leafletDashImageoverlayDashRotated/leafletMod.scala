package typingsSlinky.leafletDashImageoverlayDashRotated

import typingsSlinky.leaflet.leafletMod.ImageOverlayOptions
import typingsSlinky.leaflet.leafletMod.LatLngExpression
import typingsSlinky.leafletDashImageoverlayDashRotated.leafletMod.ImageOverlay.Rotated
import typingsSlinky.std.HTMLCanvasElement
import typingsSlinky.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object leafletMod extends js.Object {
  @js.native
  object ImageOverlay extends js.Object {
    @js.native
    trait Rotated
      extends typingsSlinky.leaflet.leafletMod.ImageOverlay {
      def reposition(topleft: LatLngExpression, topright: LatLngExpression, bottomleft: LatLngExpression): Unit = js.native
    }
    
  }
  
  @js.native
  object imageOverlay extends js.Object {
    def rotated(
      imgSrc: String,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    def rotated(
      imgSrc: String,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
    def rotated(
      imgSrc: HTMLCanvasElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    def rotated(
      imgSrc: HTMLCanvasElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
    def rotated(
      imgSrc: HTMLImageElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    def rotated(
      imgSrc: HTMLImageElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
  }
  
}

