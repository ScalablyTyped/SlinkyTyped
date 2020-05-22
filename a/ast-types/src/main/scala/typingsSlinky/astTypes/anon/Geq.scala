package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geq extends js.Object {
  var defaults: EmptyArray
  var isPrimitive: Type[js.Object]
  def geq(than: js.Any): Type[js.Object]
}

object Geq {
  @scala.inline
  def apply(defaults: EmptyArray, geq: js.Any => Type[js.Object], isPrimitive: Type[js.Object]): Geq = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], geq = js.Any.fromFunction1(geq), isPrimitive = isPrimitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geq]
  }
}

