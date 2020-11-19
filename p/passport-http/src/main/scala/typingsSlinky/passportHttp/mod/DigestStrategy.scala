package typingsSlinky.passportHttp.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-http", "DigestStrategy")
@js.native
class DigestStrategy protected () extends Strategy {
  def this(secret: DigestSecretFunction) = this()
  def this(options: DigestStrategyOptions, secret: DigestSecretFunction) = this()
  def this(secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
  def this(options: DigestStrategyOptions, secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  
  @JSName("name")
  var name_DigestStrategy: String = js.native
}
