package typingsSlinky.reactNativeCommunityCli.mod

import typingsSlinky.reactNativeCommunityCli.AnonCopyAssets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] extends js.Object {
  def dependencyConfig(dependency: String, params: DependencyParams): DependencyConfig = js.native
  def linkConfig(): AnonCopyAssets[ProjectConfig, DependencyConfig] = js.native
  def projectConfig(projectRoot: String, projectParams: ProjectParams): ProjectConfig = js.native
}

object PlatformConfig {
  @scala.inline
  def apply[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig](
    dependencyConfig: (String, DependencyParams) => DependencyConfig,
    linkConfig: () => AnonCopyAssets[ProjectConfig, DependencyConfig],
    projectConfig: (String, ProjectParams) => ProjectConfig
  ): PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] = {
    val __obj = js.Dynamic.literal(dependencyConfig = js.Any.fromFunction2(dependencyConfig), linkConfig = js.Any.fromFunction0(linkConfig), projectConfig = js.Any.fromFunction2(projectConfig))
    __obj.asInstanceOf[PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig]]
  }
  @scala.inline
  implicit class PlatformConfigOps[Self[projectparams, dependencyparams, projectconfig, dependencyconfig] <: PlatformConfig[projectparams, dependencyparams, projectconfig, dependencyconfig], ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] (val x: Self[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig]) with Other]
    @scala.inline
    def withDependencyConfig(value: (String, DependencyParams) => DependencyConfig): Self[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyConfig")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLinkConfig(value: () => AnonCopyAssets[ProjectConfig, DependencyConfig]): Self[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProjectConfig(value: (String, ProjectParams) => ProjectConfig): Self[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfig")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

