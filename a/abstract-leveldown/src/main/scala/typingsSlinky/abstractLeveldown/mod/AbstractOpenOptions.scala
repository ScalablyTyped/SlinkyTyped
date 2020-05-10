package typingsSlinky.abstractLeveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractOpenOptions extends AbstractOptions {
  var createIfMissing: js.UndefOr[Boolean] = js.native
  var errorIfExists: js.UndefOr[Boolean] = js.native
}

object AbstractOpenOptions {
  @scala.inline
  def apply(): AbstractOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractOpenOptions]
  }
  @scala.inline
  implicit class AbstractOpenOptionsOps[Self <: AbstractOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateIfMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createIfMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateIfMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createIfMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorIfExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorIfExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorIfExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorIfExists")(js.undefined)
        ret
    }
  }
  
}

