package typingsSlinky.jestWatcher

import typingsSlinky.jestWatcher.anon.Header
import typingsSlinky.jestWatcher.typesMod.ScrollOptions
import typingsSlinky.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternPromptMod {
  
  @JSImport("jest-watcher/build/PatternPrompt", JSImport.Default)
  @js.native
  class default protected () extends PatternPrompt {
    def this(pipe: WritableStream, prompt: typingsSlinky.jestWatcher.promptMod.default) = this()
  }
  
  @js.native
  trait PatternPrompt extends StObject {
    
    var _currentUsageRows: Double = js.native
    
    var _entityName: String = js.native
    
    /* protected */ def _onChange(_pattern: String, _options: ScrollOptions): Unit = js.native
    
    var _pipe: WritableStream = js.native
    
    var _prompt: typingsSlinky.jestWatcher.promptMod.default = js.native
    
    def run(onSuccess: js.Function1[/* value */ String, Unit], onCancel: js.Function0[Unit]): Unit = js.native
    def run(onSuccess: js.Function1[/* value */ String, Unit], onCancel: js.Function0[Unit], options: Header): Unit = js.native
  }
}
