package typingsSlinky.jestCore

import typingsSlinky.jestCore.anon.ArgumentsPartialallboolea
import typingsSlinky.jestCore.anon.IsWatchMode
import typingsSlinky.jestCore.searchSourceMod.default
import typingsSlinky.jestCore.testSchedulerMod.TestSchedulerContext
import typingsSlinky.jestCore.testSchedulerMod.TestSchedulerOptions
import typingsSlinky.jestRuntime.mod.Context
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SearchSource protected () extends default {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typingsSlinky.jestCore.testSchedulerMod.default {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typingsSlinky.jestCore.testWatcherMod.default {
    def this(hasIsWatchMode: IsWatchMode) = this()
  }
  
  def getVersion(): String = js.native
  def runCLI(argv: ArgumentsPartialallboolea, projects: js.Array[String]): js.Promise[typingsSlinky.jestCore.anon.GlobalConfig] = js.native
}

