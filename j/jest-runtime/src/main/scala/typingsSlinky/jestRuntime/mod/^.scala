package typingsSlinky.jestRuntime.mod

import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.jestHasteMap.mod.ModuleMap
import typingsSlinky.jestRuntime.anon.Console
import typingsSlinky.jestRuntime.anon.Recordcacheconfigdebugver
import typingsSlinky.jestTypes.configMod.Argv
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
class ^ protected () extends Runtime {
  def this(config: ProjectConfig, environment: JestEnvironment, resolver: typingsSlinky.jestResolve.mod.^) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typingsSlinky.jestResolve.mod.^,
    cacheFS: Record[String, String]
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typingsSlinky.jestResolve.mod.^,
    cacheFS: js.UndefOr[scala.Nothing],
    coverageOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typingsSlinky.jestResolve.mod.^,
    cacheFS: Record[String, String],
    coverageOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any
  ) = this()
}
@JSImport("jest-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def createContext(config: ProjectConfig, options: Console): js.Promise[typingsSlinky.jestRuntime.typesMod.Context] = js.native
  
  def createHasteMap(config: ProjectConfig): typingsSlinky.jestHasteMap.mod.^ = js.native
  def createHasteMap(config: ProjectConfig, options: HasteMapOptions): typingsSlinky.jestHasteMap.mod.^ = js.native
  
  def createResolver(config: ProjectConfig, moduleMap: ModuleMap): typingsSlinky.jestResolve.mod.^ = js.native
  
  def getCLIOptions(): Recordcacheconfigdebugver = js.native
  
  def runCLI(): js.Promise[Unit] = js.native
  def runCLI(args: js.UndefOr[scala.Nothing], info: js.Array[String]): js.Promise[Unit] = js.native
  def runCLI(args: Argv): js.Promise[Unit] = js.native
  def runCLI(args: Argv, info: js.Array[String]): js.Promise[Unit] = js.native
  
  var shouldInstrument: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof shouldInstrument */ js.Any = js.native
}
