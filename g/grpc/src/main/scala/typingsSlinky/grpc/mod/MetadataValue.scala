package typingsSlinky.grpc.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait MetadataValue extends js.Object

object MetadataValue {
  @scala.inline
  implicit def apply(value: Buffer): MetadataValue = value.asInstanceOf[MetadataValue]
  @scala.inline
  implicit def apply(value: String): MetadataValue = value.asInstanceOf[MetadataValue]
}

