package typingsSlinky.googleGax

import typingsSlinky.googleGax.apiCallerMod.APICaller
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import typingsSlinky.googleGax.bundleExecutorMod.BundleExecutor
import typingsSlinky.googleGax.callMod.OngoingCallPromise
import typingsSlinky.googleGax.gaxMod.CallSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundleApiCallerMod {
  
  @JSImport("google-gax/build/src/bundlingCalls/bundleApiCaller", "BundleApiCaller")
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
