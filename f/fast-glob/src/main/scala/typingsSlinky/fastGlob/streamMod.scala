package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.tasksMod.Task
import typingsSlinky.fastGlob.typesMod.ReaderOptions
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("fast-glob/out/providers/stream", JSImport.Default)
  @js.native
  class default () extends ProviderStream
  
  @js.native
  trait ProviderStream
    extends typingsSlinky.fastGlob.providerMod.default[Readable] {
    
    var _reader: typingsSlinky.fastGlob.readersStreamMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
}
