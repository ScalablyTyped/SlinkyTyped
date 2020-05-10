package typingsSlinky.relaxedJson

import typingsSlinky.relaxedJson.mod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDuplicate extends js.Object {
  var duplicate: js.UndefOr[Boolean] = js.native
  var relaxed: js.UndefOr[Boolean] = js.native
  var reviver: js.UndefOr[Reviver] = js.native
  var tolerant: js.UndefOr[Boolean] = js.native
  var warnings: js.UndefOr[Boolean] = js.native
}

object AnonDuplicate {
  @scala.inline
  def apply(): AnonDuplicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDuplicate]
  }
  @scala.inline
  implicit class AnonDuplicateOps[Self <: AnonDuplicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuplicate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate")(js.undefined)
        ret
    }
    @scala.inline
    def withRelaxed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelaxed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxed")(js.undefined)
        ret
    }
    @scala.inline
    def withReviver(value: Reviver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerant")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

