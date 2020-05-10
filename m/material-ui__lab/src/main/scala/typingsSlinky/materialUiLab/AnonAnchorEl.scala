package typingsSlinky.materialUiLab

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnchorEl[T] extends js.Object {
  var anchorEl: Null | HTMLElement = js.native
   // or T | T[]
  var dirty: Boolean = js.native
  var focused: Boolean = js.native
  var focusedTag: Double = js.native
  var groupedOptions: js.Array[T] = js.native
  var id: String = js.native
  var inputValue: String = js.native
  var popupOpen: Boolean = js.native
  // TODO: infer the right type when the issue is resolved
  // https://github.com/microsoft/TypeScript/issues/13995
  var value: js.Any = js.native
  def getClearProps(): js.Object = js.native
  def getInputLabelProps(): js.Object = js.native
  def getInputProps(): js.Object = js.native
  def getListboxProps(): js.Object = js.native
  def getOptionProps(hasOptionIndex: AnonOption[T]): js.Object = js.native
  def getPopupIndicatorProps(): js.Object = js.native
  def getRootProps(): js.Object = js.native
  def getTagProps(hasIndex: AnonIndex): js.Object = js.native
  def setAnchorEl(): Unit = js.native
}

object AnonAnchorEl {
  @scala.inline
  def apply[T](
    dirty: Boolean,
    focused: Boolean,
    focusedTag: Double,
    getClearProps: () => js.Object,
    getInputLabelProps: () => js.Object,
    getInputProps: () => js.Object,
    getListboxProps: () => js.Object,
    getOptionProps: AnonOption[T] => js.Object,
    getPopupIndicatorProps: () => js.Object,
    getRootProps: () => js.Object,
    getTagProps: AnonIndex => js.Object,
    groupedOptions: js.Array[T],
    id: String,
    inputValue: String,
    popupOpen: Boolean,
    setAnchorEl: () => Unit,
    value: js.Any
  ): AnonAnchorEl[T] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], focusedTag = focusedTag.asInstanceOf[js.Any], getClearProps = js.Any.fromFunction0(getClearProps), getInputLabelProps = js.Any.fromFunction0(getInputLabelProps), getInputProps = js.Any.fromFunction0(getInputProps), getListboxProps = js.Any.fromFunction0(getListboxProps), getOptionProps = js.Any.fromFunction1(getOptionProps), getPopupIndicatorProps = js.Any.fromFunction0(getPopupIndicatorProps), getRootProps = js.Any.fromFunction0(getRootProps), getTagProps = js.Any.fromFunction1(getTagProps), groupedOptions = groupedOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], popupOpen = popupOpen.asInstanceOf[js.Any], setAnchorEl = js.Any.fromFunction0(setAnchorEl), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchorEl[T]]
  }
  @scala.inline
  implicit class AnonAnchorElOps[Self[t] <: AnonAnchorEl[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDirty(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedTag(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClearProps(value: () => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInputLabelProps(value: () => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputLabelProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInputProps(value: () => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetListboxProps(value: () => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListboxProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOptionProps(value: AnonOption[T] => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPopupIndicatorProps(value: () => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupIndicatorProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRootProps(value: () => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTagProps(value: AnonIndex => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTagProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupedOptions(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupOpen(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAnchorEl(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnchorEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorEl(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorElNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(null)
        ret
    }
  }
  
}

