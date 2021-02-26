package typingsSlinky.openfin

import typingsSlinky.openfin.wireMod.ConnectConfig
import typingsSlinky.openfin.wireMod.ExternalConfig
import typingsSlinky.openfin.wireMod.InternalConnectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeConfigMod {
  
  @JSImport("openfin/_v2/util/normalize-config", "normalizeConfig")
  @js.native
  def normalizeConfig(config: ConnectConfig): js.Promise[InternalConnectConfig | ExternalConfig] = js.native
  
  @JSImport("openfin/_v2/util/normalize-config", "validateConfig")
  @js.native
  def validateConfig(config: ConnectConfig): js.Promise[InternalConnectConfig] = js.native
}
