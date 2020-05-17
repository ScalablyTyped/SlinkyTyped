package typingsSlinky.awsSdkTypes.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.ArrayBufferView
*/
trait SourceData extends js.Object

object SourceData {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): SourceData = value.asInstanceOf[SourceData]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): SourceData = value.asInstanceOf[SourceData]
  @scala.inline
  implicit def apply(value: String): SourceData = value.asInstanceOf[SourceData]
}

