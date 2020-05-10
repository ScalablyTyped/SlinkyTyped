package typingsSlinky.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeletable extends js.Object {
  var callback: js.UndefOr[js.Function] = js.native
  var deletable: js.UndefOr[Boolean] = js.native
  var deleteLabel: js.UndefOr[String] = js.native
  var doneLabel: js.UndefOr[String] = js.native
  var editLabel: js.UndefOr[String] = js.native
  var movable: js.UndefOr[Boolean] = js.native
}

object AnonDeletable {
  @scala.inline
  def apply(): AnonDeletable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDeletable]
  }
  @scala.inline
  implicit class AnonDeletableOps[Self <: AnonDeletable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletable")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoneLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withEditLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(js.undefined)
        ret
    }
  }
  
}

