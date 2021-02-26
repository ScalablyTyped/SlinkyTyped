package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserBlocks extends StObject {
  
  var blocked_for: js.Array[BlockedForEntry] = js.native
}
object UserBlocks {
  
  @scala.inline
  def apply(blocked_for: js.Array[BlockedForEntry]): UserBlocks = {
    val __obj = js.Dynamic.literal(blocked_for = blocked_for.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserBlocks]
  }
  
  @scala.inline
  implicit class UserBlocksMutableBuilder[Self <: UserBlocks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked_for(value: js.Array[BlockedForEntry]): Self = StObject.set(x, "blocked_for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocked_forVarargs(value: BlockedForEntry*): Self = StObject.set(x, "blocked_for", js.Array(value :_*))
  }
}
