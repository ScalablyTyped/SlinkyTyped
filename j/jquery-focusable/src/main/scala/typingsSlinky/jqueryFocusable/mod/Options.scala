package typingsSlinky.jqueryFocusable.mod

import typingsSlinky.jqueryFocusable.jqueryFocusableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  findNegativeTabindex  :boolean,   findPositiveTabindex  :true}> */
@js.native
trait Options extends js.Object {
  var findNegativeTabindex: js.UndefOr[Boolean] = js.native
  var findPositiveTabindex: js.UndefOr[`true`] = js.native
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
    def withFindNegativeTabindex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNegativeTabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindNegativeTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNegativeTabindex")(js.undefined)
        ret
    }
    @scala.inline
    def withFindPositiveTabindex(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPositiveTabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindPositiveTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPositiveTabindex")(js.undefined)
        ret
    }
  }
  
}

