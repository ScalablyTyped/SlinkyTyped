package typingsSlinky.emojiDashMart.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
import typingsSlinky.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin
import typingsSlinky.emojiDashMart.distDashEsUtilsSharedDashPropsMod.EmojiProps
import typingsSlinky.emojiDashMart.distDashEsUtilsSharedDashPropsMod.EmojiSet
import typingsSlinky.emojiDashMart.distDashEsUtilsSharedDashPropsMod.EmojiSheetSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Emoji
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("emoji-mart/dist-es/components/emoji/emoji", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    emoji: String | EmojiData,
    size: Double,
    backgroundImageFn: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String = null,
    fallback: (/* emoji */ EmojiData, EmojiProps) => ReactComponentClass[js.Object] = null,
    forceSize: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    native: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onLeave: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onOver: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    set: EmojiSet = null,
    sheetColumns: Int | Double = null,
    sheetRows: Int | Double = null,
    sheetSize: EmojiSheetSize = null,
    skin: EmojiSkin = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(js.Any.fromFunction2(backgroundImageFn))
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction2(fallback))
    if (!js.isUndefined(forceSize)) __obj.updateDynamic("forceSize")(forceSize.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction2(onLeave))
    if (onOver != null) __obj.updateDynamic("onOver")(js.Any.fromFunction2(onOver))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (sheetColumns != null) __obj.updateDynamic("sheetColumns")(sheetColumns.asInstanceOf[js.Any])
    if (sheetRows != null) __obj.updateDynamic("sheetRows")(sheetRows.asInstanceOf[js.Any])
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EmojiProps
}

