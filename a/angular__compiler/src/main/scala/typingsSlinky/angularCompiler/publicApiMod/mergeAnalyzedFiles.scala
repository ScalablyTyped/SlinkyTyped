package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.compilerMod.NgAnalyzedFile
import typingsSlinky.angularCompiler.compilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "mergeAnalyzedFiles")
@js.native
object mergeAnalyzedFiles extends js.Object {
  def apply(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
}

