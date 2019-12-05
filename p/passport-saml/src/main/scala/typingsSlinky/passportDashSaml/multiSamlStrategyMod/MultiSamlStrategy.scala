package typingsSlinky.passportDashSaml.multiSamlStrategyMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.passportDashSaml.passportDashSamlMod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSamlStrategy extends Strategy {
  def generateServiceProviderMetadata(
    req: Request[ParamsDictionary],
    decryptionCert: String,
    signingCert: String,
    callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request[ParamsDictionary],
    decryptionCert: String,
    signingCert: Null,
    callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request[ParamsDictionary],
    decryptionCert: Null,
    signingCert: String,
    callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request[ParamsDictionary],
    decryptionCert: Null,
    signingCert: Null,
    callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
}

