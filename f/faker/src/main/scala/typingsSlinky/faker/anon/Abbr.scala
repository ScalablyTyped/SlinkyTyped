package typingsSlinky.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abbr extends js.Object {
  var abbr: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[Boolean] = js.native
}

object Abbr {
  @scala.inline
  def apply(): Abbr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abbr]
  }
  @scala.inline
  implicit class AbbrOps[Self <: Abbr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbbr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbr")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
  }
  
}

