package typingsSlinky.passportKakao.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-kakao", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.mod.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  
  def userProfile(accessToken: String, done: js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit]): Unit = js.native
}
