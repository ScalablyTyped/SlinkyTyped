package typingsSlinky.charm.mod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.NodeJS.WritableStream
  - typingsSlinky.node.NodeJS.ReadableStream
  - typingsSlinky.node.NodeJS.Process
*/
trait CharmAnyStream extends js.Object

object CharmAnyStream {
  @scala.inline
  implicit def apply(value: Process): CharmAnyStream = value.asInstanceOf[CharmAnyStream]
  @scala.inline
  implicit def apply(value: ReadableStream): CharmAnyStream = value.asInstanceOf[CharmAnyStream]
  @scala.inline
  implicit def apply(value: WritableStream): CharmAnyStream = value.asInstanceOf[CharmAnyStream]
}

