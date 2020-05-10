package typingsSlinky.reactVirtualizedSelect.mod

import typingsSlinky.reactVirtualized.esListMod.ListProps
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualizedOptionRenderOptions[T] extends js.Object {
  var focusedOption: T = js.native
  var focusedOptionIndex: Double = js.native
  var key: String = js.native
  var labelKey: /* keyof T */ String = js.native
  var listProps: ListProps = js.native
  var option: T = js.native
  var options: js.Array[T] = js.native
  var style: Record[String, String] = js.native
  var valueArray: js.Array[T] = js.native
  def focusOption(option: T): Unit = js.native
  def selectValue(option: T): Unit = js.native
}

object VirtualizedOptionRenderOptions {
  @scala.inline
  def apply[T](
    focusOption: T => Unit,
    focusedOption: T,
    focusedOptionIndex: Double,
    key: String,
    labelKey: /* keyof T */ String,
    listProps: ListProps,
    option: T,
    options: js.Array[T],
    selectValue: T => Unit,
    style: Record[String, String],
    valueArray: js.Array[T]
  ): VirtualizedOptionRenderOptions[T] = {
    val __obj = js.Dynamic.literal(focusOption = js.Any.fromFunction1(focusOption), focusedOption = focusedOption.asInstanceOf[js.Any], focusedOptionIndex = focusedOptionIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], listProps = listProps.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectValue = js.Any.fromFunction1(selectValue), style = style.asInstanceOf[js.Any], valueArray = valueArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
  }
  @scala.inline
  implicit class VirtualizedOptionRenderOptionsOps[Self[t] <: VirtualizedOptionRenderOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFocusOption(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocusedOption(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedOptionIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedOptionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelKey(value: /* keyof T */ String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProps(value: ListProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectValue(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: Record[String, String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueArray(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

