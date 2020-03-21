package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.compilerMod.NgAnalyzedFile
import typingsSlinky.angularCompiler.compilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "mergeAnalyzedFiles")
@js.native
object mergeAnalyzedFiles extends js.Object {
  def apply(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
}

