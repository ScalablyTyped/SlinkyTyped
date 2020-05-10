package typingsSlinky.reduxLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorsObject extends js.Object {
  var action: js.UndefOr[Boolean | ActionToString] = js.native
  var error: js.UndefOr[Boolean | ErrorToString] = js.native
  var nextState: js.UndefOr[Boolean | StateToString] = js.native
  var prevState: js.UndefOr[Boolean | StateToString] = js.native
  var title: js.UndefOr[Boolean | ActionToString] = js.native
}

object ColorsObject {
  @scala.inline
  def apply(): ColorsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorsObject]
  }
  @scala.inline
  implicit class ColorsObjectOps[Self <: ColorsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionFunction1(value: /* action */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAction(value: Boolean | ActionToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorFunction2(value: (/* error */ js.Any, /* prevState */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withError(value: Boolean | ErrorToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withNextStateFunction1(value: /* state */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNextState(value: Boolean | StateToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextState")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevStateFunction1(value: /* state */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrevState(value: Boolean | StateToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevState")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFunction1(value: /* action */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitle(value: Boolean | ActionToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

