package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.tasksMod.Task
import typingsSlinky.fastGlob.typesMod.EntryItem
import typingsSlinky.fastGlob.typesMod.ReaderOptions
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("fast-glob/out/providers/async", JSImport.Default)
  @js.native
  class default () extends ProviderAsync
  
  @js.native
  trait ProviderAsync
    extends typingsSlinky.fastGlob.providerMod.default[js.Promise[js.Array[EntryItem]]] {
    
    var _reader: typingsSlinky.fastGlob.readersStreamMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
}
