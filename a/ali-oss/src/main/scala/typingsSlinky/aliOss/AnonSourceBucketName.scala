package typingsSlinky.aliOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSourceBucketName extends js.Object {
  var sourceBucketName: String = js.native
  var sourceKey: String = js.native
}

object AnonSourceBucketName {
  @scala.inline
  def apply(sourceBucketName: String, sourceKey: String): AnonSourceBucketName = {
    val __obj = js.Dynamic.literal(sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceBucketName]
  }
  @scala.inline
  implicit class AnonSourceBucketNameOps[Self <: AnonSourceBucketName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

