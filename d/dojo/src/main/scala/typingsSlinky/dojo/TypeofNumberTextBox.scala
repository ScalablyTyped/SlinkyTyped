package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.dojo.dijit.form.NumberTextBox.Constraints
import typingsSlinky.dojo.dijit.form.NumberTextBox.Mixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofNumberTextBox extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.Mixin.html
    *
    * A mixin for all number textboxes
    * 
    */
  var Mixin: Instantiable0[typingsSlinky.dojo.dijit.form.NumberTextBox.Mixin] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.__Constraints.html
    *
    * Specifies both the rules on valid/invalid values (minimum, maximum,
    * number of required decimal places), and also formatting options for
    * displaying the value when the field is not focused.
    * 
    */
  var __Constraints: Instantiable0[Constraints] = js.native
}

object TypeofNumberTextBox {
  @scala.inline
  def apply(Mixin: Instantiable0[Mixin], __Constraints: Instantiable0[Constraints]): TypeofNumberTextBox = {
    val __obj = js.Dynamic.literal(Mixin = Mixin.asInstanceOf[js.Any], __Constraints = __Constraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNumberTextBox]
  }
  @scala.inline
  implicit class TypeofNumberTextBoxOps[Self <: TypeofNumberTextBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMixin(value: Instantiable0[Mixin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mixin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__Constraints(value: Instantiable0[Constraints]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__Constraints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

