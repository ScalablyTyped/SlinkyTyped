package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.moment.mod.Moment
  - typingsSlinky.moment.mod.Duration_
  - js.Array[java.lang.String]
  - scala.Boolean
*/
trait LocaleSpecifier extends js.Object

object LocaleSpecifier {
  @scala.inline
  implicit def apply(value: js.Array[String]): LocaleSpecifier = value.asInstanceOf[LocaleSpecifier]
  @scala.inline
  implicit def apply(value: Boolean): LocaleSpecifier = value.asInstanceOf[LocaleSpecifier]
  @scala.inline
  implicit def apply(value: Duration_): LocaleSpecifier = value.asInstanceOf[LocaleSpecifier]
  @scala.inline
  implicit def apply(value: Moment): LocaleSpecifier = value.asInstanceOf[LocaleSpecifier]
  @scala.inline
  implicit def apply(value: String): LocaleSpecifier = value.asInstanceOf[LocaleSpecifier]
}

