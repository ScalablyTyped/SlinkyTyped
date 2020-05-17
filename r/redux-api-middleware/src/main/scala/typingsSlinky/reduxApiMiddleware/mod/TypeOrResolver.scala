package typingsSlinky.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Type
  - js.Function1[/ * arg * / Arg, Type]
*/
trait TypeOrResolver[Arg, Type] extends js.Object

object TypeOrResolver {
  @scala.inline
  implicit def apply[Arg, Type](value: js.Function1[/* arg */ Arg, Type]): TypeOrResolver[Arg, Type] = value.asInstanceOf[TypeOrResolver[Arg, Type]]
  @scala.inline
  implicit def apply[Arg, Type](value: Type): TypeOrResolver[Arg, Type] = value.asInstanceOf[TypeOrResolver[Arg, Type]]
}

