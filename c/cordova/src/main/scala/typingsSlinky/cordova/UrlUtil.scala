package typingsSlinky.cordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// cordova/urlutil module
@js.native
trait UrlUtil extends js.Object {
  def makeAbsolute(url: String): String = js.native
}

object UrlUtil {
  @scala.inline
  def apply(makeAbsolute: String => String): UrlUtil = {
    val __obj = js.Dynamic.literal(makeAbsolute = js.Any.fromFunction1(makeAbsolute))
    __obj.asInstanceOf[UrlUtil]
  }
  @scala.inline
  implicit class UrlUtilOps[Self <: UrlUtil] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMakeAbsolute(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeAbsolute")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

