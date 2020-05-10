package typingsSlinky.jestResolve.typesMod

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverConfig extends js.Object {
  var browser: js.UndefOr[Boolean] = js.native
  var defaultPlatform: js.UndefOr[String | Null] = js.native
  var extensions: js.Array[String] = js.native
  var hasCoreModules: Boolean = js.native
  var moduleDirectories: js.Array[String] = js.native
  var moduleNameMapper: js.UndefOr[js.Array[ModuleNameMapperConfig] | Null] = js.native
  var modulePaths: js.Array[Path] = js.native
  var platforms: js.UndefOr[js.Array[String]] = js.native
  var resolver: js.UndefOr[Path | Null] = js.native
  var rootDir: Path = js.native
}

object ResolverConfig {
  @scala.inline
  def apply(
    extensions: js.Array[String],
    hasCoreModules: Boolean,
    moduleDirectories: js.Array[String],
    modulePaths: js.Array[Path],
    rootDir: Path
  ): ResolverConfig = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], hasCoreModules = hasCoreModules.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverConfig]
  }
  @scala.inline
  implicit class ResolverConfigOps[Self <: ResolverConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasCoreModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCoreModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleDirectories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulePaths(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDir(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPlatformNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPlatform")(null)
        ret
    }
    @scala.inline
    def withModuleNameMapper(value: js.Array[ModuleNameMapperConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleNameMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleNameMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleNameMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleNameMapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleNameMapper")(null)
        ret
    }
    @scala.inline
    def withPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.undefined)
        ret
    }
    @scala.inline
    def withResolver(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(null)
        ret
    }
  }
  
}

