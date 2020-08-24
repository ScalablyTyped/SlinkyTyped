package typingsSlinky.angularCompiler.compilerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.viewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "parseHostBindings")
@js.native
object parseHostBindings extends js.Object {
  def apply(host: StringDictionary[String | typingsSlinky.angularCompiler.outputAstMod.Expression]): ParsedHostBindings = js.native
}

