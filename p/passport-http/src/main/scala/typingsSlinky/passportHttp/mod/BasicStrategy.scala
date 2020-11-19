package typingsSlinky.passportHttp.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.Strategy
import typingsSlinky.passportHttp.passportHttpBooleans.`false`
import typingsSlinky.passportHttp.passportHttpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-http", "BasicStrategy")
@js.native
class BasicStrategy protected () extends Strategy {
  def this(verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[`false`], verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[`true`], verify: BasicVerifyFunctionWithRequest) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  
  @JSName("name")
  var name_BasicStrategy: String = js.native
}
