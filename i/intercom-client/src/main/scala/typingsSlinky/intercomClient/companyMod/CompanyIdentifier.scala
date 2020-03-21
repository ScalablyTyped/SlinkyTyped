package typingsSlinky.intercomClient.companyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.AnonId
  - typingsSlinky.intercomClient.AnonCompanyid
*/
trait CompanyIdentifier extends js.Object

object CompanyIdentifier {
  @scala.inline
  def AnonId(id: String): CompanyIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompanyIdentifier]
  }
  @scala.inline
  def AnonCompanyid(company_id: String): CompanyIdentifier = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompanyIdentifier]
  }
}

