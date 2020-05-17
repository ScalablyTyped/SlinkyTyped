package typingsSlinky.fixedDataTable2.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.react.mod.ReactElement
  - js.Function1[/ * props * / P, java.lang.String | typingsSlinky.react.mod.ReactElement]
*/
trait ElementOrFunc[P] extends js.Object

object ElementOrFunc {
  @scala.inline
  implicit def apply[P](value: js.Function1[/* props */ P, String | ReactElement]): ElementOrFunc[P] = value.asInstanceOf[ElementOrFunc[P]]
  @scala.inline
  implicit def apply[P](value: ReactElement): ElementOrFunc[P] = value.asInstanceOf[ElementOrFunc[P]]
  @scala.inline
  implicit def apply[P](value: String): ElementOrFunc[P] = value.asInstanceOf[ElementOrFunc[P]]
}

