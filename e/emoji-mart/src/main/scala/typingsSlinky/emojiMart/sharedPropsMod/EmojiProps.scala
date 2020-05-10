package typingsSlinky.emojiMart.sharedPropsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmojiProps extends js.Object {
  /** defaults to returning a png from unpkg.com-hosted emoji-datasource-${set} */
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.native
  var emoji: String | EmojiData = js.native
  var fallback: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* props */ this.type, ReactComponentClass[js.Object]]
  ] = js.native
  var forceSize: js.UndefOr[Boolean] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var native: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  var onLeave: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  var onOver: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  /** defaults to 'apple' */
  var set: js.UndefOr[EmojiSet] = js.native
  /** defaults to 52 */
  var sheetColumns: js.UndefOr[Double] = js.native
  /** defaults to 52 */
  var sheetRows: js.UndefOr[Double] = js.native
  /** defaults to 64 */
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.native
  var size: Double = js.native
  /** defaults to 1 */
  var skin: js.UndefOr[EmojiSkin] = js.native
  var tooltip: js.UndefOr[Boolean] = js.native
}

object EmojiProps {
  @scala.inline
  def apply(emoji: String | EmojiData, size: Double): EmojiProps = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiProps]
  }
  @scala.inline
  implicit class EmojiPropsOps[Self <: EmojiProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmoji(value: String | EmojiData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBackgroundImageFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageFn")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: (/* emoji */ EmojiData, EmojiProps) => ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeave(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOver(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOver")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: EmojiSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetSize(value: EmojiSheetSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: EmojiSkin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

