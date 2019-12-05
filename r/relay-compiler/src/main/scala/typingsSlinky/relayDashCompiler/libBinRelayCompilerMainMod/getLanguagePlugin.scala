package typingsSlinky.relayDashCompiler.libBinRelayCompilerMainMod

import typingsSlinky.relayDashCompiler.libLanguageRelayLanguagePluginInterfaceMod.PluginInitializer
import typingsSlinky.relayDashCompiler.libLanguageRelayLanguagePluginInterfaceMod.PluginInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/bin/RelayCompilerMain", "getLanguagePlugin")
@js.native
object getLanguagePlugin extends js.Object {
  def apply(language: String): PluginInterface = js.native
  def apply(language: PluginInitializer): PluginInterface = js.native
}

