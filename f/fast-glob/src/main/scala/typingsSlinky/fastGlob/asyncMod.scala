package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.tasksMod.Task
import typingsSlinky.fastGlob.typesMod.EntryItem
import typingsSlinky.fastGlob.typesMod.ReaderOptions
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  @js.native
  trait ProviderAsync
    extends typingsSlinky.fastGlob.providerMod.default[js.Promise[js.Array[EntryItem]]] {
    var _reader: typingsSlinky.fastGlob.readersStreamMod.default = js.native
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
  
  @js.native
  class default () extends ProviderAsync
  
}

