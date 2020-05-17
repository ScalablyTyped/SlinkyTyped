package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - scala.Boolean
  - scala.Null
  - typingsSlinky.puppeteer.mod.JSONArray
  - typingsSlinky.puppeteer.mod.JSONObject
*/
trait Serializable extends SerializableOrJSHandle

object Serializable {
  @scala.inline
  implicit def apply(value: Boolean): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: Double): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: JSONArray): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: JSONObject): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: Null): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: String): Serializable = value.asInstanceOf[Serializable]
}

