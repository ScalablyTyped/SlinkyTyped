package typingsSlinky.pulumiAws.s3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.inputMod.datasync.S3LocationS3Config
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3LocationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: Input[ARN] = js.native
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: Input[S3LocationS3Config] = js.native
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: Input[String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object S3LocationArgs {
  @scala.inline
  def apply(s3BucketArn: Input[ARN], s3Config: Input[S3LocationS3Config], subdirectory: Input[String]): S3LocationArgs = {
    val __obj = js.Dynamic.literal(s3BucketArn = s3BucketArn.asInstanceOf[js.Any], s3Config = s3Config.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LocationArgs]
  }
  @scala.inline
  implicit class S3LocationArgsOps[Self <: S3LocationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3BucketArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Config(value: Input[S3LocationS3Config]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdirectory(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdirectory")(value.asInstanceOf[js.Any])
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
  }
  
}

