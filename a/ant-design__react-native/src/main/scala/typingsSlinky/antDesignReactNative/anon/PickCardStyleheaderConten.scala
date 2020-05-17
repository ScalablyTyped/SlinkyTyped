package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'headerContentWrap' | 'headerContent' | 'headerExtraWrap' | 'headerExtra' | 'headerImage' | 'headerTitle' | 'headerWrap'> */
@js.native
trait PickCardStyleheaderConten extends js.Object {
  var headerContent: TextStyle = js.native
  var headerContentWrap: ViewStyle = js.native
  var headerExtra: TextStyle = js.native
  var headerExtraWrap: ViewStyle = js.native
  var headerImage: ImageStyle = js.native
  var headerTitle: ViewStyle = js.native
  var headerWrap: ViewStyle = js.native
}

object PickCardStyleheaderConten {
  @scala.inline
  def apply(
    headerContent: TextStyle,
    headerContentWrap: ViewStyle,
    headerExtra: TextStyle,
    headerExtraWrap: ViewStyle,
    headerImage: ImageStyle,
    headerTitle: ViewStyle,
    headerWrap: ViewStyle
  ): PickCardStyleheaderConten = {
    val __obj = js.Dynamic.literal(headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCardStyleheaderConten]
  }
  @scala.inline
  implicit class PickCardStyleheaderContenOps[Self <: PickCardStyleheaderConten] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderContentWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContentWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderExtra(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderExtraWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerExtraWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderImage(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTitle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

