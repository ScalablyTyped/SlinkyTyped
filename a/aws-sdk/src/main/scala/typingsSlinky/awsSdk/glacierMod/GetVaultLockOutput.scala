package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVaultLockOutput extends StObject {
  
  /**
    * The UTC date and time at which the vault lock was put into the InProgress state.
    */
  var CreationDate: js.UndefOr[String] = js.native
  
  /**
    * The UTC date and time at which the lock ID expires. This value can be null if the vault lock is in a Locked state.
    */
  var ExpirationDate: js.UndefOr[String] = js.native
  
  /**
    * The vault lock policy as a JSON string, which uses "\" as an escape character.
    */
  var Policy: js.UndefOr[String] = js.native
  
  /**
    * The state of the vault lock. InProgress or Locked.
    */
  var State: js.UndefOr[String] = js.native
}
object GetVaultLockOutput {
  
  @scala.inline
  def apply(): GetVaultLockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVaultLockOutput]
  }
  
  @scala.inline
  implicit class GetVaultLockOutputMutableBuilder[Self <: GetVaultLockOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
