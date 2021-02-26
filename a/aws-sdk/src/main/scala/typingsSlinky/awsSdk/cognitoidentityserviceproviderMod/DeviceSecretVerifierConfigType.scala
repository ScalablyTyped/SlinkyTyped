package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceSecretVerifierConfigType extends StObject {
  
  /**
    * The password verifier.
    */
  var PasswordVerifier: js.UndefOr[StringType] = js.native
  
  /**
    * The salt.
    */
  var Salt: js.UndefOr[StringType] = js.native
}
object DeviceSecretVerifierConfigType {
  
  @scala.inline
  def apply(): DeviceSecretVerifierConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSecretVerifierConfigType]
  }
  
  @scala.inline
  implicit class DeviceSecretVerifierConfigTypeMutableBuilder[Self <: DeviceSecretVerifierConfigType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswordVerifier(value: StringType): Self = StObject.set(x, "PasswordVerifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordVerifierUndefined: Self = StObject.set(x, "PasswordVerifier", js.undefined)
    
    @scala.inline
    def setSalt(value: StringType): Self = StObject.set(x, "Salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUndefined: Self = StObject.set(x, "Salt", js.undefined)
  }
}
