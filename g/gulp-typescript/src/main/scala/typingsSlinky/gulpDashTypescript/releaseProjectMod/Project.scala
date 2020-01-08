package typingsSlinky.gulpDashTypescript.releaseProjectMod

import typingsSlinky.gulpDashTypescript.Typeofts
import typingsSlinky.gulpDashTypescript.releaseReporterMod.Reporter
import typingsSlinky.gulpDashTypescript.releaseTypesMod.TsConfig
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.typescript.typescriptMod.CompilerOptions
import typingsSlinky.typescript.typescriptMod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  val config: TsConfig = js.native
  val configFileName: String = js.native
  val options: CompilerOptions = js.native
  val projectDirectory: String = js.native
  val projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  val rawConfig: js.Any = js.native
  val typescript: js.UndefOr[Typeofts] = js.native
  def apply(): ICompileStream = js.native
  def apply(reporter: Reporter): ICompileStream = js.native
  def src(): ReadWriteStream = js.native
}

