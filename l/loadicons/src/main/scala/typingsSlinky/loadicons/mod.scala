package typingsSlinky.loadicons

import org.scalajs.dom.raw.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Load SVG icon sprites safely and asynchronously
    */
  @JSImport("loadicons", JSImport.Namespace)
  @js.native
  def apply(svgURL: String, callback: Callback): Unit = js.native
  
  type Callback = js.Function2[/* error */ js.Error | Null, /* svg */ SVGElement, Unit]
}
