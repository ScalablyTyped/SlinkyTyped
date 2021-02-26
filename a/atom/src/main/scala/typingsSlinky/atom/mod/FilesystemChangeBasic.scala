package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.created
import typingsSlinky.atom.atomStrings.deleted
import typingsSlinky.atom.atomStrings.modified
import typingsSlinky.atom.atomStrings.renamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesystemChangeBasic[Action /* <: created | modified | deleted | renamed */] extends StObject {
  
  /** A string describing the filesystem action that occurred. */
  var action: Action = js.native
  
  /** The absolute path to the filesystem entry that was acted upon. */
  var path: String = js.native
}
object FilesystemChangeBasic {
  
  @scala.inline
  def apply[Action /* <: created | modified | deleted | renamed */](action: Action, path: String): FilesystemChangeBasic[Action] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemChangeBasic[Action]]
  }
  
  @scala.inline
  implicit class FilesystemChangeBasicMutableBuilder[Self <: FilesystemChangeBasic[_], Action /* <: created | modified | deleted | renamed */] (val x: Self with FilesystemChangeBasic[Action]) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
