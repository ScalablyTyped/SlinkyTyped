package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.AMap.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.Rectangle<any>, keyof amap-js-api.AMap.Polygon<any>> */
@js.native
trait OmitRectangleanykeyofPoly extends js.Object {
  
  def setBounds(bounds: Bounds): Unit = js.native
  def setBounds(bounds: Bounds, preventEvent: Boolean): Unit = js.native
  @JSName("setBounds")
  var setBounds_Original: js.Function2[/* bounds */ Bounds, /* preventEvent */ js.UndefOr[Boolean], Unit] = js.native
}
