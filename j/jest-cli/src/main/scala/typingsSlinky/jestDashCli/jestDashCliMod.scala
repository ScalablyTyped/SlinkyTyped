package typingsSlinky.jestDashCli

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.atJestCore.Anon_IsWatchMode
import typingsSlinky.atJestCore.buildTestSchedulerMod.TestSchedulerContext
import typingsSlinky.atJestCore.buildTestSchedulerMod.TestSchedulerOptions
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.jestDashRuntime.jestDashRuntimeMod.Context
import typingsSlinky.std.Partial
import typingsSlinky.yargs.yargsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli", JSImport.Namespace)
@js.native
object jestDashCliMod extends js.Object {
  @js.native
  class SearchSource protected ()
    extends typingsSlinky.atJestCore.atJestCoreMod.SearchSource {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typingsSlinky.atJestCore.atJestCoreMod.TestScheduler {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typingsSlinky.atJestCore.atJestCoreMod.TestWatcher {
    def this(hasIsWatchMode: Anon_IsWatchMode) = this()
  }
  
  var SearchSource: Instantiable1[/* context */ Context, typingsSlinky.atJestCore.atJestCoreMod.SearchSource] = js.native
  var TestScheduler: Instantiable3[
    /* globalConfig */ GlobalConfig, 
    /* options */ TestSchedulerOptions, 
    /* context */ TestSchedulerContext, 
    typingsSlinky.atJestCore.atJestCoreMod.TestScheduler
  ] = js.native
  var TestWatcher: Instantiable1[
    /* hasIsWatchMode */ Anon_IsWatchMode, 
    typingsSlinky.atJestCore.atJestCoreMod.TestWatcher
  ] = js.native
  var getVersion: js.Function0[String] = js.native
  var run: js.Function2[
    /* maybeArgv */ js.UndefOr[js.Array[String]], 
    /* project */ js.UndefOr[Path], 
    js.Promise[Unit]
  ] = js.native
  def runCLI(argv: Arguments[Partial[Anon_All]], projects: js.Array[String]): js.Promise[Anon_GlobalConfig] = js.native
}

