package typingsSlinky.antd.cascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascaderState extends js.Object {
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.native
  var inputFocused: Boolean = js.native
  var inputValue: String = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prevProps: CascaderProps = js.native
  var value: js.Array[String] = js.native
}

object CascaderState {
  @scala.inline
  def apply(inputFocused: Boolean, inputValue: String, prevProps: CascaderProps, value: js.Array[String]): CascaderState = {
    val __obj = js.Dynamic.literal(inputFocused = inputFocused.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderState]
  }
  @scala.inline
  implicit class CascaderStateOps[Self <: CascaderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevProps(value: CascaderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlattenOptions(value: js.Array[js.Array[CascaderOptionType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlattenOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(js.undefined)
        ret
    }
  }
  
}

