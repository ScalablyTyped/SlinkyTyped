package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.tasksMod.Task
import typingsSlinky.fastGlob.typesMod.Entry
import typingsSlinky.fastGlob.typesMod.EntryItem
import typingsSlinky.fastGlob.typesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("fast-glob/out/providers/sync", JSImport.Default)
  @js.native
  class default () extends ProviderSync
  
  @js.native
  trait ProviderSync
    extends typingsSlinky.fastGlob.providerMod.default[js.Array[EntryItem]] {
    
    var _reader: typingsSlinky.fastGlob.readersSyncMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): js.Array[Entry] = js.native
  }
}
