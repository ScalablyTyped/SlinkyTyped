package typingsSlinky.azureMobileServicesClient.Microsoft.WindowsAzure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interface to Platform.async(func) => Platform.Promise based on code MobileServices.Web-1.0.0.js
@js.native
trait asyncPromise extends js.Object {
  
  def done(): Unit = js.native
  def done(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def done(onSuccess: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def done(
    onSuccess: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  def `then`(onSuccess: js.Function1[/* result */ js.Any, _]): asyncPromise = js.native
  def `then`(onSuccess: js.Function1[/* result */ js.Any, _], onError: js.Function1[/* error */ js.Any, _]): asyncPromise = js.native
}
