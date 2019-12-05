package typingsSlinky.javascriptDashObfuscator

import typingsSlinky.javascriptDashObfuscator.javascriptDashObfuscatorStrings.config
import typingsSlinky.javascriptDashObfuscator.javascriptDashObfuscatorStrings.exclude
import typingsSlinky.javascriptDashObfuscator.javascriptDashObfuscatorStrings.output
import typingsSlinky.javascriptDashObfuscator.javascriptDashObfuscatorStrings.version
import typingsSlinky.javascriptDashObfuscator.srcInterfacesOptionsICLIOptionsMod.ICLIOptions
import typingsSlinky.javascriptDashObfuscator.srcTypesTObjectMod.TObject
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/options/TInputCLIOptions", JSImport.Namespace)
@js.native
object srcTypesOptionsTInputCLIOptionsMod extends js.Object {
  type TInputCLIOptions = (Partial[Pick[ICLIOptions, config | exclude | output | version]]) with TObject[_]
}

