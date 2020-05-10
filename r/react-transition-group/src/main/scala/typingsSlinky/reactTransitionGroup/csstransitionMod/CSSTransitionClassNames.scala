package typingsSlinky.reactTransitionGroup.csstransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSTransitionClassNames extends js.Object {
  var appear: js.UndefOr[String] = js.native
  var appearActive: js.UndefOr[String] = js.native
  var appearDone: js.UndefOr[String] = js.native
  var enter: js.UndefOr[String] = js.native
  var enterActive: js.UndefOr[String] = js.native
  var enterDone: js.UndefOr[String] = js.native
  var exit: js.UndefOr[String] = js.native
  var exitActive: js.UndefOr[String] = js.native
  var exitDone: js.UndefOr[String] = js.native
}

object CSSTransitionClassNames {
  @scala.inline
  def apply(): CSSTransitionClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSTransitionClassNames]
  }
  @scala.inline
  implicit class CSSTransitionClassNamesOps[Self <: CSSTransitionClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appear")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearActive")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearDone")(js.undefined)
        ret
    }
    @scala.inline
    def withEnter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterActive")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDone")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
    @scala.inline
    def withExitActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitActive")(js.undefined)
        ret
    }
    @scala.inline
    def withExitDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitDone")(js.undefined)
        ret
    }
  }
  
}

