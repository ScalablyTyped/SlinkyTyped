package typingsSlinky.atlaskitLayer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atlaskitLayer.mod.BoundariesElementType
import typingsSlinky.atlaskitLayer.mod.CSSPositionType
import typingsSlinky.atlaskitLayer.mod.FlipPositionType
import typingsSlinky.atlaskitLayer.mod.PositionType
import typingsSlinky.atlaskitLayer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@atlaskit/layer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autoFlip: Boolean | FlipPositionType | js.Array[FlipPositionType] = null,
    boundariesElement: BoundariesElementType = null,
    content: TagMod[Any] = null,
    lockScroll: js.UndefOr[Boolean] = js.undefined,
    offset: String = null,
    onFlippedChange: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Unit = null,
    position: PositionType = null,
    zIndex: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (autoFlip != null) __obj.updateDynamic("autoFlip")(autoFlip.asInstanceOf[js.Any])
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScroll)) __obj.updateDynamic("lockScroll")(lockScroll.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onFlippedChange != null) __obj.updateDynamic("onFlippedChange")(js.Any.fromFunction3(onFlippedChange))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.atlaskitLayer.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.atlaskitLayer.mod.Props
}

