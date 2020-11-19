package typingsSlinky.relayCompiler.relayCompilerMainMod

import typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod.PluginInitializer
import typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod.PluginInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-compiler/lib/bin/RelayCompilerMain", "getLanguagePlugin")
@js.native
object getLanguagePlugin extends js.Object {
  
  def apply(language: String): PluginInterface = js.native
  def apply(language: PluginInitializer): PluginInterface = js.native
}
