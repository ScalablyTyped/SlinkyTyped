package typingsSlinky.nodegit

import typingsSlinky.nodegit.diffDeltaMod.DiffDelta
import typingsSlinky.nodegit.statusFileOptionsMod.StatusFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/status-file", JSImport.Namespace)
@js.native
object statusFileMod extends js.Object {
  
  @js.native
  class StatusFile protected () extends js.Object {
    def this(args: StatusFileOptions) = this()
    
    def headToIndex(): DiffDelta = js.native
    
    def inIndex(): Boolean = js.native
    
    def inWorkingTree(): Boolean = js.native
    
    def indexToWorkdir(): DiffDelta = js.native
    
    def isConflicted(): Boolean = js.native
    
    def isDeleted(): Boolean = js.native
    
    def isIgnored(): Boolean = js.native
    
    def isModified(): Boolean = js.native
    
    def isNew(): Boolean = js.native
    
    def isRenamed(): Boolean = js.native
    
    def isTypechange(): Boolean = js.native
    
    def path(): String = js.native
    
    def status(): js.Array[String] = js.native
    
    def statusBit(): Double = js.native
  }
}
