package typingsSlinky.googlemaps.global.google.maps

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.ImageMapTypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.ImageMapType")
@js.native
class ImageMapType protected ()
  extends typingsSlinky.googlemaps.google.maps.ImageMapType {
  def this(opts: ImageMapTypeOptions) = this()
  /* CompleteClass */
  override def getTile(tileCoord: typingsSlinky.googlemaps.google.maps.Point, zoom: Double, ownerDocument: Document): Element = js.native
  /* CompleteClass */
  override def releaseTile(tile: Element): Unit = js.native
}

