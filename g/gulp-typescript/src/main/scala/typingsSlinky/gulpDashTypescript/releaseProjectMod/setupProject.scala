package typingsSlinky.gulpDashTypescript.releaseProjectMod

import typingsSlinky.gulpDashTypescript.Typeofts
import typingsSlinky.gulpDashTypescript.releaseTypesMod.FinalTransformers
import typingsSlinky.gulpDashTypescript.releaseTypesMod.TsConfig
import typingsSlinky.typescript.typescriptMod.CompilerOptions
import typingsSlinky.typescript.typescriptMod.ProjectReference
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

