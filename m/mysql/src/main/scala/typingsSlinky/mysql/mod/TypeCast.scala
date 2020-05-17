package typingsSlinky.mysql.mod

import typingsSlinky.mysql.anon.UntypedFieldInfotypestrin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - js.Function2[
/ * field * / typingsSlinky.mysql.anon.UntypedFieldInfotypestrin, 
/ * next * / js.Function0[scala.Unit], 
js.Any]
*/
trait TypeCast extends js.Object

object TypeCast {
  @scala.inline
  implicit def apply(value: Boolean): TypeCast = value.asInstanceOf[TypeCast]
  @scala.inline
  implicit def apply(value: js.Function2[/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit], js.Any]): TypeCast = value.asInstanceOf[TypeCast]
}

