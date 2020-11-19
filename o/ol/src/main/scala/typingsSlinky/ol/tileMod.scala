package typingsSlinky.ol

import typingsSlinky.ol.baseTileMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/layer/Tile", JSImport.Namespace)
@js.native
object tileMod extends js.Object {
  
  @js.native
  trait TileLayer
    extends typingsSlinky.ol.baseTileMod.default
  
  @js.native
  class default () extends TileLayer {
    def this(opt_options: Options) = this()
  }
}
