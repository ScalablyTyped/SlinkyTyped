package typingsSlinky.minappEnv.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait DocumentId extends js.Object

object DocumentId {
  @scala.inline
  implicit def apply(value: Double): DocumentId = value.asInstanceOf[DocumentId]
  @scala.inline
  implicit def apply(value: String): DocumentId = value.asInstanceOf[DocumentId]
}

