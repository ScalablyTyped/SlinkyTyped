package typingsSlinky.passportTwitchLatest.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passportOauth2.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-twitch-latest", "Strategy")
@js.native
class Strategy protected () extends ^ {
  // Disabling this tslint rule as unifying the signatures makes the callback function default to inferring the
  // longest callback which breaks the example config. See: https://github.com/Microsoft/TypeScript/issues/16867
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  // tslint:disable-next-line unified-signatures
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequestResults) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  // tslint:disable-next-line unified-signatures
  def this(options: StrategyOptions, verify: VerifyFunctionWithResults) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: AuthenticateOptions): Unit = js.native
  
  def authorize(strategy: String): AuthenticateRet = js.native
  def authorize(strategy: String, callback: js.Function1[/* repeated */ js.Any, _]): AuthenticateRet = js.native
  def authorize(strategy: String, options: AuthenticateOptions): AuthenticateRet = js.native
  def authorize(strategy: String, options: AuthenticateOptions, callback: js.Function1[/* repeated */ js.Any, _]): AuthenticateRet = js.native
  def authorize(strategy: js.Array[String]): AuthenticateRet = js.native
  def authorize(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, _]): AuthenticateRet = js.native
  def authorize(strategy: js.Array[String], options: AuthenticateOptions): AuthenticateRet = js.native
  def authorize(
    strategy: js.Array[String],
    options: AuthenticateOptions,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): AuthenticateRet = js.native
  
  def userProfile(
    accessToken: String,
    done: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* profile */ js.UndefOr[TwitchProfile], Unit]
  ): Unit = js.native
}
