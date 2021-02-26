package typingsSlinky.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
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
trait Response extends StObject
object Response {
  
  @scala.inline
  def AnonymousIPResponse(): typingsSlinky.mmdbLib.responseMod.AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.mmdbLib.responseMod.AnonymousIPResponse]
  }
  
  @scala.inline
  def AsnResponse(autonomous_system_number: Double, autonomous_system_organization: String): typingsSlinky.mmdbLib.responseMod.AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mmdbLib.responseMod.AsnResponse]
  }
  
  @scala.inline
  def CityResponse(): typingsSlinky.mmdbLib.responseMod.CityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.mmdbLib.responseMod.CityResponse]
  }
  
  @scala.inline
  def ConnectionTypeResponse(connection_type: String): typingsSlinky.mmdbLib.responseMod.ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mmdbLib.responseMod.ConnectionTypeResponse]
  }
  
  @scala.inline
  def CountryResponse(): typingsSlinky.mmdbLib.responseMod.CountryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.mmdbLib.responseMod.CountryResponse]
  }
  
  @scala.inline
  def DomainResponse(domain: String): typingsSlinky.mmdbLib.responseMod.DomainResponse = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mmdbLib.responseMod.DomainResponse]
  }
  
  @scala.inline
  def IspResponse(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String
  ): typingsSlinky.mmdbLib.responseMod.IspResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mmdbLib.responseMod.IspResponse]
  }
}
