package typingsSlinky.mmdbLib.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mmdbLib.responseMod.CountryResponse
  - typingsSlinky.mmdbLib.responseMod.CityResponse
  - typingsSlinky.mmdbLib.responseMod.AnonymousIPResponse
  - typingsSlinky.mmdbLib.responseMod.AsnResponse
  - typingsSlinky.mmdbLib.responseMod.ConnectionTypeResponse
  - typingsSlinky.mmdbLib.responseMod.DomainResponse
  - typingsSlinky.mmdbLib.responseMod.IspResponse
*/
trait Response extends js.Object
object Response {
  
  @scala.inline
  def AsnResponse(autonomous_system_number: Double, autonomous_system_organization: String): Response = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  def ConnectionTypeResponse(connection_type: String): Response = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  def CityResponse(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  def AnonymousIPResponse(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  def IspResponse(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String
  ): Response = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  def CountryResponse(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  def DomainResponse(domain: String): Response = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}
