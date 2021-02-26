package typingsSlinky.postmark.mod.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClientOptions {
  
  @JSImport("postmark", "Models.ClientOptions.Configuration")
  @js.native
  class Configuration protected ()
    extends typingsSlinky.postmark.modelsMod.ClientOptions.Configuration {
    def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
  }
  
  @JSImport("postmark", "Models.ClientOptions.DefaultHeaderNames")
  @js.native
  object DefaultHeaderNames extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames with String
      ] = js.native
    
    /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typingsSlinky.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.ACCOUNT_TOKEN with String = js.native
    
    /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typingsSlinky.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.SERVER_TOKEN with String = js.native
  }
  
  @JSImport("postmark", "Models.ClientOptions.HttpMethod")
  @js.native
  object HttpMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.postmark.clientOptionsMod.ClientOptions.HttpMethod with String] = js.native
    
    /* "DELETE" */ val DELETE: typingsSlinky.postmark.clientOptionsMod.ClientOptions.HttpMethod.DELETE with String = js.native
    
    /* "GET" */ val GET: typingsSlinky.postmark.clientOptionsMod.ClientOptions.HttpMethod.GET with String = js.native
    
    /* "HEAD" */ val HEAD: typingsSlinky.postmark.clientOptionsMod.ClientOptions.HttpMethod.HEAD with String = js.native
    
    /* "OPTIONS" */ val OPTIONS: typingsSlinky.postmark.clientOptionsMod.ClientOptions.HttpMethod.OPTIONS with String = js.native
    
    /* "PATCH" */ val PATCH: typingsSlinky.postmark.clientOptionsMod.ClientOptions.HttpMethod.PATCH with String = js.native
    
    /* "POST" */ val POST: typingsSlinky.postmark.clientOptionsMod.ClientOptions.HttpMethod.POST with String = js.native
    
    /* "PUT" */ val PUT: typingsSlinky.postmark.clientOptionsMod.ClientOptions.HttpMethod.PUT with String = js.native
  }
}
