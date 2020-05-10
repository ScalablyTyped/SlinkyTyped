package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostBucketsPayload extends js.Object {
  var allow: js.UndefOr[js.Array[PostBucketsPayloadAllow]] = js.native
  var bucketKey: String = js.native
  var policyKey: String = js.native
}

object PostBucketsPayload {
  @scala.inline
  def apply(bucketKey: String, policyKey: String): PostBucketsPayload = {
    val __obj = js.Dynamic.literal(bucketKey = bucketKey.asInstanceOf[js.Any], policyKey = policyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsPayload]
  }
  @scala.inline
  implicit class PostBucketsPayloadOps[Self <: PostBucketsPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow(value: js.Array[PostBucketsPayloadAllow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(js.undefined)
        ret
    }
  }
  
}

