package typingsSlinky.reactOverlays.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactOverlays.modalManagerMod.^
import typingsSlinky.reactOverlays.modalMod.ModalProps
import typingsSlinky.reactOverlays.reactOverlaysStrings.static
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOverlays.mod.Modal] {
  @JSImport("react-overlays", "Modal")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className */
  def apply(
    backdrop: Boolean | static = null,
    backdropTransition: ReactComponentClass[TransitionProps] = null,
    container: TagMod[Any] | js.Function = null,
    containerClassName: String = null,
    enforceFocus: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    manager: ^ = null,
    onBackdropClick: js.Function = null,
    onEnter: /* node */ HTMLElement => _ = null,
    onEntered: /* node */ HTMLElement => _ = null,
    onEntering: /* node */ HTMLElement => _ = null,
    onEscapeKeyDown: js.Function = null,
    onExit: /* node */ HTMLElement => _ = null,
    onExited: /* node */ HTMLElement => _ = null,
    onExiting: /* node */ HTMLElement => _ = null,
    onHide: js.Function = null,
    onRendered: js.Function = null,
    onShow: js.Function = null,
    renderBackdrop: /* props */ js.Any => TagMod[Any] = null,
    renderDialog: /* props */ js.Any => TagMod[Any] = null,
    restoreFocus: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    transition: ReactComponentClass[TransitionProps] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.Modal] = {
    val __obj = js.Dynamic.literal()
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropTransition != null) __obj.updateDynamic("backdropTransition")(backdropTransition.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (manager != null) __obj.updateDynamic("manager")(manager.asInstanceOf[js.Any])
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(onBackdropClick.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(onEscapeKeyDown.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (renderBackdrop != null) __obj.updateDynamic("renderBackdrop")(js.Any.fromFunction1(renderBackdrop))
    if (renderDialog != null) __obj.updateDynamic("renderDialog")(js.Any.fromFunction1(renderDialog))
    if (!js.isUndefined(restoreFocus)) __obj.updateDynamic("restoreFocus")(restoreFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.Modal] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactOverlays.mod.Modal](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ModalProps
}

