package typingsSlinky.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfModifiedSince extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.native
  var ifModifiedSince: js.UndefOr[js.Date] = js.native
  var ifNoneMatch: js.UndefOr[String] = js.native
  var range: js.UndefOr[String] = js.native
}

object IfModifiedSince {
  @scala.inline
  def apply(): IfModifiedSince = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfModifiedSince]
  }
  @scala.inline
  implicit class IfModifiedSinceOps[Self <: IfModifiedSince] (val x: Self) extends AnyVal {
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
    def withIfModifiedSince(value: js.Date): Self = {
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
  }
  
}

