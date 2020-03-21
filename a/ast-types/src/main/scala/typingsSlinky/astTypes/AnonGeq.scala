package typingsSlinky.astTypes

import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeq extends js.Object {
  var defaults: AnonEmptyArray
  var isPrimitive: Type[js.Object]
  def geq(than: js.Any): Type[js.Object]
}

object AnonGeq {
  @scala.inline
  def apply(defaults: AnonEmptyArray, geq: js.Any => Type[js.Object], isPrimitive: Type[js.Object]): AnonGeq = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], geq = js.Any.fromFunction1(geq), isPrimitive = isPrimitive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGeq]
  }
}

