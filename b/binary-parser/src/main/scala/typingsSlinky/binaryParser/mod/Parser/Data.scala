package typingsSlinky.binaryParser.mod.Parser

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - js.Array[scala.Double | typingsSlinky.binaryParser.mod.Parser[js.Any]]
  - typingsSlinky.binaryParser.mod.Parser[js.Any]
  - typingsSlinky.node.Buffer
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: js.Array[Double | typingsSlinky.binaryParser.mod.Parser[js.Any]]): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: Buffer): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: Double): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: typingsSlinky.binaryParser.mod.Parser[js.Any]): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: String): Data = value.asInstanceOf[Data]
}

