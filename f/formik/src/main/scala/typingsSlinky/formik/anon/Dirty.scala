package typingsSlinky.formik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dirty[Values] extends js.Object {
  var dirty: Boolean
  var initialValues: Values
  var isValid: Boolean
}

object Dirty {
  @scala.inline
  def apply[Values](dirty: Boolean, initialValues: Values, isValid: Boolean): Dirty[Values] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirty[Values]]
  }
}

