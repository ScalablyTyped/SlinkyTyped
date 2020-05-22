package typingsSlinky.reactNativeNavigation.anon

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementId extends js.Object {
  var elementId: Validator[String]
  var resizeMode: Requireable[String]
}

object ElementId {
  @scala.inline
  def apply(elementId: Validator[String], resizeMode: Requireable[String]): ElementId = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementId]
  }
}

