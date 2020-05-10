package typingsSlinky.passportSaml.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.mod.Strategy {
  def this(config: SamlConfig, verify: VerifyWithRequest) = this()
  def this(config: SamlConfig, verify: VerifyWithoutRequest) = this()
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: AuthenticateOptions): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: AuthorizeOptions): Unit = js.native
  def generateServiceProviderMetadata(): String = js.native
  def generateServiceProviderMetadata(decryptionCert: String): String = js.native
  def generateServiceProviderMetadata(decryptionCert: String, signingCert: String): String = js.native
  def generateServiceProviderMetadata(decryptionCert: Null, signingCert: String): String = js.native
  def logout(
    req: Request_[ParamsDictionary, _, _, Query],
    callback: js.Function2[/* err */ js.Error | Null, /* url */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

