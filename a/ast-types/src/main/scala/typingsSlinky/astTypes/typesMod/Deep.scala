package typingsSlinky.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - js.Function2[
/ * type * / typingsSlinky.astTypes.typesMod.Type[js.Any], 
/ * value * / js.Any, 
scala.Unit]
*/
trait Deep extends js.Object

object Deep {
  @scala.inline
  implicit def apply(value: Boolean): Deep = value.asInstanceOf[Deep]
  @scala.inline
  implicit def apply(value: js.Function2[/* type */ Type[js.Any], /* value */ js.Any, Unit]): Deep = value.asInstanceOf[Deep]
}

