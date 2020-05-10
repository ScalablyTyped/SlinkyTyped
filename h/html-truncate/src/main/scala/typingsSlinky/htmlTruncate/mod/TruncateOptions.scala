package typingsSlinky.htmlTruncate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncateOptions extends js.Object {
  /**
    * Omission symbol for truncated string, '...' by default.
    */
  var ellipsis: Boolean | String = js.native
  /**
    * Flag to specify if keep image tag, false by default.
    */
  var keepImageTag: Boolean = js.native
}

object TruncateOptions {
  @scala.inline
  def apply(ellipsis: Boolean | String, keepImageTag: Boolean): TruncateOptions = {
    val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], keepImageTag = keepImageTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateOptions]
  }
  @scala.inline
  implicit class TruncateOptionsOps[Self <: TruncateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEllipsis(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepImageTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepImageTag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

