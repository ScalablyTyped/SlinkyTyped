package typingsSlinky.rcRate.starMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarProps extends js.Object {
  var allowHalf: js.UndefOr[Boolean] = js.native
  var character: js.UndefOr[js.Function1[/* props */ this.type, ReactElement]] = js.native
  var characterRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ this.type, ReactElement]] = js.native
  var count: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticKeyboardEvent[HTMLDivElement], 
      /* index */ Double, 
      Unit
    ]
  ] = js.native
  var onHover: js.UndefOr[
    js.Function2[/* e */ SyntheticMouseEvent[HTMLDivElement], /* index */ Double, Unit]
  ] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object StarProps {
  @scala.inline
  def apply(): StarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StarProps]
  }
  @scala.inline
  implicit class StarPropsOps[Self <: StarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowHalf(value: Boolean): Self = this.set("allowHalf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHalf: Self = this.set("allowHalf", js.undefined)
    @scala.inline
    def setCharacter(value: StarProps => ReactElement): Self = this.set("character", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCharacter: Self = this.set("character", js.undefined)
    @scala.inline
    def setCharacterRender(value: (/* origin */ ReactElement, StarProps) => ReactElement): Self = this.set("characterRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCharacterRender: Self = this.set("characterRender", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticKeyboardEvent[HTMLDivElement], /* index */ Double) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHover(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* index */ Double) => Unit): Self = this.set("onHover", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

