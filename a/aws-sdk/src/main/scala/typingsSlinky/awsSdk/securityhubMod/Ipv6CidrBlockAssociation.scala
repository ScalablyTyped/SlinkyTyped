package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ipv6CidrBlockAssociation extends StObject {
  
  /**
    * The association ID for the IPv6 CIDR block.
    */
  var AssociationId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the state of the CIDR block.
    */
  var CidrBlockState: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[NonEmptyString] = js.native
}
object Ipv6CidrBlockAssociation {
  
  @scala.inline
  def apply(): Ipv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6CidrBlockAssociation]
  }
  
  @scala.inline
  implicit class Ipv6CidrBlockAssociationMutableBuilder[Self <: Ipv6CidrBlockAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: NonEmptyString): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setCidrBlockState(value: NonEmptyString): Self = StObject.set(x, "CidrBlockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockStateUndefined: Self = StObject.set(x, "CidrBlockState", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: NonEmptyString): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
  }
}
