package typingsSlinky.jestWatcher

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-watcher/build/lib/patternModeHelpers", JSImport.Namespace)
@js.native
object patternModeHelpersMod extends js.Object {
  
  def printPatternCaret(pattern: String, pipe: WritableStream): Unit = js.native
  
  def printRestoredPatternCaret(pattern: String, currentUsageRows: Double, pipe: WritableStream): Unit = js.native
}
