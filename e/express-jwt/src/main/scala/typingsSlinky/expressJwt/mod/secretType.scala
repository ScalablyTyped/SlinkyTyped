package typingsSlinky.expressJwt.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait secretType extends js.Object

object secretType {
  @scala.inline
  implicit def apply(value: Buffer): secretType = value.asInstanceOf[secretType]
  @scala.inline
  implicit def apply(value: String): secretType = value.asInstanceOf[secretType]
}

