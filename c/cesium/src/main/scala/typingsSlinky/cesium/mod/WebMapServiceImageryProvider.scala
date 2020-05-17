package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.Crs
import typingsSlinky.cesium.anon.Format
import typingsSlinky.cesium.anon.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
class WebMapServiceImageryProvider protected () extends ImageryProvider {
  def this(options: Crs) = this()
  val url: String = js.native
}

/* static members */
@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
object WebMapServiceImageryProvider extends js.Object {
  var DefaultParameters: Format = js.native
  var GetFeatureInfoDefaultParameters: Request = js.native
}

