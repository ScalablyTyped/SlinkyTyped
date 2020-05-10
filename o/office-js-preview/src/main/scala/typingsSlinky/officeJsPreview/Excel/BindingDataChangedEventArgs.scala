package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the DataChanged event.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait BindingDataChangedEventArgs extends js.Object {
  /**
    *
    * Gets the Binding object that represents the binding that raised the DataChanged event.
    *
    * [Api set: ExcelApi 1.2]
    */
  var binding: Binding = js.native
}

object BindingDataChangedEventArgs {
  @scala.inline
  def apply(binding: Binding): BindingDataChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDataChangedEventArgs]
  }
  @scala.inline
  implicit class BindingDataChangedEventArgsOps[Self <: BindingDataChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinding(value: Binding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

