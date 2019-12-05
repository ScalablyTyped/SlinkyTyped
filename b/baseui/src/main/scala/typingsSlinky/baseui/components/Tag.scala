package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.baseuiStrings.accent
import typingsSlinky.baseui.baseuiStrings.custom_
import typingsSlinky.baseui.baseuiStrings.light
import typingsSlinky.baseui.baseuiStrings.negative
import typingsSlinky.baseui.baseuiStrings.neutral
import typingsSlinky.baseui.baseuiStrings.outlined
import typingsSlinky.baseui.baseuiStrings.positive
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.solid
import typingsSlinky.baseui.baseuiStrings.warning
import typingsSlinky.baseui.tagMod.TagOverrides
import typingsSlinky.baseui.tagMod.TagProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tag
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.tagMod.Tag] {
  @JSImport("baseui/tag", "Tag")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, onClick, onKeyDown */
  def apply(
    closeable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isHovered: js.UndefOr[Boolean] = js.undefined,
    kind: custom_ | negative | warning | accent | positive | neutral | primary = null,
    onActionClick: (/* e */ Event, /* children */ js.UndefOr[TagMod[Any]]) => _ = null,
    onActionKeyDown: (/* e */ Event, /* children */ js.UndefOr[TagMod[Any]]) => _ = null,
    overrides: TagOverrides = null,
    variant: solid | light | outlined = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.tagMod.Tag] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(isHovered)) __obj.updateDynamic("isHovered")(isHovered.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2(onActionClick))
    if (onActionKeyDown != null) __obj.updateDynamic("onActionKeyDown")(js.Any.fromFunction2(onActionKeyDown))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TagProps
}

