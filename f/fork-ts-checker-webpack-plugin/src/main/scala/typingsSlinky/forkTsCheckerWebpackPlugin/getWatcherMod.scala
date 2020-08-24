package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/getWatcher", JSImport.Namespace)
@js.native
object getWatcherMod extends js.Object {
  @js.native
  trait Watcher extends EventEmitter {
    var mtimes: Record[String, Double] = js.native
  }
  
  def getWatcher(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): js.UndefOr[Watcher] = js.native
}

