package typingsSlinky.encodingJapanese.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Uint8Array
  - js.Array[scala.Double]
  - typingsSlinky.node.Buffer
*/
trait RawType extends js.Object

object RawType {
  @scala.inline
  implicit def apply(value: js.Array[Double]): RawType = value.asInstanceOf[RawType]
  @scala.inline
  implicit def apply(value: Buffer): RawType = value.asInstanceOf[RawType]
  @scala.inline
  implicit def apply(value: String): RawType = value.asInstanceOf[RawType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): RawType = value.asInstanceOf[RawType]
}

