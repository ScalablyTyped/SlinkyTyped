package typingsSlinky.jestCli

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jestCli.anon.ArgumentsPartialallboolea
import typingsSlinky.jestCore.anon.IsWatchMode
import typingsSlinky.jestCore.testSchedulerMod.TestSchedulerContext
import typingsSlinky.jestCore.testSchedulerMod.TestSchedulerOptions
import typingsSlinky.jestRuntime.mod.Context
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SearchSource protected ()
    extends typingsSlinky.jestCore.mod.SearchSource {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typingsSlinky.jestCore.mod.TestScheduler {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typingsSlinky.jestCore.mod.TestWatcher {
    def this(hasIsWatchMode: IsWatchMode) = this()
  }
  
  var getVersion: js.Function0[String] = js.native
  var run: js.Function2[
    /* maybeArgv */ js.UndefOr[js.Array[String]], 
    /* project */ js.UndefOr[Path], 
    js.Promise[Unit]
  ] = js.native
  def runCLI(argv: ArgumentsPartialallboolea, projects: js.Array[String]): js.Promise[typingsSlinky.jestCli.anon.GlobalConfig] = js.native
  @js.native
  object SearchSource
    extends TopLevel[Instantiable1[/* context */ Context, typingsSlinky.jestCore.mod.SearchSource]]
  
  @js.native
  object TestScheduler
    extends TopLevel[
          Instantiable3[
            /* globalConfig */ GlobalConfig, 
            /* options */ TestSchedulerOptions, 
            /* context */ TestSchedulerContext, 
            typingsSlinky.jestCore.mod.TestScheduler
          ]
        ]
  
  @js.native
  object TestWatcher
    extends TopLevel[
          Instantiable1[/* hasIsWatchMode */ IsWatchMode, typingsSlinky.jestCore.mod.TestWatcher]
        ]
  
}

