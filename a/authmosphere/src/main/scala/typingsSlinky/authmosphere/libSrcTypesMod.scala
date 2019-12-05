package typingsSlinky.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types", JSImport.Namespace)
@js.native
object libSrcTypesMod extends js.Object {
  @js.native
  object LogLevel extends js.Object {
    /* "debug" */ val debug: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.debug with String = js.native
    /* "error" */ val error: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.error with String = js.native
    /* "fatal" */ val fatal: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.fatal with String = js.native
    /* "info" */ val info: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.info with String = js.native
    /* "trace" */ val trace: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.trace with String = js.native
    /* "warn" */ val warn: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.warn with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel with String] = js.native
  }
  
  @js.native
  object OAuthGrantType extends js.Object {
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typingsSlinky.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typingsSlinky.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typingsSlinky.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typingsSlinky.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType with String
      ] = js.native
  }
  
}

