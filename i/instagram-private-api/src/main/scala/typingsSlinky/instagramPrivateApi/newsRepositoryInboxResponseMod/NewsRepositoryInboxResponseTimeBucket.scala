package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponseTimeBucket extends js.Object {
  var headers: js.Array[String] = js.native
  var indices: js.Array[Double] = js.native
}

object NewsRepositoryInboxResponseTimeBucket {
  @scala.inline
  def apply(headers: js.Array[String], indices: js.Array[Double]): NewsRepositoryInboxResponseTimeBucket = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseTimeBucket]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponseTimeBucketOps[Self <: NewsRepositoryInboxResponseTimeBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

