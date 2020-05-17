package typingsSlinky.materialUiLab.autocompleteAutocompleteMod

import typingsSlinky.materialUiLab.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderInputParams extends js.Object {
  var InputLabelProps: js.Object = js.native
  var InputProps: ClassName = js.native
  var disabled: Boolean = js.native
  var id: String = js.native
  var inputProps: js.Object = js.native
}

object RenderInputParams {
  @scala.inline
  def apply(
    InputLabelProps: js.Object,
    InputProps: ClassName,
    disabled: Boolean,
    id: String,
    inputProps: js.Object
  ): RenderInputParams = {
    val __obj = js.Dynamic.literal(InputLabelProps = InputLabelProps.asInstanceOf[js.Any], InputProps = InputProps.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputProps = inputProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderInputParams]
  }
  @scala.inline
  implicit class RenderInputParamsOps[Self <: RenderInputParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputLabelProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLabelProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputProps(value: ClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

