package typingsSlinky.pulumiAws.s3BucketAssociationMod

import typingsSlinky.pulumiAws.inputMod.macie.S3BucketAssociationClassificationType
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BucketAssociationState extends js.Object {
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie.
    */
  val bucketName: js.UndefOr[Input[String]] = js.native
  /**
    * The configuration of how Amazon Macie classifies the S3 objects.
    */
  val classificationType: js.UndefOr[Input[S3BucketAssociationClassificationType]] = js.native
  /**
    * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `memberAccountId` isn't specified, the action associates specified S3 resources with Macie for the current master account.
    */
  val memberAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * Object key prefix identifying one or more S3 objects to which the association applies.
    */
  val prefix: js.UndefOr[Input[String]] = js.native
}

object S3BucketAssociationState {
  @scala.inline
  def apply(): S3BucketAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketAssociationState]
  }
  @scala.inline
  implicit class S3BucketAssociationStateOps[Self <: S3BucketAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withClassificationType(value: Input[S3BucketAssociationClassificationType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationType")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

