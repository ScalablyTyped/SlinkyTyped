package typingsSlinky.jestConfig

import typingsSlinky.jestTypes.configMod.Argv
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.InitialOptions
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config/build/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def default(options: InitialOptions, argv: Argv): AnonHasDeprecationWarnings = js.native
  def default(options: InitialOptions, argv: Argv, configPath: Null, projectIndex: Double): AnonHasDeprecationWarnings = js.native
  def default(options: InitialOptions, argv: Argv, configPath: Path): AnonHasDeprecationWarnings = js.native
  def default(options: InitialOptions, argv: Argv, configPath: Path, projectIndex: Double): AnonHasDeprecationWarnings = js.native
  type AllOptions = ProjectConfig with GlobalConfig
}

