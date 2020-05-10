package typingsSlinky.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropSequenceOptions extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.native
  var ifExists: js.UndefOr[Boolean] = js.native
  var restrict: js.UndefOr[Boolean] = js.native
}

object DropSequenceOptions {
  @scala.inline
  def apply(): DropSequenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropSequenceOptions]
  }
  @scala.inline
  implicit class DropSequenceOptionsOps[Self <: DropSequenceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCascade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.undefined)
        ret
    }
    @scala.inline
    def withIfExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifExists")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrict")(js.undefined)
        ret
    }
  }
  
}

