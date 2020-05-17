package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
@js.native
trait PartialAccordionStyle extends js.Object {
  var arrow: js.UndefOr[TextStyle] = js.native
  var container: js.UndefOr[ViewStyle] = js.native
  var content: js.UndefOr[ViewStyle] = js.native
  var contentText: js.UndefOr[TextStyle] = js.native
  var header: js.UndefOr[ViewStyle] = js.native
  var headerText: js.UndefOr[TextStyle] = js.native
  var headerWrap: js.UndefOr[ViewStyle] = js.native
}

object PartialAccordionStyle {
  @scala.inline
  def apply(): PartialAccordionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAccordionStyle]
  }
  @scala.inline
  implicit class PartialAccordionStyleOps[Self <: PartialAccordionStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrap")(js.undefined)
        ret
    }
  }
  
}

