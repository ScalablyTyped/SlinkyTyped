package typingsSlinky.rebass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // tslint:disable-next-line no-empty-interface
  type LinkKnownProps = typingsSlinky.rebass.mod.BoxKnownProps
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  type SxStyleProp = typingsSlinky.styledSystemCss.mod.SystemStyleObject | (typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.styledSystemCss.mod.SystemStyleObject | (typingsSlinky.styledSystemCss.mod.ResponsiveStyleValue[scala.Double | java.lang.String]) | (typingsSlinky.std.Record[
      java.lang.String, 
      typingsSlinky.styledSystemCss.mod.SystemStyleObject | (typingsSlinky.styledSystemCss.mod.ResponsiveStyleValue[scala.Double | java.lang.String])
    ])
  ])
}
