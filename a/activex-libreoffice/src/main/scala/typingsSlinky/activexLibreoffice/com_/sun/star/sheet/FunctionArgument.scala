package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the description of a single argument within a spreadsheet function.
  * @see com.sun.star.sheet.FunctionDescription
  */
@js.native
trait FunctionArgument extends js.Object {
  /** a description of the argument. */
  var Description: String = js.native
  /** determines whether the argument is optional. */
  var IsOptional: Boolean = js.native
  /** the name of the argument. */
  var Name: String = js.native
}

object FunctionArgument {
  @scala.inline
  def apply(Description: String, IsOptional: Boolean, Name: String): FunctionArgument = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], IsOptional = IsOptional.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionArgument]
  }
  @scala.inline
  implicit class FunctionArgumentOps[Self <: FunctionArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

