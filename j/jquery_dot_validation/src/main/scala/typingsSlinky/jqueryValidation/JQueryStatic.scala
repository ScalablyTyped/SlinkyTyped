package typingsSlinky.jqueryValidation

import typingsSlinky.jqueryValidation.JQueryValidation.ValidatorStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var validator: ValidatorStatic = js.native
  /**
    * Replaces {n} placeholders with arguments.
    *
    * @param template The string to format.
    */
  def format(template: String, arguments: String*): String = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(format: (String, /* repeated */ String) => String, validator: ValidatorStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: (String, /* repeated */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidator(value: ValidatorStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

