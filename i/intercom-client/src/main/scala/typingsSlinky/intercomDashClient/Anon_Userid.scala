package typingsSlinky.intercomDashClient

import typingsSlinky.intercomDashClient.leadMod.LeadIdentifier
import typingsSlinky.intercomDashClient.userMod.UserIdentifier
import typingsSlinky.intercomDashClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Userid
  extends LeadIdentifier
     with UserIdentifier
     with VisitorIdentifier {
  var user_id: String
}

object Anon_Userid {
  @scala.inline
  def apply(user_id: String): Anon_Userid = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Userid]
  }
}

