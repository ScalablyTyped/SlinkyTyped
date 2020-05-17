package typingsSlinky.reactNativeElements.anon

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.ButtonInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.PricingCardProps> */
@js.native
trait PartialPricingCardProps extends js.Object {
  var button: js.UndefOr[ButtonInformation] = js.native
  var color: js.UndefOr[String] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var info: js.UndefOr[js.Array[String]] = js.native
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.native
  var price: js.UndefOr[String] = js.native
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var title: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object PartialPricingCardProps {
  @scala.inline
  def apply(): PartialPricingCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPricingCardProps]
  }
  @scala.inline
  implicit class PartialPricingCardPropsOps[Self <: PartialPricingCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: ButtonInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withInfo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoStyle")(null)
        ret
    }
    @scala.inline
    def withOnButtonPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnButtonPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonPress")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingStyle")(null)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(null)
        ret
    }
    @scala.inline
    def withWrapperStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(null)
        ret
    }
  }
  
}

