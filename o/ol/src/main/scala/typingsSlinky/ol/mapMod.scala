package typingsSlinky.ol

import typingsSlinky.ol.mapMod.Map
import typingsSlinky.ol.pluggableMapMod.MapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  @js.native
  trait Map
    extends typingsSlinky.ol.pluggableMapMod.default
  
  @js.native
  class default protected () extends Map {
    def this(options: MapOptions) = this()
  }
  
}

