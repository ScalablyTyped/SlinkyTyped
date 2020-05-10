package typingsSlinky.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Provides extensions to the base ECMAScript (JavaScript) Boolean object.
* Boolean Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb397557(v=vs.100).aspx}
*/
@js.native
trait BooleanConstructor extends js.Object {
  //#region Extensions
  /**
    * Converts a string representation of a logical value to its Boolean object equivalent.
    */
  def parse(value: java.lang.String): Boolean = js.native
}

object BooleanConstructor {
  @scala.inline
  def apply(parse: java.lang.String => Boolean): BooleanConstructor = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[BooleanConstructor]
  }
  @scala.inline
  implicit class BooleanConstructorOps[Self <: BooleanConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: java.lang.String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

