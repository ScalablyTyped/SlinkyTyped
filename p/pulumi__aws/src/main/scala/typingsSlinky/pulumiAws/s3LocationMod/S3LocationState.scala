package typingsSlinky.pulumiAws.s3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.inputMod.datasync.S3LocationS3Config
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3LocationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: js.UndefOr[Input[S3LocationS3Config]] = js.native
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  val uri: js.UndefOr[Input[String]] = js.native
}

object S3LocationState {
  @scala.inline
  def apply(): S3LocationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3LocationState]
  }
  @scala.inline
  implicit class S3LocationStateOps[Self <: S3LocationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketArn")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Config(value: Input[S3LocationS3Config]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Config: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Config")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdirectory(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

