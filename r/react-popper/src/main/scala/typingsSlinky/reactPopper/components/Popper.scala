package typingsSlinky.reactPopper.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.popperJs.mod.Placement
import typingsSlinky.popperJs.mod.ReferenceObject
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactPopper.mod.PopperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactPopper.mod.Popper] {
  @JSImport("react-popper", "Popper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] = null,
    modifiers: Modifiers = null,
    placement: Placement = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    referenceElement: ReferenceObject = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactPopper.mod.Popper] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.asInstanceOf[js.Any])
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactPopper.mod.Popper] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactPopper.mod.Popper](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PopperProps
}

