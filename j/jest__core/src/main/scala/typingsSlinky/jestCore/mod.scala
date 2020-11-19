package typingsSlinky.jestCore

import typingsSlinky.jestCore.anon.GlobalConfig
import typingsSlinky.jestCore.anon.IsWatchMode
import typingsSlinky.jestCore.searchSourceMod.default
import typingsSlinky.jestCore.testSchedulerMod.TestSchedulerContext
import typingsSlinky.jestCore.testSchedulerMod.TestSchedulerOptions
import typingsSlinky.jestRuntime.mod.Context
import typingsSlinky.jestTypes.configMod.Argv
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getVersion(): String = js.native
  
  def runCLI(argv: Argv, projects: js.Array[Path]): js.Promise[GlobalConfig] = js.native
  
  @js.native
  class SearchSource protected () extends default {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typingsSlinky.jestCore.testSchedulerMod.default {
    def this(
      globalConfig: typingsSlinky.jestTypes.configMod.GlobalConfig,
      options: TestSchedulerOptions,
      context: TestSchedulerContext
    ) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typingsSlinky.jestCore.testWatcherMod.default {
    def this(hasIsWatchMode: IsWatchMode) = this()
  }
}
