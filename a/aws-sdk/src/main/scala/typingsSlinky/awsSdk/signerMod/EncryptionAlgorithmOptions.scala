package typingsSlinky.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionAlgorithmOptions extends StObject {
  
  /**
    * The set of accepted encryption algorithms that are allowed in a code signing job.
    */
  var allowedValues: EncryptionAlgorithms = js.native
  
  /**
    * The default encryption algorithm that is used by a code signing job.
    */
  var defaultValue: EncryptionAlgorithm = js.native
}
object EncryptionAlgorithmOptions {
  
  @scala.inline
  def apply(allowedValues: EncryptionAlgorithms, defaultValue: EncryptionAlgorithm): EncryptionAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAlgorithmOptions]
  }
  
  @scala.inline
  implicit class EncryptionAlgorithmOptionsMutableBuilder[Self <: EncryptionAlgorithmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: EncryptionAlgorithms): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesVarargs(value: EncryptionAlgorithm*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: EncryptionAlgorithm): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
