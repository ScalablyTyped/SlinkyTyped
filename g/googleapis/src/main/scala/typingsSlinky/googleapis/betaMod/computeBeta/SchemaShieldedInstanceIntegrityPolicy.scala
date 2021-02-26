package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The policy describes the baseline against which Instance boot integrity is
  * measured.
  */
@js.native
trait SchemaShieldedInstanceIntegrityPolicy extends StObject {
  
  /**
    * Updates the integrity policy baseline using the measurements from the VM
    * instance&#39;s most recent boot.
    */
  var updateAutoLearnPolicy: js.UndefOr[Boolean] = js.native
}
object SchemaShieldedInstanceIntegrityPolicy {
  
  @scala.inline
  def apply(): SchemaShieldedInstanceIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIntegrityPolicy]
  }
  
  @scala.inline
  implicit class SchemaShieldedInstanceIntegrityPolicyMutableBuilder[Self <: SchemaShieldedInstanceIntegrityPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateAutoLearnPolicy(value: Boolean): Self = StObject.set(x, "updateAutoLearnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoLearnPolicyUndefined: Self = StObject.set(x, "updateAutoLearnPolicy", js.undefined)
  }
}
