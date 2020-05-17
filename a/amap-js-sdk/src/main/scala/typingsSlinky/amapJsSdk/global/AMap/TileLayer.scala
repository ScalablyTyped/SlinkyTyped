package typingsSlinky.amapJsSdk.global.AMap

import typingsSlinky.amapJsSdk.anon.AutoRefresh
import typingsSlinky.amapJsSdk.anon.DetectRetina
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.TileLayer")
@js.native
class TileLayer ()
  extends typingsSlinky.amapJsSdk.AMap.Layer {
  def this(tileOpt: DetectRetina) = this()
}

@JSGlobal("AMap.TileLayer")
@js.native
object TileLayer extends js.Object {
  @js.native
  abstract class MapTypeLayer ()
    extends typingsSlinky.amapJsSdk.AMap.Layer {
    def this(options: typingsSlinky.amapJsSdk.anon.Map) = this()
  }
  
  @js.native
  class RoadNet ()
    extends typingsSlinky.amapJsSdk.AMap.Layer
  
  @js.native
  class Satellite ()
    extends typingsSlinky.amapJsSdk.AMap.Layer
  
  @js.native
  class Traffic ()
    extends typingsSlinky.amapJsSdk.AMap.TileLayer.Traffic {
    def this(options: AutoRefresh) = this()
  }
  
}

