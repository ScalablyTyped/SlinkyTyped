package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Object extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the bucket that contains the object.
    */
  var bucketArn: js.UndefOr[string] = js.native
  
  /**
    * The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten or changed after Amazon Macie produced the finding, this value might be different from the current ETag for the object.
    */
  var eTag: js.UndefOr[string] = js.native
  
  /**
    * The file name extension of the object. If the object doesn't have a file name extension, this value is "".
    */
  var extension: js.UndefOr[string] = js.native
  
  /**
    * The full key (name) that's assigned to the object.
    */
  var key: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
    */
  var lastModified: js.UndefOr[js.Date] = js.native
  
  /**
    * The path to the object, including the full key (name).
    */
  var path: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the object is publicly accessible due to the combination of permissions settings that apply to the object.
    */
  var publicAccess: js.UndefOr[boolean] = js.native
  
  /**
    * The type of server-side encryption that's used for the object.
    */
  var serverSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  
  /**
    * The total storage size, in bytes, of the object.
    */
  var size: js.UndefOr[long] = js.native
  
  /**
    * The storage class of the object.
    */
  var storageClass: js.UndefOr[StorageClass] = js.native
  
  /**
    * The tags that are associated with the object.
    */
  var tags: js.UndefOr[KeyValuePairList] = js.native
  
  /**
    * The identifier for the affected version of the object.
    */
  var versionId: js.UndefOr[string] = js.native
}
object S3Object {
  
  @scala.inline
  def apply(): S3Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Object]
  }
  
  @scala.inline
  implicit class S3ObjectMutableBuilder[Self <: S3Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketArn(value: string): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketArnUndefined: Self = StObject.set(x, "bucketArn", js.undefined)
    
    @scala.inline
    def setETag(value: string): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    @scala.inline
    def setExtension(value: string): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setKey(value: string): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setPath(value: string): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPublicAccess(value: boolean): Self = StObject.set(x, "publicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessUndefined: Self = StObject.set(x, "publicAccess", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
    
    @scala.inline
    def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    @scala.inline
    def setTags(value: KeyValuePairList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: KeyValuePair*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVersionId(value: string): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
