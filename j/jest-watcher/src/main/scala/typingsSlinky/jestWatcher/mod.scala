package typingsSlinky.jestWatcher

import typingsSlinky.jestWatcher.anon.Stdin
import typingsSlinky.jestWatcher.baseWatchPluginMod.default
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-watcher", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def printPatternCaret(pattern: String, pipe: WritableStream): Unit = js.native
  
  def printRestoredPatternCaret(pattern: String, currentUsageRows: Double, pipe: WritableStream): Unit = js.native
  
  @js.native
  class BaseWatchPlugin protected () extends default {
    def this(hasStdinStdout: Stdin) = this()
  }
  
  @js.native
  class JestHook ()
    extends typingsSlinky.jestWatcher.jestHooksMod.default
  
  @js.native
  object KEYS extends js.Object {
    
    var ARROW_DOWN: String = js.native
    
    var ARROW_LEFT: String = js.native
    
    var ARROW_RIGHT: String = js.native
    
    var ARROW_UP: String = js.native
    
    var BACKSPACE: String = js.native
    
    var CONTROL_C: String = js.native
    
    var CONTROL_D: String = js.native
    
    var ENTER: String = js.native
    
    var ESCAPE: String = js.native
  }
  
  @js.native
  class PatternPrompt protected ()
    extends typingsSlinky.jestWatcher.patternPromptMod.default {
    def this(pipe: WritableStream, prompt: typingsSlinky.jestWatcher.promptMod.default) = this()
  }
  
  @js.native
  class Prompt ()
    extends typingsSlinky.jestWatcher.promptMod.default
}
