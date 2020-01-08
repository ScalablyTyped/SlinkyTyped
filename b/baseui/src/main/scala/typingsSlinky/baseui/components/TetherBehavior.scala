package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.layerMod.NormalizedOffsets
import typingsSlinky.baseui.layerMod.PopperDataObject
import typingsSlinky.baseui.layerMod.TetherProps
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TetherBehavior
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.layerMod.TetherBehavior] {
  @JSImport("baseui/layer", "TetherBehavior")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    anchorRef: Ref[HTMLElement] = null,
    arrowRef: Ref[HTMLElement] = null,
    onPopperUpdate: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => _ = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    popperRef: Ref[HTMLElement] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.layerMod.TetherBehavior] = {
    val __obj = js.Dynamic.literal()
    if (anchorRef != null) __obj.updateDynamic("anchorRef")(anchorRef.asInstanceOf[js.Any])
    if (arrowRef != null) __obj.updateDynamic("arrowRef")(arrowRef.asInstanceOf[js.Any])
    if (onPopperUpdate != null) __obj.updateDynamic("onPopperUpdate")(js.Any.fromFunction2(onPopperUpdate))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (popperRef != null) __obj.updateDynamic("popperRef")(popperRef.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.layerMod.TetherBehavior] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.layerMod.TetherBehavior](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TetherProps
}

