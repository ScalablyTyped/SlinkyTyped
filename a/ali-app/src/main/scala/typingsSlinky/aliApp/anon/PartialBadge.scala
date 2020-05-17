package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.aliAppStrings.more
import typingsSlinky.aliApp.aliAppStrings.none
import typingsSlinky.aliApp.aliAppStrings.num
import typingsSlinky.aliApp.aliAppStrings.point
import typingsSlinky.aliApp.aliAppStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.Badge> */
@js.native
trait PartialBadge extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var text: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[none | point | num | text | more | String] = js.native
}

object PartialBadge {
  @scala.inline
  def apply(): PartialBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBadge]
  }
  @scala.inline
  implicit class PartialBadgeOps[Self <: PartialBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: none | point | num | text | more | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

