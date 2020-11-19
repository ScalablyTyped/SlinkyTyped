package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.tasksMod.Task
import typingsSlinky.fastGlob.typesMod.ReaderOptions
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob/out/providers/stream", JSImport.Namespace)
@js.native
object streamMod extends js.Object {
  
  @js.native
  trait ProviderStream
    extends typingsSlinky.fastGlob.providerMod.default[Readable] {
    
    var _reader: typingsSlinky.fastGlob.readersStreamMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
  
  @js.native
  class default () extends ProviderStream
}
