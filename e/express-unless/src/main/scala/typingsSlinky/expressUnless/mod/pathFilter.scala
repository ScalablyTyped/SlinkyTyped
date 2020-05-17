package typingsSlinky.expressUnless.mod

import typingsSlinky.expressUnless.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.expressUnless.anon.Method
*/
trait pathFilter extends js.Object

object pathFilter {
  @scala.inline
  implicit def apply(value: Method): pathFilter = value.asInstanceOf[pathFilter]
  @scala.inline
  implicit def apply(value: js.RegExp): pathFilter = value.asInstanceOf[pathFilter]
  @scala.inline
  implicit def apply(value: String): pathFilter = value.asInstanceOf[pathFilter]
}

