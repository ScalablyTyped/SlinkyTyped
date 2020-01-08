package typingsSlinky.fastDashGlob

import typingsSlinky.fastDashGlob.outManagersTasksMod.Task
import typingsSlinky.fastDashGlob.outTypesMod.EntryItem
import typingsSlinky.fastDashGlob.outTypesMod.ReaderOptions
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/async", JSImport.Namespace)
@js.native
object outProvidersAsyncMod extends js.Object {
  @js.native
  trait ProviderAsync
    extends typingsSlinky.fastDashGlob.outProvidersProviderMod.default[js.Promise[js.Array[EntryItem]]] {
    var _reader: typingsSlinky.fastDashGlob.outReadersStreamMod.default = js.native
    def api(root: String, task: Task, options: ReaderOptions): ReadableStream = js.native
  }
  
  @js.native
  class default () extends ProviderAsync
  
}

