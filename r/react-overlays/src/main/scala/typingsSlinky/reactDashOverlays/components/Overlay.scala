package typingsSlinky.reactDashOverlays.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ReactInstance
import typingsSlinky.reactDashOverlays.libOverlayMod.OverlayProps
import typingsSlinky.reactDashOverlays.libOverlayMod.Placements
import typingsSlinky.reactDashOverlays.libPortalMod.PortalProps
import typingsSlinky.reactDashOverlays.reactDashOverlaysStrings.click
import typingsSlinky.reactDashOverlays.reactDashOverlaysStrings.mousedown
import typingsSlinky.reactDashTransitionDashGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOverlays.libMod.Overlay] {
  @JSImport("react-overlays/lib", "Overlay")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    container: TagMod[Any] | js.Function = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    onEnter: /* node */ HTMLElement => _ = null,
    onEntered: /* node */ HTMLElement => _ = null,
    onEntering: /* node */ HTMLElement => _ = null,
    onExit: /* node */ HTMLElement => _ = null,
    onExited: /* node */ HTMLElement => _ = null,
    onExiting: /* node */ HTMLElement => _ = null,
    onHide: (/* props */ PortalProps, /* repeated */ js.Any) => _ = null,
    onRendered: js.Function = null,
    placement: Placements = null,
    popperConfig: js.Object = null,
    rootClose: js.UndefOr[Boolean] = js.undefined,
    rootCloseDisabled: js.UndefOr[Boolean] = js.undefined,
    rootCloseEvent: click | mousedown = null,
    show: js.UndefOr[Boolean] = js.undefined,
    target: ReactInstance | js.Function0[ReactInstance] = null,
    transition: ReactComponentClass[TransitionProps] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOverlays.libMod.Overlay] = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperConfig != null) __obj.updateDynamic("popperConfig")(popperConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(rootClose)) __obj.updateDynamic("rootClose")(rootClose.asInstanceOf[js.Any])
    if (!js.isUndefined(rootCloseDisabled)) __obj.updateDynamic("rootCloseDisabled")(rootCloseDisabled.asInstanceOf[js.Any])
    if (rootCloseEvent != null) __obj.updateDynamic("rootCloseEvent")(rootCloseEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashOverlays.libMod.Overlay] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDashOverlays.libMod.Overlay](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = OverlayProps
}

