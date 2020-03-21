package typingsSlinky.reactBootstrap.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrap.mod.Sizes
import typingsSlinky.reactBootstrap.popoverMod.PopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrap.mod.Popover] {
  @JSImport("react-bootstrap", "Popover")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    arrowOffsetLeft: Double | String = null,
    arrowOffsetTop: Double | String = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    placement: String = null,
    positionLeft: Double | String = null,
    positionTop: Double | String = null,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.Popover] = {
    val __obj = js.Dynamic.literal()
    if (arrowOffsetLeft != null) __obj.updateDynamic("arrowOffsetLeft")(arrowOffsetLeft.asInstanceOf[js.Any])
    if (arrowOffsetTop != null) __obj.updateDynamic("arrowOffsetTop")(arrowOffsetTop.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (positionLeft != null) __obj.updateDynamic("positionLeft")(positionLeft.asInstanceOf[js.Any])
    if (positionTop != null) __obj.updateDynamic("positionTop")(positionTop.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.Popover] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactBootstrap.mod.Popover](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PopoverProps
}

