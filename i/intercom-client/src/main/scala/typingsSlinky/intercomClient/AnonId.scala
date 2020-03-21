package typingsSlinky.intercomClient

import typingsSlinky.intercomClient.companyMod.CompanyIdentifier
import typingsSlinky.intercomClient.leadMod.LeadIdentifier
import typingsSlinky.intercomClient.userMod.UserIdentifier
import typingsSlinky.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId
  extends CompanyIdentifier
     with LeadIdentifier
     with UserIdentifier
     with VisitorIdentifier {
  var id: String
}

object AnonId {
  @scala.inline
  def apply(id: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

