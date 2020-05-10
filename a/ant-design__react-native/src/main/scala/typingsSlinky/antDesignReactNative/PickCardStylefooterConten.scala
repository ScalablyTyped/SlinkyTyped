package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'footerContent' | 'footerExtra' | 'footerWrap'> */
@js.native
trait PickCardStylefooterConten extends js.Object {
  var footerContent: TextStyle = js.native
  var footerExtra: TextStyle = js.native
  var footerWrap: ViewStyle = js.native
}

object PickCardStylefooterConten {
  @scala.inline
  def apply(footerContent: TextStyle, footerExtra: TextStyle, footerWrap: ViewStyle): PickCardStylefooterConten = {
    val __obj = js.Dynamic.literal(footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCardStylefooterConten]
  }
  @scala.inline
  implicit class PickCardStylefooterContenOps[Self <: PickCardStylefooterConten] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooterContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterExtra(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

