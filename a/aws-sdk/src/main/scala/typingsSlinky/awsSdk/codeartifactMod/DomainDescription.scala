package typingsSlinky.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDescription extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the domain. 
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    *  The total size of all assets in the domain. 
    */
  var assetSizeBytes: js.UndefOr[Long] = js.native
  
  /**
    *  A timestamp that represents the date and time the domain was created. 
    */
  var createdTime: js.UndefOr[js.Date] = js.native
  
  /**
    *  The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain. 
    */
  var encryptionKey: js.UndefOr[Arn] = js.native
  
  /**
    *  The name of the domain. 
    */
  var name: js.UndefOr[DomainName] = js.native
  
  /**
    *  The AWS account ID that owns the domain. 
    */
  var owner: js.UndefOr[AccountId] = js.native
  
  /**
    *  The number of repositories in the domain. 
    */
  var repositoryCount: js.UndefOr[Integer] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the domain.
    */
  var s3BucketArn: js.UndefOr[Arn] = js.native
  
  /**
    *  The current status of a domain. The valid values are     Active     Deleted   
    */
  var status: js.UndefOr[DomainStatus] = js.native
}
object DomainDescription {
  
  @scala.inline
  def apply(): DomainDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDescription]
  }
  
  @scala.inline
  implicit class DomainDescriptionMutableBuilder[Self <: DomainDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setAssetSizeBytes(value: Long): Self = StObject.set(x, "assetSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetSizeBytesUndefined: Self = StObject.set(x, "assetSizeBytes", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: Arn): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: AccountId): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRepositoryCount(value: Integer): Self = StObject.set(x, "repositoryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryCountUndefined: Self = StObject.set(x, "repositoryCount", js.undefined)
    
    @scala.inline
    def setS3BucketArn(value: Arn): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketArnUndefined: Self = StObject.set(x, "s3BucketArn", js.undefined)
    
    @scala.inline
    def setStatus(value: DomainStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
