package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactStore extends StObject {
  
  /**
    * The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If this is undefined, the default key for Amazon S3 is used.
    */
  var encryptionKey: js.UndefOr[EncryptionKey] = js.native
  
  /**
    * The S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3 bucket but not a folder in the bucket. A folder to contain the pipeline artifacts is created for you based on the name of the pipeline. You can use any S3 bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
    */
  var location: ArtifactStoreLocation = js.native
  
  /**
    * The type of the artifact store, such as S3.
    */
  var `type`: ArtifactStoreType = js.native
}
object ArtifactStore {
  
  @scala.inline
  def apply(location: ArtifactStoreLocation, `type`: ArtifactStoreType): ArtifactStore = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactStore]
  }
  
  @scala.inline
  implicit class ArtifactStoreMutableBuilder[Self <: ArtifactStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionKey(value: EncryptionKey): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setLocation(value: ArtifactStoreLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArtifactStoreType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
