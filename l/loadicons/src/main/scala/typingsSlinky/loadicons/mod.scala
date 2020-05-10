package typingsSlinky.loadicons

import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadicons", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Load SVG icon sprites safely and asynchronously
    */
  def apply(svgURL: String, callback: Callback): Unit = js.native
  type Callback = js.Function2[/* error */ js.Error | Null, /* svg */ SVGElement, Unit]
}

