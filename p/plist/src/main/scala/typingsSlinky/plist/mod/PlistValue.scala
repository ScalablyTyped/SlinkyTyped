package typingsSlinky.plist.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.Date
  - typingsSlinky.node.Buffer
  - typingsSlinky.plist.mod.PlistObject
  - typingsSlinky.plist.mod.PlistArray
*/
trait PlistValue extends js.Object

object PlistValue {
  @scala.inline
  implicit def apply(value: Boolean): PlistValue = value.asInstanceOf[PlistValue]
  @scala.inline
  implicit def apply(value: Buffer): PlistValue = value.asInstanceOf[PlistValue]
  @scala.inline
  implicit def apply(value: js.Date): PlistValue = value.asInstanceOf[PlistValue]
  @scala.inline
  implicit def apply(value: Double): PlistValue = value.asInstanceOf[PlistValue]
  @scala.inline
  implicit def apply(value: PlistArray): PlistValue = value.asInstanceOf[PlistValue]
  @scala.inline
  implicit def apply(value: PlistObject): PlistValue = value.asInstanceOf[PlistValue]
  @scala.inline
  implicit def apply(value: String): PlistValue = value.asInstanceOf[PlistValue]
}

