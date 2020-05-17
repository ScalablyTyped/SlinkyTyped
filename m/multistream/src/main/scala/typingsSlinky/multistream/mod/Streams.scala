package typingsSlinky.multistream.mod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[
typingsSlinky.multistream.mod.LazyStream | typingsSlinky.node.NodeJS.ReadableStream]
  - typingsSlinky.multistream.mod.FactoryStream
*/
trait Streams extends js.Object

object Streams {
  @scala.inline
  implicit def apply(value: js.Array[LazyStream | ReadableStream]): Streams = value.asInstanceOf[Streams]
  @scala.inline
  implicit def apply(value: FactoryStream): Streams = value.asInstanceOf[Streams]
}

