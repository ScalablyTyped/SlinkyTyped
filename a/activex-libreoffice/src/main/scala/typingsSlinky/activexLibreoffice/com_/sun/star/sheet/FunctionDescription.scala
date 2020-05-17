package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * collects all properties used to describe a function.
  * @see com.sun.star.sheet.FunctionDescriptions
  */
@js.native
trait FunctionDescription extends js.Object {
  /** returns a sequence of localized descriptions of the function's arguments (in the order specified by the function). */
  var Arguments: SafeArray[FunctionArgument] = js.native
  /**
    * returns the function's category.
    * @see com.sun.star.sheet.FunctionCategory
    */
  var Category: Double = js.native
  /** returns a localized description of the function. */
  var Description: String = js.native
  /**
    * returns the function's unique identifier.
    * @see com.sun.star.sheet.XFunctionDescriptions
    */
  var Id: Double = js.native
  /** returns the localized function's name. */
  var Name: String = js.native
}

object FunctionDescription {
  @scala.inline
  def apply(
    Arguments: SafeArray[FunctionArgument],
    Category: Double,
    Description: String,
    Id: Double,
    Name: String
  ): FunctionDescription = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDescription]
  }
  @scala.inline
  implicit class FunctionDescriptionOps[Self <: FunctionDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: SafeArray[FunctionArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
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

