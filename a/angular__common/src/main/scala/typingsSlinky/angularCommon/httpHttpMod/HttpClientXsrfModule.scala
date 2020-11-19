package typingsSlinky.angularCommon.httpHttpMod

import typingsSlinky.angularCommon.anon.CookieName
import typingsSlinky.angularCore.mod.ModuleWithProviders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpClientXsrfModule")
@js.native
class HttpClientXsrfModule () extends js.Object
/* static members */
@JSImport("@angular/common/http/http", "HttpClientXsrfModule")
@js.native
object HttpClientXsrfModule extends js.Object {
  
  /**
    * Disable the default XSRF protection.
    */
  def disable(): ModuleWithProviders[HttpClientXsrfModule] = js.native
  
  /**
    * Configure XSRF protection.
    * @param options An object that can specify either or both
    * cookie name or header name.
    * - Cookie name default is `XSRF-TOKEN`.
    * - Header name default is `X-XSRF-TOKEN`.
    *
    */
  def withOptions(): ModuleWithProviders[HttpClientXsrfModule] = js.native
  def withOptions(options: CookieName): ModuleWithProviders[HttpClientXsrfModule] = js.native
}
