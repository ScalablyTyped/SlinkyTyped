package typingsSlinky.proxyVerifier.mod

import typingsSlinky.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proxy-verifier", "testProtocol")
@js.native
object testProtocol extends js.Object {
  
  def apply(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]): Unit = js.native
  def apply(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]
  ): Unit = js.native
}
