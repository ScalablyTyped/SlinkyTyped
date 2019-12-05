package typingsSlinky.javascriptDashObfuscator

import typingsSlinky.javascriptDashObfuscator.javascriptDashObfuscatorMod.ObfuscatedCode
import typingsSlinky.javascriptDashObfuscator.javascriptDashObfuscatorMod.ObfuscatorOptions
import typingsSlinky.javascriptDashObfuscator.srcInterfacesSourceDashCodeIObfuscatedCodeMod.IObfuscatedCode
import typingsSlinky.javascriptDashObfuscator.srcTypesOptionsTInputOptionsMod.TInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator", JSImport.Namespace)
@js.native
object javascriptDashObfuscatorMod extends js.Object {
  def obfuscate(sourceCode: String): ObfuscatedCode = js.native
  def obfuscate(sourceCode: String, inputOptions: ObfuscatorOptions): ObfuscatedCode = js.native
  type ObfuscatedCode = IObfuscatedCode
  type ObfuscatorOptions = TInputOptions
}

