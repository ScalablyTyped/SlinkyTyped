package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponsePartition extends js.Object {
  var time_bucket: NewsRepositoryInboxResponseTimeBucket = js.native
}

object NewsRepositoryInboxResponsePartition {
  @scala.inline
  def apply(time_bucket: NewsRepositoryInboxResponseTimeBucket): NewsRepositoryInboxResponsePartition = {
    val __obj = js.Dynamic.literal(time_bucket = time_bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponsePartition]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponsePartitionOps[Self <: NewsRepositoryInboxResponsePartition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTime_bucket(value: NewsRepositoryInboxResponseTimeBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_bucket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

