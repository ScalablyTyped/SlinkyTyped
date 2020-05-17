package typingsSlinky.awsSdk.qldbsessionMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.qldbsessionMod.Blob
  - java.lang.String
*/
trait IonBinary extends js.Object

object IonBinary {
  @scala.inline
  implicit def apply(value: Blob): IonBinary = value.asInstanceOf[IonBinary]
  @scala.inline
  implicit def apply(value: Buffer): IonBinary = value.asInstanceOf[IonBinary]
  @scala.inline
  implicit def apply(value: String): IonBinary = value.asInstanceOf[IonBinary]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): IonBinary = value.asInstanceOf[IonBinary]
}

