package typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupOptionStyles extends js.Object {
  var choiceFieldWrapper: js.UndefOr[IStyle] = js.native
  var field: js.UndefOr[IStyle] = js.native
  var iconWrapper: js.UndefOr[IStyle] = js.native
  var imageWrapper: js.UndefOr[IStyle] = js.native
  var innerField: js.UndefOr[IStyle] = js.native
  var input: js.UndefOr[IStyle] = js.native
  var labelWrapper: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var selectedImageWrapper: js.UndefOr[IStyle] = js.native
}

object IChoiceGroupOptionStyles {
  @scala.inline
  def apply(): IChoiceGroupOptionStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChoiceGroupOptionStyles]
  }
  @scala.inline
  implicit class IChoiceGroupOptionStylesOps[Self <: IChoiceGroupOptionStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoiceFieldWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choiceFieldWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoiceFieldWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choiceFieldWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withChoiceFieldWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choiceFieldWrapper")(null)
        ret
    }
    @scala.inline
    def withField(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(null)
        ret
    }
    @scala.inline
    def withIconWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWrapper")(null)
        ret
    }
    @scala.inline
    def withImageWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withImageWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrapper")(null)
        ret
    }
    @scala.inline
    def withInnerField(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerField")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerFieldNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerField")(null)
        ret
    }
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
    def withLabelWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapper")(null)
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
    def withSelectedImageWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedImageWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedImageWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageWrapper")(null)
        ret
    }
  }
  
}

