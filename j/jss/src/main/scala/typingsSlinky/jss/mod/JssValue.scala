package typingsSlinky.jss.mod

import typingsSlinky.jss.jssStrings.Exclamationmarkimportant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[
java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]) | typingsSlinky.jss.jssStrings.Exclamationmarkimportant]
  - scala.Null
  - typingsSlinky.jss.jssBooleans.`false`
*/
trait JssValue extends js.Object

object JssValue {
  @scala.inline
  def `false`: typingsSlinky.jss.jssBooleans.`false` = false.asInstanceOf[typingsSlinky.jss.jssBooleans.`false`]
  @scala.inline
  implicit def apply(value: js.Array[String | Double | (js.Array[String | Double]) | Exclamationmarkimportant]): JssValue = value.asInstanceOf[JssValue]
  @scala.inline
  implicit def apply(value: Double): JssValue = value.asInstanceOf[JssValue]
  @scala.inline
  implicit def apply(value: Null): JssValue = value.asInstanceOf[JssValue]
  @scala.inline
  implicit def apply(value: String): JssValue = value.asInstanceOf[JssValue]
}

