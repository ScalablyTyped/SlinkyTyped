package typingsSlinky.officeUiFabricReact.basePickerTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasePickerStyles extends js.Object {
  /** Refers to the input were to type new selections (picks). */
  var input: IStyle = js.native
  /** Refers to the items already selected (picked). */
  var itemsWrapper: IStyle = js.native
  /** Root element of any picker extending from BasePicker (wraps all the elements). */
  var root: IStyle = js.native
  /** Refers to helper element used for accessibility tools (hidden from view on screen). */
  var screenReaderText: IStyle = js.native
  /**
    * Refers to the elements already selected (picked) wrapped by `itemsWrapper` along with the input to type
    * a new selection.
    */
  var text: IStyle = js.native
}

object IBasePickerStyles {
  @scala.inline
  def apply(): IBasePickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasePickerStyles]
  }
  @scala.inline
  implicit class IBasePickerStylesOps[Self <: IBasePickerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(null)
        ret
    }
    @scala.inline
    def withItemsWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsWrapper")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withScreenReaderText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenReaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(null)
        ret
    }
    @scala.inline
    def withText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}

