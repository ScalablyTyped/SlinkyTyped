package typingsSlinky.atMaterialDashUiLab.speedDialSpeedDialMod

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.ClassNameMap
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.StyledComponentProps
import typingsSlinky.atMaterialDashUiLab.PartialFabProps
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.down
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.left
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.right
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.up
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashTransitionDashGroup.Anon_Appear
import typingsSlinky.reactDashTransitionDashGroup.transitionMod.TransitionProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, 'classes' | 'children'>> : never */ trait SpeedDialProps
  extends StyledComponentProps[SpeedDialClassKey]
     with typingsSlinky.atMaterialDashUiCore.Anon_ClassName {
  /**
    * Props applied to the [`Fab`](/api/fab/) element.
    */
  var FabProps: js.UndefOr[PartialFabProps] = js.undefined
  /**
    * The component used for the transition.
    */
  var TransitionComponent: js.UndefOr[ReactComponentClass[TransitionProps]] = js.undefined
  /**
    * Props applied to the `Transition` element.
    */
  var TransitionProps: js.UndefOr[typingsSlinky.reactDashTransitionDashGroup.transitionMod.TransitionProps] = js.undefined
  /**
    * The aria-label of the button element.
    * Also used to provide the `id` for the `SpeedDial` element and its children.
    */
  var ariaLabel: String
  /**
    * SpeedDialActions to display when the SpeedDial is `open`.
    */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /**
    * The direction the actions open relative to the floating action button.
    */
  var direction: js.UndefOr[up | down | left | right] = js.undefined
  /**
    * If `true`, the SpeedDial will be hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * The icon to display in the SpeedDial Fab. The `SpeedDialIcon` component
    * provides a default Icon with animation.
    */
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  /**
    * Callback fired when the component requests to be closed.
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be:`"toggle"`, `"blur"`, `"mouseLeave"`, `"escapeKeyDown"`.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event, js.Object], /* reason */ CloseReason, Unit]
  ] = js.undefined
  /**
    * Callback fired when the component requests to be open.
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be:`"toggle"`, `"focus"`, `"mouseEnter"`.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event, js.Object], /* reason */ OpenReason, Unit]
  ] = js.undefined
  /**
    * If `true`, the SpeedDial is open.
    */
  var open: Boolean
  /**
    * The icon to display in the SpeedDial Fab when the SpeedDial is open.
    */
  var openIcon: js.UndefOr[TagMod[Any]] = js.undefined
  /**
    * The duration for the transition, in milliseconds.
    * You may specify a single timeout for all transitions, or individually with an object.
    */
  var transitionDuration: js.UndefOr[Double | Anon_Appear] = js.undefined
}

object SpeedDialProps {
  @scala.inline
  def apply(
    ariaLabel: String,
    open: Boolean,
    FabProps: PartialFabProps = null,
    TransitionComponent: ReactComponentClass[TransitionProps] = null,
    TransitionProps: TransitionProps = null,
    children: TagMod[Any] = null,
    className: String = null,
    classes: Partial[ClassNameMap[SpeedDialClassKey]] = null,
    direction: up | down | left | right = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: TagMod[Any] = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    onClose: (/* event */ SyntheticEvent[Event, js.Object], /* reason */ CloseReason) => Unit = null,
    onOpen: (/* event */ SyntheticEvent[Event, js.Object], /* reason */ OpenReason) => Unit = null,
    openIcon: TagMod[Any] = null,
    style: CSSProperties = null,
    transitionDuration: Double | Anon_Appear = null
  ): SpeedDialProps = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    if (FabProps != null) __obj.updateDynamic("FabProps")(FabProps.asInstanceOf[js.Any])
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedDialProps]
  }
}

