package typingsSlinky.reactNativeAwesomeCardIo.mod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardIOViewProps extends CardIOCommonProps {
  /**  Style props of CardIOViewProps */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**  This function will be called when the CardIOView completes its work and returns a CreditCard. */
  def didScanCard(card: CardDetails): Unit = js.native
}

object CardIOViewProps {
  @scala.inline
  def apply(didScanCard: CardDetails => Unit): CardIOViewProps = {
    val __obj = js.Dynamic.literal(didScanCard = js.Any.fromFunction1(didScanCard))
    __obj.asInstanceOf[CardIOViewProps]
  }
  @scala.inline
  implicit class CardIOViewPropsOps[Self <: CardIOViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidScanCard(value: CardDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didScanCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}

