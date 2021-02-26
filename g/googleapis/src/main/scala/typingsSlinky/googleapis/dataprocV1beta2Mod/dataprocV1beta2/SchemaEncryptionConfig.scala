package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encryption settings for the cluster.
  */
@js.native
trait SchemaEncryptionConfig extends StObject {
  
  /**
    * Optional. The Cloud KMS key name to use for PD disk encryption for all
    * instances in the cluster.
    */
  var gcePdKmsKeyName: js.UndefOr[String] = js.native
}
object SchemaEncryptionConfig {
  
  @scala.inline
  def apply(): SchemaEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionConfig]
  }
  
  @scala.inline
  implicit class SchemaEncryptionConfigMutableBuilder[Self <: SchemaEncryptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcePdKmsKeyName(value: String): Self = StObject.set(x, "gcePdKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcePdKmsKeyNameUndefined: Self = StObject.set(x, "gcePdKmsKeyName", js.undefined)
  }
}
