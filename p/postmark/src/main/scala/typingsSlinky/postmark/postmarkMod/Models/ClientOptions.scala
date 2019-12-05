package typingsSlinky.postmark.postmarkMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.ClientOptions")
@js.native
object ClientOptions extends js.Object {
  @js.native
  class Configuration protected ()
    extends typingsSlinky.postmark.distClientModelsMod.ClientOptions.Configuration {
    def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
  }
  
  @js.native
  object DefaultHeaderNames extends js.Object {
    /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames.ACCOUNT_TOKEN with String = js.native
    /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames.SERVER_TOKEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames with String
      ] = js.native
  }
  
  @js.native
  object HttpMethod extends js.Object {
    /* "DELETE" */ val DELETE: typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.DELETE with String = js.native
    /* "GET" */ val GET: typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.GET with String = js.native
    /* "HEAD" */ val HEAD: typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.HEAD with String = js.native
    /* "OPTIONS" */ val OPTIONS: typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.OPTIONS with String = js.native
    /* "POST" */ val POST: typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.POST with String = js.native
    /* "PUT" */ val PUT: typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.PUT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod with String
      ] = js.native
  }
  
}

