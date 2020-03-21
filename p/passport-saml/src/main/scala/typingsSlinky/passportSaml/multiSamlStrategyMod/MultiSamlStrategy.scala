package typingsSlinky.passportSaml.multiSamlStrategyMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.passportSaml.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSamlStrategy extends Strategy {
  def generateServiceProviderMetadata(
    req: Request_[ParamsDictionary],
    decryptionCert: String,
    signingCert: String,
    callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request_[ParamsDictionary],
    decryptionCert: String,
    signingCert: Null,
    callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request_[ParamsDictionary],
    decryptionCert: Null,
    signingCert: String,
    callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request_[ParamsDictionary],
    decryptionCert: Null,
    signingCert: Null,
    callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
}

