package typingsSlinky.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfNoneMatch extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.native
  var ifModifiedSince: js.UndefOr[String] = js.native
  var ifNoneMatch: js.UndefOr[String] = js.native
  var range: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
}

object IfNoneMatch {
  @scala.inline
  def apply(): IfNoneMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfNoneMatch]
  }
  @scala.inline
  implicit class IfNoneMatchOps[Self <: IfNoneMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withIfModifiedSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifModifiedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfModifiedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifModifiedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withIfNoneMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNoneMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfNoneMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNoneMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

