package typingsSlinky.reactour.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactourStep extends js.Object {
  /**
    * Action that can be executed on target element of the step
    */
  var action: js.UndefOr[js.Function1[/* domNode */ js.Any, Unit]] = js.native
  /**
    * Content of the step
    */
  var content: TagMod[Any] | (js.Function1[/* args */ ReactourStepContentArgs, TagMod[Any]]) = js.native
  /**
    * Position of step content
    */
  var position: js.UndefOr[ReactourStepPosition | (js.Tuple2[Double, Double])] = js.native
  /**
    * DOM selector to find the target element
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * Disable interaction for this specific step.
    * Could be enabled passing `true`
    * when `disableInteraction` prop is present in Tour
    */
  var stepInteraction: js.UndefOr[Boolean] = js.native
  /**
    * Additional styles
    */
  var style: js.UndefOr[CSSProperties] = js.native
}

object ReactourStep {
  @scala.inline
  def apply(): ReactourStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactourStep]
  }
  @scala.inline
  implicit class ReactourStepOps[Self <: ReactourStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: /* domNode */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentFunction1(value: /* args */ ReactourStepContentArgs => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContent(value: TagMod[Any] | (js.Function1[/* args */ ReactourStepContentArgs, TagMod[Any]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ReactourStepPosition | (js.Tuple2[Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withStepInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

