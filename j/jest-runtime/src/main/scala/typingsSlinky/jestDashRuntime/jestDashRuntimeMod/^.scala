package typingsSlinky.jestDashRuntime.jestDashRuntimeMod

import typingsSlinky.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
import typingsSlinky.atJestTypes.buildConfigMod.Argv
import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
import typingsSlinky.jestDashHasteDashMap.jestDashHasteDashMapMod.ModuleMap
import typingsSlinky.jestDashRuntime.Anon_Console
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.cache
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.config
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.debug
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.version
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.watchman
import typingsSlinky.std.Record
import typingsSlinky.yargs.yargsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
class ^ protected () extends Runtime {
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typingsSlinky.jestDashResolve.jestDashResolveMod.^
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typingsSlinky.jestDashResolve.jestDashResolveMod.^,
    cacheFS: CacheFS
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typingsSlinky.jestDashResolve.jestDashResolveMod.^,
    cacheFS: CacheFS,
    coverageOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any
  ) = this()
}

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ScriptTransformer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScriptTransformer */ js.Any = js.native
  def createContext(config: ProjectConfig, options: Anon_Console): js.Promise[typingsSlinky.jestDashRuntime.buildTypesMod.Context] = js.native
  def createHasteMap(config: ProjectConfig): typingsSlinky.jestDashHasteDashMap.jestDashHasteDashMapMod.^ = js.native
  def createHasteMap(config: ProjectConfig, options: HasteMapOptions): typingsSlinky.jestDashHasteDashMap.jestDashHasteDashMapMod.^ = js.native
  def createResolver(config: ProjectConfig, moduleMap: ModuleMap): typingsSlinky.jestDashResolve.jestDashResolveMod.^ = js.native
  def getCLIOptions(): Record[cache | config | debug | version | watchman, Options] = js.native
  def runCLI(): Unit = js.native
  def runCLI(args: Argv): Unit = js.native
  def runCLI(args: Argv, info: js.Array[String]): Unit = js.native
  def shouldInstrument(
    filename: Path,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any,
    config: ProjectConfig
  ): Boolean = js.native
}

