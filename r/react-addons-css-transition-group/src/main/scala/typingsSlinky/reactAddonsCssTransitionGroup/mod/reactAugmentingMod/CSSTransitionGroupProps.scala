package typingsSlinky.reactAddonsCssTransitionGroup.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLTransitionGroupProps<ReactCSSTransitionGroup> * / any */ @js.native
trait CSSTransitionGroupProps extends js.Object {
  var transitionAppear: js.UndefOr[Boolean] = js.native
  var transitionAppearTimeout: js.UndefOr[Double] = js.native
  var transitionEnter: js.UndefOr[Boolean] = js.native
  var transitionEnterTimeout: js.UndefOr[Double] = js.native
  var transitionLeave: js.UndefOr[Boolean] = js.native
  var transitionLeaveTimeout: js.UndefOr[Double] = js.native
  var transitionName: String | CSSTransitionGroupTransitionName = js.native
}

object CSSTransitionGroupProps {
  @scala.inline
  def apply(transitionName: String | CSSTransitionGroupTransitionName): CSSTransitionGroupProps = {
    val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionGroupProps]
  }
  @scala.inline
  implicit class CSSTransitionGroupPropsOps[Self <: CSSTransitionGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitionName(value: String | CSSTransitionGroupTransitionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionAppear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionAppear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppear")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionAppearTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppearTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionAppearTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppearTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEnterTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEnterTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionLeave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionLeaveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionLeaveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionLeaveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionLeaveTimeout")(js.undefined)
        ret
    }
  }
  
}

