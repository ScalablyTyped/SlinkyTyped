package typingsSlinky.proxyVerifier.mod

import typingsSlinky.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proxy-verifier", "testAnonymityLevel")
@js.native
object testAnonymityLevel extends js.Object {
  
  def apply(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ String, Unit]): Unit = js.native
  def apply(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ String, Unit]
  ): Unit = js.native
}
