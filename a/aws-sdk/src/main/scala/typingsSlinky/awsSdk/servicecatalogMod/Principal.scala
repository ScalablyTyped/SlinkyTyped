package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Principal extends StObject {
  
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PrincipalARN] = js.native
  
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PrincipalType] = js.native
}
object Principal {
  
  @scala.inline
  def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  @scala.inline
  implicit class PrincipalMutableBuilder[Self <: Principal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrincipalARN(value: PrincipalARN): Self = StObject.set(x, "PrincipalARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalARNUndefined: Self = StObject.set(x, "PrincipalARN", js.undefined)
    
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
  }
}
