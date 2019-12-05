package typingsSlinky.passportDashSaml.passportDashSamlMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.passportMod.Strategy {
  def this(config: SamlConfig, verify: VerifyWithRequest) = this()
  def this(config: SamlConfig, verify: VerifyWithoutRequest) = this()
  def authenticate(req: Request[ParamsDictionary], options: AuthenticateOptions): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: AuthorizeOptions): Unit = js.native
  def generateServiceProviderMetadata(): String = js.native
  def generateServiceProviderMetadata(decryptionCert: String): String = js.native
  def generateServiceProviderMetadata(decryptionCert: String, signingCert: String): String = js.native
  def generateServiceProviderMetadata(decryptionCert: Null, signingCert: String): String = js.native
  def logout(
    req: Request[ParamsDictionary],
    callback: js.Function2[/* err */ js.Error | Null, /* url */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

