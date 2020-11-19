package typingsSlinky.authmosphere.scopeMiddlewareOptionsMod

import typingsSlinky.authmosphere.loggerMod.Logger
import typingsSlinky.authmosphere.precedenceMod.PrecedenceOptions
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeMiddlewareOptions extends js.Object {
  
  var logger: js.UndefOr[Logger] = js.native
  
  var onAuthorizationFailedHandler: js.UndefOr[
    typingsSlinky.authmosphere.scopeMiddlewareOptionsMod.onAuthorizationFailedHandler
  ] = js.native
  
  var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.native
}
object ScopeMiddlewareOptions {
  
  @scala.inline
  def apply(): ScopeMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeMiddlewareOptions]
  }
  
  @scala.inline
  implicit class ScopeMiddlewareOptionsOps[Self <: ScopeMiddlewareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setOnAuthorizationFailedHandler(
      value: (/* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* resonse */ Response_[js.Any], /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Unit
    ): Self = this.set("onAuthorizationFailedHandler", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnAuthorizationFailedHandler: Self = this.set("onAuthorizationFailedHandler", js.undefined)
    
    @scala.inline
    def setPrecedenceOptions(value: PrecedenceOptions): Self = this.set("precedenceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecedenceOptions: Self = this.set("precedenceOptions", js.undefined)
  }
}
