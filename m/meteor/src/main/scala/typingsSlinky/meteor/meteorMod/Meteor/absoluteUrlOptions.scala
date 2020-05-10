package typingsSlinky.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait absoluteUrlOptions extends js.Object {
  var replaceLocalhost: js.UndefOr[Boolean] = js.native
  var rootUrl: js.UndefOr[String] = js.native
  var secure: js.UndefOr[Boolean] = js.native
}

object absoluteUrlOptions {
  @scala.inline
  def apply(): absoluteUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[absoluteUrlOptions]
  }
  @scala.inline
  implicit class absoluteUrlOptionsOps[Self <: absoluteUrlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplaceLocalhost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceLocalhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceLocalhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceLocalhost")(js.undefined)
        ret
    }
    @scala.inline
    def withRootUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
  }
  
}

