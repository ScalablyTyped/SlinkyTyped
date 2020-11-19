package typingsSlinky.reduxForm.fieldMod

import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonFieldProps extends CommonFieldInputProps {
  
  var onBlur: EventWithDataHandler[SyntheticFocusEvent[_]] = js.native
  
  var onChange: EventWithDataHandler[ChangeEvent[_]] = js.native
}
object CommonFieldProps {
  
  @scala.inline
  def apply(
    name: String,
    onBlur: (/* event */ js.UndefOr[SyntheticFocusEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit,
    onChange: (/* event */ js.UndefOr[ChangeEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit,
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onFocus: (SyntheticFocusEvent[_], /* name */ js.UndefOr[String]) => Unit
  ): CommonFieldProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = js.Any.fromFunction4(onBlur), onChange = js.Any.fromFunction4(onChange), onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus))
    __obj.asInstanceOf[CommonFieldProps]
  }
  
  @scala.inline
  implicit class CommonFieldPropsOps[Self <: CommonFieldProps] (val x: Self) extends AnyVal {
    
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
    def setOnBlur(
      value: (/* event */ js.UndefOr[SyntheticFocusEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
    ): Self = this.set("onBlur", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnChange(
      value: (/* event */ js.UndefOr[ChangeEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction4(value))
  }
}
