package typingsSlinky.fastDashGlob

import typingsSlinky.fastDashGlob.outManagersTasksMod.Task
import typingsSlinky.fastDashGlob.outProvidersSyncMod.ProviderSync
import typingsSlinky.fastDashGlob.outTypesMod.Entry
import typingsSlinky.fastDashGlob.outTypesMod.EntryItem
import typingsSlinky.fastDashGlob.outTypesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/sync", JSImport.Namespace)
@js.native
object outProvidersSyncMod extends js.Object {
  @js.native
  trait ProviderSync
    extends typingsSlinky.fastDashGlob.outProvidersProviderMod.default[js.Array[EntryItem]] {
    var _reader: typingsSlinky.fastDashGlob.outReadersSyncMod.default = js.native
    def api(root: String, task: Task, options: ReaderOptions): js.Array[Entry] = js.native
  }
  
  @js.native
  class default () extends ProviderSync
  
}

