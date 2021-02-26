package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Starredat extends StObject {
  
  var starred_at: String = js.native
  
  var user: Avatarurl = js.native
}
object Starredat {
  
  @scala.inline
  def apply(starred_at: String, user: Avatarurl): Starredat = {
    val __obj = js.Dynamic.literal(starred_at = starred_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Starredat]
  }
  
  @scala.inline
  implicit class StarredatMutableBuilder[Self <: Starredat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStarred_at(value: String): Self = StObject.set(x, "starred_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
