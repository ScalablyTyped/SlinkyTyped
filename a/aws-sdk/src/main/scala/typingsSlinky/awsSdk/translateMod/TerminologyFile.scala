package typingsSlinky.awsSdk.translateMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.translateMod.Blob
  - java.lang.String
*/
trait TerminologyFile extends js.Object

object TerminologyFile {
  @scala.inline
  implicit def apply(value: Blob): TerminologyFile = value.asInstanceOf[TerminologyFile]
  @scala.inline
  implicit def apply(value: Buffer): TerminologyFile = value.asInstanceOf[TerminologyFile]
  @scala.inline
  implicit def apply(value: java.lang.String): TerminologyFile = value.asInstanceOf[TerminologyFile]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): TerminologyFile = value.asInstanceOf[TerminologyFile]
}

