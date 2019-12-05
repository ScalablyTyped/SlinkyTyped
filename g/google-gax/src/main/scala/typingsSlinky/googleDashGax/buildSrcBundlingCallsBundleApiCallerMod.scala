package typingsSlinky.googleDashGax

import typingsSlinky.googleDashGax.buildSrcApiCallerMod.APICaller
import typingsSlinky.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import typingsSlinky.googleDashGax.buildSrcBundlingCallsBundleExecutorMod.BundleExecutor
import typingsSlinky.googleDashGax.buildSrcCallMod.OngoingCallPromise
import typingsSlinky.googleDashGax.buildSrcGaxMod.CallSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/bundlingCalls/bundleApiCaller", JSImport.Namespace)
@js.native
object buildSrcBundlingCallsBundleApiCallerMod extends js.Object {
  @js.native
  class BundleApiCaller protected () extends APICaller {
    def this(bundler: BundleExecutor) = this()
    var bundler: BundleExecutor = js.native
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: CallSettings,
      status: OngoingCallPromise
    ): Unit = js.native
  }
  
}

