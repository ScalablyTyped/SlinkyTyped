package typingsSlinky.nodeCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Since 4.1.0: Key-validation: The keys can be given as either string or number,
	 * but are casted to a string internally anyway.
	 */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait Key extends js.Object

object Key {
  @scala.inline
  implicit def apply(value: Double): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: String): Key = value.asInstanceOf[Key]
}

