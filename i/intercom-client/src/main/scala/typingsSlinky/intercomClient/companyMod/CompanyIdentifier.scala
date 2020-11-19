package typingsSlinky.intercomClient.companyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.anon.Id
  - typingsSlinky.intercomClient.anon.Companyid
*/
trait CompanyIdentifier extends js.Object
object CompanyIdentifier {
  
  @scala.inline
  def Id(id: String): CompanyIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompanyIdentifier]
  }
  
  @scala.inline
  def Companyid(company_id: String): CompanyIdentifier = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompanyIdentifier]
  }
}
