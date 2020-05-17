package typingsSlinky.awsSdk.kendraMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.kendraMod.Blob
  - java.lang.String
*/
trait _Blob extends js.Object

object _Blob {
  @scala.inline
  implicit def apply(value: Blob): _Blob = value.asInstanceOf[_Blob]
  @scala.inline
  implicit def apply(value: Buffer): _Blob = value.asInstanceOf[_Blob]
  @scala.inline
  implicit def apply(value: java.lang.String): _Blob = value.asInstanceOf[_Blob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): _Blob = value.asInstanceOf[_Blob]
}

