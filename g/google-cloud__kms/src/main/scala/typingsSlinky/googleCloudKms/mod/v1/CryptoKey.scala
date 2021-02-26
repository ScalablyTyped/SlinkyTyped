package typingsSlinky.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleProtobuf.timestampPbMod.Timestamp.AsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKey extends StObject {
  
  var createTime: AsObject = js.native
  
  var labels: StringDictionary[String] = js.native
  
  var name: String = js.native
  
  var nextRotationTime: js.UndefOr[AsObject] = js.native
  
  var primary: CryptoKeyVersion = js.native
  
  var purpose: CryptoKeyPurpose = js.native
  
  var versionTemplate: CryptoKeyVersionTemplate = js.native
}
object CryptoKey {
  
  @scala.inline
  def apply(
    createTime: AsObject,
    labels: StringDictionary[String],
    name: String,
    primary: CryptoKeyVersion,
    purpose: CryptoKeyPurpose,
    versionTemplate: CryptoKeyVersionTemplate
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], versionTemplate = versionTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  
  @scala.inline
  implicit class CryptoKeyMutableBuilder[Self <: CryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: AsObject): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRotationTime(value: AsObject): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    @scala.inline
    def setPrimary(value: CryptoKeyVersion): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurpose(value: CryptoKeyPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTemplate(value: CryptoKeyVersionTemplate): Self = StObject.set(x, "versionTemplate", value.asInstanceOf[js.Any])
  }
}
