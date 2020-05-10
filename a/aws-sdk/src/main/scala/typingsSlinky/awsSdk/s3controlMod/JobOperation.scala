package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOperation extends js.Object {
  /**
    * Directs the specified job to invoke an AWS Lambda function on each object in the manifest.
    */
  var LambdaInvoke: js.UndefOr[LambdaInvokeOperation] = js.native
  /**
    * Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.
    */
  var S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation] = js.native
  /**
    * Directs the specified job to execute a PUT Object acl call on each object in the manifest.
    */
  var S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation] = js.native
  /**
    * Directs the specified job to execute a PUT Copy object call on each object in the manifest.
    */
  var S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation] = js.native
  /**
    * Directs the specified job to execute a PUT Object tagging call on each object in the manifest.
    */
  var S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation] = js.native
}

object JobOperation {
  @scala.inline
  def apply(): JobOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOperation]
  }
  @scala.inline
  implicit class JobOperationOps[Self <: JobOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambdaInvoke(value: LambdaInvokeOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaInvoke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaInvoke")(js.undefined)
        ret
    }
    @scala.inline
    def withS3InitiateRestoreObject(value: S3InitiateRestoreObjectOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3InitiateRestoreObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3InitiateRestoreObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3InitiateRestoreObject")(js.undefined)
        ret
    }
    @scala.inline
    def withS3PutObjectAcl(value: S3SetObjectAclOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3PutObjectAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3PutObjectAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3PutObjectAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withS3PutObjectCopy(value: S3CopyObjectOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3PutObjectCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3PutObjectCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3PutObjectCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withS3PutObjectTagging(value: S3SetObjectTaggingOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3PutObjectTagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3PutObjectTagging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3PutObjectTagging")(js.undefined)
        ret
    }
  }
  
}

