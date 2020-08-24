package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.tasksMod.Task
import typingsSlinky.fastGlob.typesMod.Entry
import typingsSlinky.fastGlob.typesMod.EntryItem
import typingsSlinky.fastGlob.typesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/sync", JSImport.Namespace)
@js.native
object syncMod extends js.Object {
  @js.native
  trait ProviderSync
    extends typingsSlinky.fastGlob.providerMod.default[js.Array[EntryItem]] {
    var _reader: typingsSlinky.fastGlob.readersSyncMod.default = js.native
    def api(root: String, task: Task, options: ReaderOptions): js.Array[Entry] = js.native
  }
  
  @js.native
  class default () extends ProviderSync
  
}

