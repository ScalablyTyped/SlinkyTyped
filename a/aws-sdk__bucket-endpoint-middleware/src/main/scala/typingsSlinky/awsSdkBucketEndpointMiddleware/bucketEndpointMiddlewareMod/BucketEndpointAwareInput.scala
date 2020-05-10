package typingsSlinky.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketEndpointAwareInput extends js.Object {
  @JSName("$bucketEndpoint")
  var $bucketEndpoint: js.UndefOr[Boolean] = js.native
  @JSName("$forcePathStyle")
  var $forcePathStyle: js.UndefOr[Boolean] = js.native
  @JSName("$useAccelerateEndpoint")
  var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  @JSName("$useDualstackEndpoint")
  var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
  var Bucket: String = js.native
}

object BucketEndpointAwareInput {
  @scala.inline
  def apply(Bucket: String): BucketEndpointAwareInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketEndpointAwareInput]
  }
  @scala.inline
  implicit class BucketEndpointAwareInputOps[Self <: BucketEndpointAwareInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$bucketEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bucketEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bucketEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bucketEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$forcePathStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$forcePathStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$forcePathStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$forcePathStyle")(js.undefined)
        ret
    }
    @scala.inline
    def with$useAccelerateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useAccelerateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$useAccelerateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useAccelerateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$useDualstackEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useDualstackEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$useDualstackEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useDualstackEndpoint")(js.undefined)
        ret
    }
  }
  
}

