package typingsSlinky.leafletImageoverlayRotated

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.leaflet.mod.ImageOverlayOptions
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leafletImageoverlayRotated.mod.ImageOverlay_.Rotated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object imageOverlay {
    
    @JSImport("leaflet", "imageOverlay.rotated")
    @js.native
    def rotated(
      imgSrc: String,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    @JSImport("leaflet", "imageOverlay.rotated")
    @js.native
    def rotated(
      imgSrc: String,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
    @JSImport("leaflet", "imageOverlay.rotated")
    @js.native
    def rotated(
      imgSrc: HTMLCanvasElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    @JSImport("leaflet", "imageOverlay.rotated")
    @js.native
    def rotated(
      imgSrc: HTMLCanvasElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
    @JSImport("leaflet", "imageOverlay.rotated")
    @js.native
    def rotated(
      imgSrc: HTMLImageElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression
    ): Rotated = js.native
    @JSImport("leaflet", "imageOverlay.rotated")
    @js.native
    def rotated(
      imgSrc: HTMLImageElement,
      topleft: LatLngExpression,
      topright: LatLngExpression,
      bottomleft: LatLngExpression,
      options: ImageOverlayOptions
    ): Rotated = js.native
  }
  
  object ImageOverlay_ {
    
    @js.native
    trait Rotated
      extends typingsSlinky.leaflet.mod.ImageOverlay_ {
      
      def reposition(topleft: LatLngExpression, topright: LatLngExpression, bottomleft: LatLngExpression): Unit = js.native
    }
  }
}
