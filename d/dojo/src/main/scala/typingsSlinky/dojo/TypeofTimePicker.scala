package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.dojo.dijit.TimePicker.Constraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTimePicker extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_TimePicker.__Constraints.html
    *
    * 
    */
  var __Constraints: Instantiable0[Constraints] = js.native
}

object TypeofTimePicker {
  @scala.inline
  def apply(__Constraints: Instantiable0[Constraints]): TypeofTimePicker = {
    val __obj = js.Dynamic.literal(__Constraints = __Constraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimePicker]
  }
  @scala.inline
  implicit class TypeofTimePickerOps[Self <: TypeofTimePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__Constraints(value: Instantiable0[Constraints]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__Constraints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

