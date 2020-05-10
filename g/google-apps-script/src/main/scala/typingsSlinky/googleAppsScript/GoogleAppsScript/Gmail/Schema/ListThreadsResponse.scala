package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThreadsResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var resultSizeEstimate: js.UndefOr[Double] = js.native
  var threads: js.UndefOr[js.Array[Thread]] = js.native
}

object ListThreadsResponse {
  @scala.inline
  def apply(): ListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThreadsResponse]
  }
  @scala.inline
  implicit class ListThreadsResponseOps[Self <: ListThreadsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSizeEstimate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSizeEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSizeEstimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSizeEstimate")(js.undefined)
        ret
    }
    @scala.inline
    def withThreads(value: js.Array[Thread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(js.undefined)
        ret
    }
  }
  
}

