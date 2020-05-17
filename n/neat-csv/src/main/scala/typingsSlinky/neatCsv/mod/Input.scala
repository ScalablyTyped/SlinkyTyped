package typingsSlinky.neatCsv.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CSV data to parse. */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.streamMod.Readable
*/
trait Input extends js.Object

object Input {
  @scala.inline
  implicit def apply(value: Buffer): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: Readable): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: String): Input = value.asInstanceOf[Input]
}

