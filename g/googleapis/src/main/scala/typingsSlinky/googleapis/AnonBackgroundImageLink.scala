package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackgroundImageLink extends js.Object {
  var backgroundImageLink: js.UndefOr[String] = js.native
  var colorRgb: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
}

object AnonBackgroundImageLink {
  @scala.inline
  def apply(): AnonBackgroundImageLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBackgroundImageLink]
  }
  @scala.inline
  implicit class AnonBackgroundImageLinkOps[Self <: AnonBackgroundImageLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundImageLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageLink")(js.undefined)
        ret
    }
    @scala.inline
    def withColorRgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRgb")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

