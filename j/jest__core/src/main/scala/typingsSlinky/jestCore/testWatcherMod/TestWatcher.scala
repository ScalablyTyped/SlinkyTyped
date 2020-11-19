package typingsSlinky.jestCore.testWatcherMod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestWatcher extends EventEmitter {
  
  var _isWatchMode: js.Any = js.native
  
  def isInterrupted(): Boolean = js.native
  
  def isWatchMode(): Boolean = js.native
  
  def setState(state: State): Unit = js.native
  
  var state: State = js.native
}
