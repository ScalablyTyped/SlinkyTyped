package typingsSlinky.pulumiAws.getBucketObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketObjectsArgs extends js.Object {
  /**
    * Lists object keys in this S3 bucket. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
    */
  val bucket: String = js.native
  /**
    * A character used to group keys (Default: none)
    */
  val delimiter: js.UndefOr[String] = js.native
  /**
    * Encodes keys using this method (Default: none; besides none, only "url" can be used)
    */
  val encodingType: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether to populate the owner list (Default: false)
    */
  val fetchOwner: js.UndefOr[Boolean] = js.native
  /**
    * Maximum object keys to return (Default: 1000)
    */
  val maxKeys: js.UndefOr[Double] = js.native
  /**
    * Limits results to object keys with this prefix (Default: none)
    */
  val prefix: js.UndefOr[String] = js.native
  /**
    * Returns key names lexicographically after a specific object key in your bucket (Default: none; S3 lists object keys in UTF-8 character encoding in lexicographical order)
    */
  val startAfter: js.UndefOr[String] = js.native
}

object GetBucketObjectsArgs {
  @scala.inline
  def apply(bucket: String): GetBucketObjectsArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketObjectsArgs]
  }
  @scala.inline
  implicit class GetBucketObjectsArgsOps[Self <: GetBucketObjectsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingType")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxKeys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
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
    @scala.inline
    def withStartAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAfter")(js.undefined)
        ret
    }
  }
  
}

