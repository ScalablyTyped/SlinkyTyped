package typingsSlinky.feedparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var MAX_BUFFER_LENGTH: js.UndefOr[Double] = js.native
  var addmeta: js.UndefOr[Boolean] = js.native
  var feedurl: js.UndefOr[String] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var resume_saxerror: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAX_BUFFER_LENGTH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_BUFFER_LENGTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMAX_BUFFER_LENGTH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_BUFFER_LENGTH")(js.undefined)
        ret
    }
    @scala.inline
    def withAddmeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addmeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddmeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addmeta")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedurl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedurl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedurl")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withResume_saxerror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume_saxerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResume_saxerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume_saxerror")(js.undefined)
        ret
    }
  }
  
}

