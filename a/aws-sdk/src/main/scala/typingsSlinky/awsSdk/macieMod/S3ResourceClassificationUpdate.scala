package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ResourceClassificationUpdate extends js.Object {
  /**
    * The name of the S3 bucket whose classification types you want to update.
    */
  var bucketName: BucketName = js.native
  /**
    * The classification type that you want to update for the resource associated with Amazon Macie. 
    */
  var classificationTypeUpdate: ClassificationTypeUpdate = js.native
  /**
    * The prefix of the S3 bucket whose classification types you want to update.
    */
  var prefix: js.UndefOr[Prefix] = js.native
}

object S3ResourceClassificationUpdate {
  @scala.inline
  def apply(bucketName: BucketName, classificationTypeUpdate: ClassificationTypeUpdate): S3ResourceClassificationUpdate = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], classificationTypeUpdate = classificationTypeUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResourceClassificationUpdate]
  }
  @scala.inline
  implicit class S3ResourceClassificationUpdateOps[Self <: S3ResourceClassificationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassificationTypeUpdate(value: ClassificationTypeUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationTypeUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: Prefix): Self = {
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

