package typingsSlinky.gulpTypescript.projectMod

import typingsSlinky.gulpTypescript.Typeofts
import typingsSlinky.gulpTypescript.typesMod.FinalTransformers
import typingsSlinky.gulpTypescript.typesMod.TsConfig
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/project", "setupProject")
@js.native
object setupProject extends js.Object {
  def apply(
    projectDirectory: String,
    configFileName: String,
    rawConfig: js.Any,
    config: TsConfig,
    options: CompilerOptions,
    projectReferences: js.Array[ProjectReference],
    typescript: Typeofts,
    finalTransformers: FinalTransformers
  ): Project = js.native
}

