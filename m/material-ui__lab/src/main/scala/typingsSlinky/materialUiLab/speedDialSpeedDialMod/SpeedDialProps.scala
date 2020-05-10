package typingsSlinky.materialUiLab.speedDialSpeedDialMod

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.materialUiCore.AnonClassName
import typingsSlinky.materialUiCore.withStylesMod.StyledComponentProps
import typingsSlinky.materialUiLab.PartialFabProps
import typingsSlinky.materialUiLab.materialUiLabStrings.down
import typingsSlinky.materialUiLab.materialUiLabStrings.left
import typingsSlinky.materialUiLab.materialUiLabStrings.right
import typingsSlinky.materialUiLab.materialUiLabStrings.up
import typingsSlinky.reactTransitionGroup.AnonAppear
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, 'classes' | 'children'>> : never */ @js.native
trait SpeedDialProps
  extends StyledComponentProps[SpeedDialClassKey]
     with AnonClassName {
  /**
    * Props applied to the [`Fab`](/api/fab/) element.
    */
  var FabProps: js.UndefOr[PartialFabProps] = js.native
  /**
    * The component used for the transition.
    * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
    */
  var TransitionComponent: js.UndefOr[ReactComponentClass[TransitionProps]] = js.native
  /**
    * Props applied to the [`Transition`](http://reactcommunity.org/react-transition-group/transition#Transition-props) element.
    */
  var TransitionProps: js.UndefOr[typingsSlinky.reactTransitionGroup.transitionMod.TransitionProps] = js.native
  /**
    * The aria-label of the button element.
    * Also used to provide the `id` for the `SpeedDial` element and its children.
    */
  var ariaLabel: String = js.native
  /**
    * SpeedDialActions to display when the SpeedDial is `open`.
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * The direction the actions open relative to the floating action button.
    */
  var direction: js.UndefOr[up | down | left | right] = js.native
  /**
    * If `true`, the SpeedDial will be hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The icon to display in the SpeedDial Fab. The `SpeedDialIcon` component
    * provides a default Icon with animation.
    */
  var icon: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Callback fired when the component requests to be closed.
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be: `"toggle"`, `"blur"`, `"mouseLeave"`, `"escapeKeyDown"`.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event_, js.Object], /* reason */ CloseReason, Unit]
  ] = js.native
  /**
    * Callback fired when the component requests to be open.
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be: `"toggle"`, `"focus"`, `"mouseEnter"`.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event_, js.Object], /* reason */ OpenReason, Unit]
  ] = js.native
  /**
    * If `true`, the SpeedDial is open.
    */
  var open: Boolean = js.native
  /**
    * The icon to display in the SpeedDial Fab when the SpeedDial is open.
    */
  var openIcon: js.UndefOr[TagMod[Any]] = js.native
  /**
    * The duration for the transition, in milliseconds.
    * You may specify a single timeout for all transitions, or individually with an object.
    */
  var transitionDuration: js.UndefOr[Double | AnonAppear] = js.native
}

object SpeedDialProps {
  @scala.inline
  def apply(ariaLabel: String, open: Boolean): SpeedDialProps = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedDialProps]
  }
  @scala.inline
  implicit class SpeedDialPropsOps[Self <: SpeedDialProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFabProps(value: PartialFabProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FabProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFabProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FabProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionComponentFunctionComponent(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionComponentComponentClass(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionComponent(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionProps(value: TransitionProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionProps")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
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
    def withDirection(value: up | down | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: (/* event */ SyntheticEvent[Event_, js.Object], /* reason */ CloseReason) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: (/* event */ SyntheticEvent[Event_, js.Object], /* reason */ OpenReason) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double | AnonAppear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
  }
  
}

