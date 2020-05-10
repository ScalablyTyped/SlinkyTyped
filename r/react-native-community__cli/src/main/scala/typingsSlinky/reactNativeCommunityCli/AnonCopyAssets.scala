package typingsSlinky.reactNativeCommunityCli

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCopyAssets[ProjectConfig, DependencyConfig] extends js.Object {
  def copyAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit = js.native
  def isInstalled(projectConfig: ProjectConfig, name: String, dependencyConfig: DependencyConfig): Boolean = js.native
  def register(
    name: String,
    dependencyConfig: DependencyConfig,
    params: Record[String, String],
    projectConfig: ProjectConfig
  ): Unit = js.native
  def unlinkAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit = js.native
  def unregister(
    packageName: String,
    dependencyConfig: DependencyConfig,
    projectConfig: ProjectConfig,
    otherDependencies: js.Array[DependencyConfig]
  ): Unit = js.native
}

object AnonCopyAssets {
  @scala.inline
  def apply[ProjectConfig, DependencyConfig](
    copyAssets: (js.Array[String], ProjectConfig) => Unit,
    isInstalled: (ProjectConfig, String, DependencyConfig) => Boolean,
    register: (String, DependencyConfig, Record[String, String], ProjectConfig) => Unit,
    unlinkAssets: (js.Array[String], ProjectConfig) => Unit,
    unregister: (String, DependencyConfig, ProjectConfig, js.Array[DependencyConfig]) => Unit
  ): AnonCopyAssets[ProjectConfig, DependencyConfig] = {
    val __obj = js.Dynamic.literal(copyAssets = js.Any.fromFunction2(copyAssets), isInstalled = js.Any.fromFunction3(isInstalled), register = js.Any.fromFunction4(register), unlinkAssets = js.Any.fromFunction2(unlinkAssets), unregister = js.Any.fromFunction4(unregister))
    __obj.asInstanceOf[AnonCopyAssets[ProjectConfig, DependencyConfig]]
  }
  @scala.inline
  implicit class AnonCopyAssetsOps[Self[projectconfig, dependencyconfig] <: AnonCopyAssets[projectconfig, dependencyconfig], ProjectConfig, DependencyConfig] (val x: Self[ProjectConfig, DependencyConfig]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ProjectConfig, DependencyConfig] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ProjectConfig, DependencyConfig]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ProjectConfig, DependencyConfig]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ProjectConfig, DependencyConfig]) with Other]
    @scala.inline
    def withCopyAssets(value: (js.Array[String], ProjectConfig) => Unit): Self[ProjectConfig, DependencyConfig] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAssets")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsInstalled(value: (ProjectConfig, String, DependencyConfig) => Boolean): Self[ProjectConfig, DependencyConfig] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInstalled")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRegister(value: (String, DependencyConfig, Record[String, String], ProjectConfig) => Unit): Self[ProjectConfig, DependencyConfig] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUnlinkAssets(value: (js.Array[String], ProjectConfig) => Unit): Self[ProjectConfig, DependencyConfig] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlinkAssets")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnregister(value: (String, DependencyConfig, ProjectConfig, js.Array[DependencyConfig]) => Unit): Self[ProjectConfig, DependencyConfig] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

