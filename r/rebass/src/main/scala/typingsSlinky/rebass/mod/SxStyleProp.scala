package typingsSlinky.rebass.mod

import typingsSlinky.std.Record
import typingsSlinky.styledSystemCss.mod.ResponsiveStyleValue
import typingsSlinky.styledSystemCss.mod.SystemStyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styledSystemCss.mod.SystemStyleObject
  - typingsSlinky.std.Record[
java.lang.String, 
typingsSlinky.styledSystemCss.mod.SystemStyleObject | (typingsSlinky.styledSystemCss.mod.ResponsiveStyleValue[scala.Double | java.lang.String]) | (typingsSlinky.std.Record[
  java.lang.String, 
  typingsSlinky.styledSystemCss.mod.SystemStyleObject | (typingsSlinky.styledSystemCss.mod.ResponsiveStyleValue[scala.Double | java.lang.String])
])]
*/
trait SxStyleProp extends js.Object

object SxStyleProp {
  @scala.inline
  implicit def apply(
    value: Record[
      String, 
      SystemStyleObject | (ResponsiveStyleValue[Double | String]) | (Record[String, SystemStyleObject | (ResponsiveStyleValue[Double | String])])
    ]
  ): SxStyleProp = value.asInstanceOf[SxStyleProp]
  @scala.inline
  implicit def apply(value: SystemStyleObject): SxStyleProp = value.asInstanceOf[SxStyleProp]
}

