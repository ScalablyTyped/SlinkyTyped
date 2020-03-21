package typingsSlinky.formik

import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var value: js.Any
  def onBlur(e: js.Any): Unit
  def onChange(e: ChangeEvent[_]): Unit
}

object AnonName {
  @scala.inline
  def apply(name: String, onBlur: js.Any => Unit, onChange: ChangeEvent[_] => Unit, value: js.Any): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

