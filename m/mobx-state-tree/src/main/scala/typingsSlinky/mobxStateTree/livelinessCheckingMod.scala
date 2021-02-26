package typingsSlinky.mobxStateTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object livelinessCheckingMod {
  
  @JSImport("mobx-state-tree/dist/core/node/livelinessChecking", "getLivelinessChecking")
  @js.native
  def getLivelinessChecking(): LivelinessMode = js.native
  
  @JSImport("mobx-state-tree/dist/core/node/livelinessChecking", "setLivelinessChecking")
  @js.native
  def setLivelinessChecking(mode: LivelinessMode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/core/node/livelinessChecking", "setLivelynessChecking")
  @js.native
  def setLivelynessChecking(mode: LivelinessMode): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mobxStateTree.mobxStateTreeStrings.warn
    - typingsSlinky.mobxStateTree.mobxStateTreeStrings.error
    - typingsSlinky.mobxStateTree.mobxStateTreeStrings.ignore
  */
  trait LivelinessMode extends StObject
  object LivelinessMode {
    
    @scala.inline
    def error: typingsSlinky.mobxStateTree.mobxStateTreeStrings.error = "error".asInstanceOf[typingsSlinky.mobxStateTree.mobxStateTreeStrings.error]
    
    @scala.inline
    def ignore: typingsSlinky.mobxStateTree.mobxStateTreeStrings.ignore = "ignore".asInstanceOf[typingsSlinky.mobxStateTree.mobxStateTreeStrings.ignore]
    
    @scala.inline
    def warn: typingsSlinky.mobxStateTree.mobxStateTreeStrings.warn = "warn".asInstanceOf[typingsSlinky.mobxStateTree.mobxStateTreeStrings.warn]
  }
  
  type LivelynessMode = LivelinessMode
}
