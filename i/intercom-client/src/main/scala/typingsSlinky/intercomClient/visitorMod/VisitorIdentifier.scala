package typingsSlinky.intercomClient.visitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.anon.Id
  - typingsSlinky.intercomClient.anon.Userid
*/
trait VisitorIdentifier extends js.Object
object VisitorIdentifier {
  
  @scala.inline
  def Id(id: String): VisitorIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorIdentifier]
  }
  
  @scala.inline
  def Userid(user_id: String): VisitorIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorIdentifier]
  }
}
