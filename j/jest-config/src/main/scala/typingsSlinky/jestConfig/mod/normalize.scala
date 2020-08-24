package typingsSlinky.jestConfig.mod

import typingsSlinky.jestConfig.anon.HasDeprecationWarnings
import typingsSlinky.jestTypes.configMod.Argv
import typingsSlinky.jestTypes.configMod.InitialOptions
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config", "normalize")
@js.native
object normalize extends js.Object {
  def apply(initialOptions: InitialOptions, argv: Argv): HasDeprecationWarnings = js.native
  def apply(
    initialOptions: InitialOptions,
    argv: Argv,
    configPath: js.UndefOr[scala.Nothing],
    projectIndex: Double
  ): HasDeprecationWarnings = js.native
  def apply(initialOptions: InitialOptions, argv: Argv, configPath: Null, projectIndex: Double): HasDeprecationWarnings = js.native
  def apply(initialOptions: InitialOptions, argv: Argv, configPath: Path): HasDeprecationWarnings = js.native
  def apply(initialOptions: InitialOptions, argv: Argv, configPath: Path, projectIndex: Double): HasDeprecationWarnings = js.native
}

