package typingsSlinky.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.meteorAstronomy.MeteorAstronomy.ModelFullField[Field, Doc]
  - typingsSlinky.meteorAstronomy.MeteorAstronomy.TypeOptions
*/
trait ModelField[Field, Doc] extends js.Object

object ModelField {
  @scala.inline
  implicit def apply[Field, Doc](value: ModelFullField[Field, Doc]): ModelField[Field, Doc] = value.asInstanceOf[ModelField[Field, Doc]]
  @scala.inline
  implicit def apply[Field, Doc](value: TypeOptions): ModelField[Field, Doc] = value.asInstanceOf[ModelField[Field, Doc]]
}

