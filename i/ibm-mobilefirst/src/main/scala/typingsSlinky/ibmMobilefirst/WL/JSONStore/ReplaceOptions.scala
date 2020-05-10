package typingsSlinky.ibmMobilefirst.WL.JSONStore

import typingsSlinky.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceOptions extends Options {
  var markDirty: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated
    */
  var push: js.UndefOr[Boolean] = js.native
}

object ReplaceOptions {
  @scala.inline
  def apply(): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOptions]
  }
  @scala.inline
  implicit class ReplaceOptionsOps[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
  }
  
}

