package typingsSlinky.protractorBrowserLogs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.protractorBrowserLogs.mod.matchPredicateFunction
*/
trait matchPredicate extends js.Object

object matchPredicate {
  @scala.inline
  implicit def apply(value: js.RegExp): matchPredicate = value.asInstanceOf[matchPredicate]
  @scala.inline
  implicit def apply(value: String): matchPredicate = value.asInstanceOf[matchPredicate]
  @scala.inline
  implicit def apply(value: matchPredicateFunction): matchPredicate = value.asInstanceOf[matchPredicate]
}

