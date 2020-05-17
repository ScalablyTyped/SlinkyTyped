package typingsSlinky.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.std.Date
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.ArrayBufferView
  - typingsSlinky.std.DataView
  - js.Array[js.Array[scala.Unit]]
*/
trait IndexableTypePart extends IndexableType

object IndexableTypePart {
  @scala.inline
  implicit def apply(value: js.Array[js.Array[Unit]]): IndexableTypePart = value.asInstanceOf[IndexableTypePart]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): IndexableTypePart = value.asInstanceOf[IndexableTypePart]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): IndexableTypePart = value.asInstanceOf[IndexableTypePart]
  @scala.inline
  implicit def apply(value: js.typedarray.DataView): IndexableTypePart = value.asInstanceOf[IndexableTypePart]
  @scala.inline
  implicit def apply(value: js.Date): IndexableTypePart = value.asInstanceOf[IndexableTypePart]
  @scala.inline
  implicit def apply(value: Double): IndexableTypePart = value.asInstanceOf[IndexableTypePart]
  @scala.inline
  implicit def apply(value: String): IndexableTypePart = value.asInstanceOf[IndexableTypePart]
}

