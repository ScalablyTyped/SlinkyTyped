package typingsSlinky.formSerializer.FormSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSerializerPatterns extends js.Object {
  var fixed: js.RegExp
  var key: js.RegExp
  var named: js.RegExp
  var push: js.RegExp
  var validate: js.RegExp
}

object FormSerializerPatterns {
  @scala.inline
  def apply(fixed: js.RegExp, key: js.RegExp, named: js.RegExp, push: js.RegExp, validate: js.RegExp): FormSerializerPatterns = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormSerializerPatterns]
  }
}

