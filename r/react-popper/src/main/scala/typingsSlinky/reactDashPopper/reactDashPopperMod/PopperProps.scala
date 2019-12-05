package typingsSlinky.reactDashPopper.reactDashPopperMod

import slinky.core.TagMod
import typingsSlinky.popperDotJs.popperDotJsMod.Modifiers
import typingsSlinky.popperDotJs.popperDotJsMod.Placement
import typingsSlinky.popperDotJs.popperDotJsMod.ReferenceObject
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperProps extends js.Object {
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var positionFixed: js.UndefOr[Boolean] = js.undefined
  var referenceElement: js.UndefOr[ReferenceObject] = js.undefined
  def children(props: PopperChildrenProps): TagMod[Any]
}

object PopperProps {
  @scala.inline
  def apply(
    children: PopperChildrenProps => TagMod[Any],
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] = null,
    modifiers: Modifiers = null,
    placement: Placement = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    referenceElement: ReferenceObject = null
  ): PopperProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.asInstanceOf[js.Any])
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperProps]
  }
}

