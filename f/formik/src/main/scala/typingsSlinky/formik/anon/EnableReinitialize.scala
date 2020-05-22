package typingsSlinky.formik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableReinitialize extends js.Object {
  var enableReinitialize: Boolean
  var isInitialValid: Boolean
  var validateOnBlur: Boolean
  var validateOnChange: Boolean
}

object EnableReinitialize {
  @scala.inline
  def apply(
    enableReinitialize: Boolean,
    isInitialValid: Boolean,
    validateOnBlur: Boolean,
    validateOnChange: Boolean
  ): EnableReinitialize = {
    val __obj = js.Dynamic.literal(enableReinitialize = enableReinitialize.asInstanceOf[js.Any], isInitialValid = isInitialValid.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validateOnChange = validateOnChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableReinitialize]
  }
}

