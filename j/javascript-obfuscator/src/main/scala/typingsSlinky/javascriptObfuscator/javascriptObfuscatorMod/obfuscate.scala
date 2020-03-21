package typingsSlinky.javascriptObfuscator.javascriptObfuscatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator", "obfuscate")
@js.native
object obfuscate extends js.Object {
  def apply(sourceCode: String): ObfuscatedCode = js.native
  def apply(sourceCode: String, inputOptions: ObfuscatorOptions): ObfuscatedCode = js.native
}

