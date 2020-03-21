package typingsSlinky.reactPopover.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactPopover.mod.PopoverPlace
import typingsSlinky.reactPopover.mod.PopoverProps
import typingsSlinky.reactPopover.mod.^
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPopover
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-popover", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    body: TagMod[Any],
    appendTarget: org.scalajs.dom.raw.Element = null,
    enterExitTransitionDurationMs: Int | Double = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onOuterAction: /* event */ Event_ => Unit = null,
    place: PopoverPlace = null,
    preferPlace: PopoverPlace = null,
    refreshIntervalMs: Int | Double = null,
    target: ReactElement = null,
    tipSize: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (appendTarget != null) __obj.updateDynamic("appendTarget")(appendTarget.asInstanceOf[js.Any])
    if (enterExitTransitionDurationMs != null) __obj.updateDynamic("enterExitTransitionDurationMs")(enterExitTransitionDurationMs.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onOuterAction != null) __obj.updateDynamic("onOuterAction")(js.Any.fromFunction1(onOuterAction))
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (preferPlace != null) __obj.updateDynamic("preferPlace")(preferPlace.asInstanceOf[js.Any])
    if (refreshIntervalMs != null) __obj.updateDynamic("refreshIntervalMs")(refreshIntervalMs.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopoverProps
}

