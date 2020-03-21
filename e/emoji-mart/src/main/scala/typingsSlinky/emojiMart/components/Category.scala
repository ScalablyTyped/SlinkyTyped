package typingsSlinky.emojiMart.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.emojiMart.categoryMod.default
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.sharedPropsMod.CategoryName
import typingsSlinky.emojiMart.sharedPropsMod.EmojiProps
import typingsSlinky.emojiMart.sharedPropsMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Category
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("emoji-mart/dist-es/components/category", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    emojiProps: EmojiProps,
    i18n: I18n,
    id: CategoryName,
    name: String,
    native: Boolean,
    perLine: Double,
    emojis: js.Array[String | EmojiData] = null,
    hasStickyPosition: js.UndefOr[Boolean] = js.undefined,
    recent: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(emojiProps = emojiProps.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], perLine = perLine.asInstanceOf[js.Any])
    if (emojis != null) __obj.updateDynamic("emojis")(emojis.asInstanceOf[js.Any])
    if (!js.isUndefined(hasStickyPosition)) __obj.updateDynamic("hasStickyPosition")(hasStickyPosition.asInstanceOf[js.Any])
    if (recent != null) __obj.updateDynamic("recent")(recent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.emojiMart.categoryMod.Props
}

