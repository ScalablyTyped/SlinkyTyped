package typingsSlinky.reactWithStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStylesOptions extends js.Object {
  var flushBefore: js.UndefOr[Boolean] = js.native
  var pureComponent: js.UndefOr[Boolean] = js.native
}

object WithStylesOptions {
  @scala.inline
  def apply(): WithStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithStylesOptions]
  }
  @scala.inline
  implicit class WithStylesOptionsOps[Self <: WithStylesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlushBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPureComponent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPureComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureComponent")(js.undefined)
        ret
    }
  }
  
}

