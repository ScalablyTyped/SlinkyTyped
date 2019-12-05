package typingsSlinky.jestDashConfig.jestDashConfigMod

import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.atJestTypes.buildConfigMod.InitialOptions
import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
import typingsSlinky.jestDashConfig.Argv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadConfig extends js.Object {
  var configPath: js.UndefOr[Path | Null] = js.undefined
  var globalConfig: GlobalConfig
  var hasDeprecationWarnings: Boolean
  var projectConfig: ProjectConfig
}

object ReadConfig {
  @scala.inline
  def apply(
    globalConfig: GlobalConfig,
    hasDeprecationWarnings: Boolean,
    projectConfig: ProjectConfig,
    configPath: Path = null
  ): ReadConfig = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], projectConfig = projectConfig.asInstanceOf[js.Any])
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfig]
  }
}

@JSImport("jest-config", "readConfig")
@js.native
object readConfig extends js.Object {
  def apply(argv: Argv, packageRootOrConfig: InitialOptions): ReadConfig = js.native
  def apply(argv: Argv, packageRootOrConfig: InitialOptions, skipArgvConfigOption: Boolean): ReadConfig = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Null,
    projectIndex: Double
  ): ReadConfig = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path
  ): ReadConfig = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path,
    projectIndex: Double
  ): ReadConfig = js.native
  def apply(argv: Argv, packageRootOrConfig: Path): ReadConfig = js.native
  def apply(argv: Argv, packageRootOrConfig: Path, skipArgvConfigOption: Boolean): ReadConfig = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: Path,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Null,
    projectIndex: Double
  ): ReadConfig = js.native
  def apply(argv: Argv, packageRootOrConfig: Path, skipArgvConfigOption: Boolean, parentConfigPath: Path): ReadConfig = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: Path,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path,
    projectIndex: Double
  ): ReadConfig = js.native
}

