package typingsSlinky.mixpanel.Mixpanel

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Element
  - js.Array[typingsSlinky.std.Element]
*/
trait Query extends js.Object

object Query {
  @scala.inline
  implicit def apply(value: js.Array[Element]): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: Element): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: String): Query = value.asInstanceOf[Query]
}

