package typingsSlinky.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "Strategy")
@js.native
class Strategy[TUser, TClient /* <: Client */] protected () extends js.Object {
  def this(
    options: StrategyOptions[TClient],
    verify: StrategyVerifyCallbackReq[TUser] | StrategyVerifyCallbackUserInfo[TUser]
  ) = this()
  // tslint:disable-line:no-unnecessary-generics
  def this(options: StrategyOptions[TClient], verify: StrategyVerifyCallback[TUser]) = this()
  def this(options: StrategyOptions[TClient], verify: StrategyVerifyCallbackReqUserInfo[TUser]) = this()
  
  def authenticate(req: js.Any): Unit = js.native
  def authenticate(req: js.Any, options: js.Any): Unit = js.native
  
  def error(err: js.Error): Unit = js.native
  
  def fail(challenge: js.Any, status: Double): Unit = js.native
  def fail(status: Double): Unit = js.native
  
  def pass(): Unit = js.native
  
  def redirect(url: String): Unit = js.native
  def redirect(url: String, status: Double): Unit = js.native
  
  def success(user: js.Any): Unit = js.native
  def success(user: js.Any, info: js.Any): Unit = js.native
}
