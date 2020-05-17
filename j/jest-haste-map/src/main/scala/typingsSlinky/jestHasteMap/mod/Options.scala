package typingsSlinky.jestHasteMap.mod

import org.scalajs.dom.raw.Console
import typingsSlinky.jestHasteMap.typesMod.HasteRegExp
import typingsSlinky.jestHasteMap.typesMod.Mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.native
  var computeDependencies: js.UndefOr[Boolean] = js.native
  var computeSha1: js.UndefOr[Boolean] = js.native
  var console: js.UndefOr[Console] = js.native
  var dependencyExtractor: js.UndefOr[String] = js.native
  var extensions: js.Array[String] = js.native
  var forceNodeFilesystemAPI: js.UndefOr[Boolean] = js.native
  var hasteImplModulePath: js.UndefOr[String] = js.native
  var ignorePattern: js.UndefOr[HasteRegExp] = js.native
  var mapper: js.UndefOr[Mapper] = js.native
  var maxWorkers: Double = js.native
  var mocksPattern: js.UndefOr[String] = js.native
  var name: String = js.native
  var platforms: js.Array[String] = js.native
  var providesModuleNodeModules: js.UndefOr[js.Array[String]] = js.native
  var resetCache: js.UndefOr[Boolean] = js.native
  var retainAllFiles: Boolean = js.native
  var rootDir: String = js.native
  var roots: js.Array[String] = js.native
  var skipPackageJson: js.UndefOr[Boolean] = js.native
  var throwOnModuleCollision: js.UndefOr[Boolean] = js.native
  var useWatchman: js.UndefOr[Boolean] = js.native
  var watch: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(
    extensions: js.Array[String],
    maxWorkers: Double,
    name: String,
    platforms: js.Array[String],
    retainAllFiles: Boolean,
    rootDir: String,
    roots: js.Array[String]
  ): Options = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], retainAllFiles = retainAllFiles.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withMaxWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetainAllFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainAllFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoots(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeSha1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeSha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeSha1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeSha1")(js.undefined)
        ret
    }
    @scala.inline
    def withConsole(value: Console): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencyExtractor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyExtractor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencyExtractor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withForceNodeFilesystemAPI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNodeFilesystemAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceNodeFilesystemAPI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNodeFilesystemAPI")(js.undefined)
        ret
    }
    @scala.inline
    def withHasteImplModulePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteImplModulePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasteImplModulePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteImplModulePath")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePatternFunction1(value: /* str */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIgnorePatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnorePattern(value: HasteRegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withMapper(value: /* item */ String => js.Array[String] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapper")(js.undefined)
        ret
    }
    @scala.inline
    def withMocksPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocksPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMocksPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocksPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withProvidesModuleNodeModules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providesModuleNodeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidesModuleNodeModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providesModuleNodeModules")(js.undefined)
        ret
    }
    @scala.inline
    def withResetCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipPackageJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPackageJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipPackageJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPackageJson")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnModuleCollision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnModuleCollision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnModuleCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnModuleCollision")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWatchman(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWatchman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWatchman: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWatchman")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

