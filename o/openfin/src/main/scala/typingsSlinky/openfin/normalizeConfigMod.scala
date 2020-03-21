package typingsSlinky.openfin

import typingsSlinky.openfin.wireMod.ConnectConfig
import typingsSlinky.openfin.wireMod.ExternalConfig
import typingsSlinky.openfin.wireMod.InternalConnectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/util/normalize-config", JSImport.Namespace)
@js.native
object normalizeConfigMod extends js.Object {
  def normalizeConfig(config: ConnectConfig): js.Promise[InternalConnectConfig | ExternalConfig] = js.native
  def validateConfig(config: ConnectConfig): js.Promise[InternalConnectConfig] = js.native
}

