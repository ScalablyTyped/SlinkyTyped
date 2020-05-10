package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3CopyObjectOperation extends js.Object {
  /**
    * 
    */
  var AccessControlGrants: js.UndefOr[S3GrantList] = js.native
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.native
  /**
    * 
    */
  var MetadataDirective: js.UndefOr[S3MetadataDirective] = js.native
  /**
    * 
    */
  var ModifiedSinceConstraint: js.UndefOr[js.Date] = js.native
  /**
    * 
    */
  var NewObjectMetadata: js.UndefOr[S3ObjectMetadata] = js.native
  /**
    * 
    */
  var NewObjectTagging: js.UndefOr[S3TagSet] = js.native
  /**
    * 
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.native
  /**
    * 
    */
  var ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.native
  /**
    * 
    */
  var ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  /**
    * 
    */
  var RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String] = js.native
  /**
    * 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.native
  /**
    * 
    */
  var SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString] = js.native
  /**
    * 
    */
  var StorageClass: js.UndefOr[S3StorageClass] = js.native
  /**
    * 
    */
  var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var TargetResource: js.UndefOr[S3BucketArnString] = js.native
  /**
    * 
    */
  var UnModifiedSinceConstraint: js.UndefOr[js.Date] = js.native
}

object S3CopyObjectOperation {
  @scala.inline
  def apply(): S3CopyObjectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3CopyObjectOperation]
  }
  @scala.inline
  implicit class S3CopyObjectOperationOps[Self <: S3CopyObjectOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlGrants(value: S3GrantList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlGrants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlGrants")(js.undefined)
        ret
    }
    @scala.inline
    def withCannedAccessControlList(value: S3CannedAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CannedAccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCannedAccessControlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CannedAccessControlList")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataDirective(value: S3MetadataDirective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataDirective")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedSinceConstraint(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedSinceConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedSinceConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedSinceConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withNewObjectMetadata(value: S3ObjectMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewObjectMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewObjectMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewObjectMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNewObjectTagging(value: S3TagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewObjectTagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewObjectTagging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewObjectTagging")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLockLegalHoldStatus(value: S3ObjectLockLegalHoldStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockLegalHoldStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockLegalHoldStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockLegalHoldStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLockMode(value: S3ObjectLockMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockMode")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLockRetainUntilDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockRetainUntilDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockRetainUntilDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockRetainUntilDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectLocation(value: NonEmptyMaxLength2048String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterPays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterPays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPays")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEAwsKmsKeyId(value: KmsKeyArnString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEAwsKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEAwsKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEAwsKmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: S3StorageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetKeyPrefix(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetKeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetKeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetResource(value: S3BucketArnString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetResource")(js.undefined)
        ret
    }
    @scala.inline
    def withUnModifiedSinceConstraint(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnModifiedSinceConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnModifiedSinceConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnModifiedSinceConstraint")(js.undefined)
        ret
    }
  }
  
}

