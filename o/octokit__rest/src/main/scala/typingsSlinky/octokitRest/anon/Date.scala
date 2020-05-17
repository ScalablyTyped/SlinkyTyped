package typingsSlinky.octokitRest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  var date: String = js.native
  var etag: String = js.native
  var `last-modified`: String = js.native
  var link: String = js.native
  var status: String = js.native
  var `x-Octokit-media-type`: String = js.native
  var `x-Octokit-request-id`: String = js.native
  var `x-ratelimit-limit`: String = js.native
  var `x-ratelimit-remaining`: String = js.native
  var `x-ratelimit-reset`: String = js.native
}

object Date {
  @scala.inline
  def apply(
    date: String,
    etag: String,
    `last-modified`: String,
    link: String,
    status: String,
    `x-Octokit-media-type`: String,
    `x-Octokit-request-id`: String,
    `x-ratelimit-limit`: String,
    `x-ratelimit-remaining`: String,
    `x-ratelimit-reset`: String
  ): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("last-modified")(`last-modified`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-Octokit-media-type")(`x-Octokit-media-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-Octokit-request-id")(`x-Octokit-request-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-ratelimit-limit")(`x-ratelimit-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-ratelimit-remaining")(`x-ratelimit-remaining`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-ratelimit-reset")(`x-ratelimit-reset`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLast-modified`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last-modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-Octokit-media-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-Octokit-media-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-Octokit-request-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-Octokit-request-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-ratelimit-limit`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-ratelimit-limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-ratelimit-remaining`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-ratelimit-remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-ratelimit-reset`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-ratelimit-reset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

