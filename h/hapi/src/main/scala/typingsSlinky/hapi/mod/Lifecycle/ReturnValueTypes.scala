package typingsSlinky.hapi.mod.Lifecycle

import typingsSlinky.boom.mod.^
import typingsSlinky.hapi.mod.ResponseToolkit
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Error
  - typingsSlinky.boom.mod.^[js.Any]
  - typingsSlinky.node.streamMod.Stream
  - js.Object
  - js.Array[js.Object]
  - js.Symbol
  - typingsSlinky.hapi.mod.ResponseToolkit
*/
trait ReturnValueTypes extends ReturnValue

object ReturnValueTypes {
  @scala.inline
  implicit def apply(value: js.Array[js.Object]): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: Boolean): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: Buffer): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: Double): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: js.Error): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: Null): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: js.Object): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: ResponseToolkit): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: Stream): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: String): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: js.Symbol): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
  @scala.inline
  implicit def apply(value: ^[js.Any]): ReturnValueTypes = value.asInstanceOf[ReturnValueTypes]
}

