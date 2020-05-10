package typingsSlinky.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowdifferentnesting extends js.Object {
  var allow_different_nesting: js.UndefOr[Boolean] = js.native
  var siblings_only: js.UndefOr[Boolean] = js.native
}

object AnonAllowdifferentnesting {
  @scala.inline
  def apply(): AnonAllowdifferentnesting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowdifferentnesting]
  }
  @scala.inline
  implicit class AnonAllowdifferentnestingOps[Self <: AnonAllowdifferentnesting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_different_nesting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_different_nesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_different_nesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_different_nesting")(js.undefined)
        ret
    }
    @scala.inline
    def withSiblings_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblings_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiblings_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblings_only")(js.undefined)
        ret
    }
  }
  
}

