package typingsSlinky.googlemaps.global.google.maps

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.MapTypeStyle
import typingsSlinky.googlemaps.google.maps.StyledMapTypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.StyledMapType")
@js.native
class StyledMapType protected ()
  extends typingsSlinky.googlemaps.google.maps.StyledMapType {
  def this(styles: js.Array[MapTypeStyle]) = this()
  def this(styles: js.Array[MapTypeStyle], options: StyledMapTypeOptions) = this()
  /* CompleteClass */
  override def getTile(tileCoord: typingsSlinky.googlemaps.google.maps.Point, zoom: Double, ownerDocument: Document): Element = js.native
  /* CompleteClass */
  override def releaseTile(tile: Element): Unit = js.native
}

