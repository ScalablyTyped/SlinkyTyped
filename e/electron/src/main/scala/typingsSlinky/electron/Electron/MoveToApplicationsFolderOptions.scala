package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.exists
import typingsSlinky.electron.electronStrings.existsAndRunning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveToApplicationsFolderOptions extends StObject {
  
  /**
    * A handler for potential conflict in move failure.
    */
  var conflictHandler: js.UndefOr[js.Function1[/* conflictType */ exists | existsAndRunning, Boolean]] = js.native
}
object MoveToApplicationsFolderOptions {
  
  @scala.inline
  def apply(): MoveToApplicationsFolderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToApplicationsFolderOptions]
  }
  
  @scala.inline
  implicit class MoveToApplicationsFolderOptionsMutableBuilder[Self <: MoveToApplicationsFolderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflictHandler(value: /* conflictType */ exists | existsAndRunning => Boolean): Self = StObject.set(x, "conflictHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConflictHandlerUndefined: Self = StObject.set(x, "conflictHandler", js.undefined)
  }
}
