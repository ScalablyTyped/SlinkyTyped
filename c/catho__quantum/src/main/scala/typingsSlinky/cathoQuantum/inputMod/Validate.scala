package typingsSlinky.cathoQuantum.inputMod

import typingsSlinky.cathoQuantum.anon.MaxLength
import typingsSlinky.cathoQuantum.anon.MinLength
import typingsSlinky.cathoQuantum.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
(/ * params * / typingsSlinky.cathoQuantum.anon.MaxLength) | (/ * params * / typingsSlinky.cathoQuantum.anon.MinLength) | (/ * params * / typingsSlinky.cathoQuantum.anon.Value), 
java.lang.String]
  - js.Function2[
/ * params * / typingsSlinky.cathoQuantum.anon.Value, 
/ * cpf * / js.UndefOr[java.lang.String], 
java.lang.String]
*/
trait Validate extends js.Object

object Validate {
  @scala.inline
  implicit def apply(
    value: js.Function1[(/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value), String]
  ): Validate = value.asInstanceOf[Validate]
  @scala.inline
  implicit def apply(value: js.Function2[/* params */ Value, /* cpf */ js.UndefOr[String], String]): Validate = value.asInstanceOf[Validate]
}

