package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  /** Extensions and packaged applications a user has installed (be _really_ careful!). */
  var extension: js.UndefOr[Boolean] = js.native
  /** Websites that have been installed as hosted applications (be careful!). */
  var protectedWeb: js.UndefOr[Boolean] = js.native
  /** Normal websites. */
  var unprotectedWeb: js.UndefOr[Boolean] = js.native
}

object Extension {
  @scala.inline
  def apply(): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectedWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedWeb")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprotectedWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectedWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprotectedWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectedWeb")(js.undefined)
        ret
    }
  }
  
}

