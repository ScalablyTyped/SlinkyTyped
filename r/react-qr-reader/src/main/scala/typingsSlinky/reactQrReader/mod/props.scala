package typingsSlinky.reactQrReader.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.SyntheticEvent
import typingsSlinky.reactQrReader.reactQrReaderBooleans.`false`
import typingsSlinky.reactQrReader.reactQrReaderStrings.environment
import typingsSlinky.reactQrReader.reactQrReaderStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait props extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double | `false`] = js.native
  
  var facingMode: js.UndefOr[user | environment] = js.native
  
  var legacyMode: js.UndefOr[Boolean] = js.native
  
  def onError(err: js.Any): Unit = js.native
  
  var onImageLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLImageElement], Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  def onScan(): Unit = js.native
  def onScan(data: String): Unit = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var showViewFinder: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
}
