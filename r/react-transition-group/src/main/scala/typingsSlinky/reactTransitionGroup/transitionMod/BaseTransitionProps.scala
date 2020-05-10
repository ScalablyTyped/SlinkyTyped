package typingsSlinky.reactTransitionGroup.transitionMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTransitionProps
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * A function child can be used instead of a React element. This function is
    * called with the current transition status ('entering', 'entered',
    * 'exiting',  'exited', 'unmounted'), which can be used to apply context
    * specific props to a component.
    * ```jsx
    *    <Transition in={this.state.in} timeout={150}>
    *        {state => (
    *            <MyComponent className={`fade fade-${state}`} />
    *        )}
    *    </Transition>
    * ```
    */
  var children: js.UndefOr[TransitionChildren] = js.native
  /**
    * Show the component; triggers the enter or exit states
    */
  var in: js.UndefOr[Boolean] = js.native
  /**
    * By default the child component is mounted immediately along with the
    * parent Transition component. If you want to "lazy mount" the component on
    * the first `in={true}` you can set `mountOnEnter`. After the first enter
    * transition the component will stay mounted, even on "exited", unless you
    * also specify `unmountOnExit`.
    */
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  /**
    * Callback fired before the "entering" status is applied. An extra
    * parameter `isAppearing` is supplied to indicate if the enter stage is
    * occurring on the initial mount
    */
  var onEnter: js.UndefOr[EnterHandler] = js.native
  /**
    * Callback fired after the "entered" status is applied. An extra parameter
    * isAppearing is supplied to indicate if the enter stage is occurring on
    * the initial mount
    */
  var onEntered: js.UndefOr[EnterHandler] = js.native
  /**
    * Callback fired after the "entering" status is applied. An extra parameter
    * isAppearing is supplied to indicate if the enter stage is occurring on
    * the initial mount
    */
  var onEntering: js.UndefOr[EnterHandler] = js.native
  /**
    * Callback fired before the "exiting" status is applied.
    */
  var onExit: js.UndefOr[ExitHandler] = js.native
  /**
    * Callback fired after the "exited" status is applied.
    */
  var onExited: js.UndefOr[ExitHandler] = js.native
  /**
    * Callback fired after the "exiting" status is applied.
    */
  var onExiting: js.UndefOr[ExitHandler] = js.native
  /**
    * By default the child component stays mounted after it reaches the
    * 'exited' state. Set `unmountOnExit` if you'd prefer to unmount the
    * component after it finishes exiting.
    */
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}

object BaseTransitionProps {
  @scala.inline
  def apply(): BaseTransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTransitionProps]
  }
  @scala.inline
  implicit class BaseTransitionPropsOps[Self <: BaseTransitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* status */ TransitionStatus => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: TransitionChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withMountOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntered(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEntered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntering(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEntering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExited(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExiting(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmountOnExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(js.undefined)
        ret
    }
  }
  
}

