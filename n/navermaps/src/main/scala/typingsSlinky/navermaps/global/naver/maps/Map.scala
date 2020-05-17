package typingsSlinky.navermaps.global.naver.maps

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.navermaps.naver.maps.MapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map
@JSGlobal("naver.maps.Map")
@js.native
class Map protected ()
  extends typingsSlinky.navermaps.naver.maps.Map {
  def this(mapDiv: String) = this()
  def this(mapDiv: HTMLElement) = this()
  def this(mapDiv: String, mapOptions: MapOptions) = this()
  def this(mapDiv: HTMLElement, mapOptions: MapOptions) = this()
}

