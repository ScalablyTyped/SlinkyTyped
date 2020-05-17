package typingsSlinky.bent.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bent.mod.BentResponse
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.bent.mod.Json
*/
trait ValidResponse extends js.Object

object ValidResponse {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): ValidResponse = value.asInstanceOf[ValidResponse]
  @scala.inline
  implicit def apply(value: BentResponse): ValidResponse = value.asInstanceOf[ValidResponse]
  @scala.inline
  implicit def apply(value: Buffer): ValidResponse = value.asInstanceOf[ValidResponse]
  @scala.inline
  implicit def apply(value: Json): ValidResponse = value.asInstanceOf[ValidResponse]
  @scala.inline
  implicit def apply(value: String): ValidResponse = value.asInstanceOf[ValidResponse]
}

