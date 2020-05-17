package typingsSlinky.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A plain JSON value */
/* Rewritten from type alias, can be one of: 
  - scala.Null
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.PlainJSONArray
  - typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.PlainJSONObject
*/
trait PlainJSONValue extends js.Object

object PlainJSONValue {
  @scala.inline
  implicit def apply(value: Boolean): PlainJSONValue = value.asInstanceOf[PlainJSONValue]
  @scala.inline
  implicit def apply(value: Double): PlainJSONValue = value.asInstanceOf[PlainJSONValue]
  @scala.inline
  implicit def apply(value: Null): PlainJSONValue = value.asInstanceOf[PlainJSONValue]
  @scala.inline
  implicit def apply(value: PlainJSONArray): PlainJSONValue = value.asInstanceOf[PlainJSONValue]
  @scala.inline
  implicit def apply(value: PlainJSONObject): PlainJSONValue = value.asInstanceOf[PlainJSONValue]
  @scala.inline
  implicit def apply(value: String): PlainJSONValue = value.asInstanceOf[PlainJSONValue]
}

