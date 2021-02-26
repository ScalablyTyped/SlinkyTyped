package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _WebResponseHeadersEvent[T /* <: WebResponseHeadersDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filter: js.UndefOr[scala.Nothing],
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(callback: js.Function1[/* details */ T, Unit], filter: RequestFilter): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
