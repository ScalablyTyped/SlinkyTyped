package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnBlur extends js.Object {
  var name: String
  var onBlur: FnCallE
  var onChange: FnCall
  var value: js.Any
}

object AnonOnBlur {
  @scala.inline
  def apply(name: String, onBlur: FnCallE, onChange: FnCall, value: js.Any): AnonOnBlur = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnBlur]
  }
}

