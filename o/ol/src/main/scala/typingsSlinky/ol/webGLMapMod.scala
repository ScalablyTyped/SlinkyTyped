package typingsSlinky.ol

import typingsSlinky.ol.pluggableMapMod.MapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/WebGLMap", JSImport.Namespace)
@js.native
object webGLMapMod extends js.Object {
  @js.native
  trait WebGLMap
    extends typingsSlinky.ol.pluggableMapMod.default
  
  @js.native
  class default protected () extends WebGLMap {
    def this(options: MapOptions) = this()
  }
  
}

