package typingsSlinky.atJestCore

import typingsSlinky.atJestCore.buildSearchSourceMod.default
import typingsSlinky.atJestCore.buildTestSchedulerMod.TestSchedulerContext
import typingsSlinky.atJestCore.buildTestSchedulerMod.TestSchedulerOptions
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.jestDashRuntime.jestDashRuntimeMod.Context
import typingsSlinky.std.Partial
import typingsSlinky.yargs.yargsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core", JSImport.Namespace)
@js.native
object atJestCoreMod extends js.Object {
  @js.native
  class SearchSource protected () extends default {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typingsSlinky.atJestCore.buildTestSchedulerMod.default {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typingsSlinky.atJestCore.buildTestWatcherMod.default {
    def this(hasIsWatchMode: Anon_IsWatchMode) = this()
  }
  
  def getVersion(): String = js.native
  def runCLI(argv: Arguments[Partial[Anon_All]], projects: js.Array[String]): js.Promise[Anon_GlobalConfig] = js.native
}

