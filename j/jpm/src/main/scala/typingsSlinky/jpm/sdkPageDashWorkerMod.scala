package typingsSlinky.jpm

import typingsSlinky.jpm.FFAddonSDK.Port
import typingsSlinky.jpm.jpmStrings.error
import typingsSlinky.jpm.jpmStrings.message
import typingsSlinky.jpm.sdkPageDashWorkerMod.PageWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a permanent, invisible page and access its DOM
  */
@JSImport("sdk/page-worker", JSImport.Namespace)
@js.native
object sdkPageDashWorkerMod extends js.Object {
  @js.native
  trait PageWorker extends js.Object {
    var allow: js.UndefOr[Anon_Script] = js.native
    var contentScript: js.UndefOr[String | js.Array[String]] = js.native
    var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
    var contentURL: js.UndefOr[String] = js.native
    var include: js.UndefOr[String | (js.Array[js.RegExp | String]) | js.RegExp] = js.native
    var port: Port = js.native
    def destroy(): Unit = js.native
    def on(event: error, handler: js.Function1[/* arg */ js.UndefOr[message | js.Error], _]): Unit = js.native
    @JSName("on")
    def on_message(event: message, handler: js.Function1[/* arg */ js.UndefOr[message | js.Error], _]): Unit = js.native
    def postMessage(message: String): Unit = js.native
    def removeListener(event: String, listener: js.Function): Unit = js.native
  }
  
  def Page(options: Anon_Allow): PageWorker = js.native
}

