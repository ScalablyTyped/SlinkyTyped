package typingsSlinky.httpProxyMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-proxy-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(config: Config): Proxy = js.native
  def apply(contextOrUri: String): Proxy = js.native
  def apply(contextOrUri: String, config: Config): Proxy = js.native
  def apply(contextOrUri: js.Array[String]): Proxy = js.native
  def apply(contextOrUri: js.Array[String], config: Config): Proxy = js.native
  def apply(contextOrUri: Filter): Proxy = js.native
  def apply(contextOrUri: Filter, config: Config): Proxy = js.native
}
