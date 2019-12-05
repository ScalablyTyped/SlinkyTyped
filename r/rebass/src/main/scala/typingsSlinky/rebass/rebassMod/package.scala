package typingsSlinky.rebass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rebassMod {
  import typingsSlinky.atStyledDashSystemCss.atStyledDashSystemCssMod.ResponsiveStyleValue
  import typingsSlinky.atStyledDashSystemCss.atStyledDashSystemCssMod.SystemStyleObject
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Record

  // tslint:disable-next-line no-empty-interface
  type LinkKnownProps = BoxKnownProps
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type SxStyleProp = SystemStyleObject | (Record[
    String, 
    SystemStyleObject | (ResponsiveStyleValue[Double | String]) | (Record[String, SystemStyleObject | (ResponsiveStyleValue[Double | String])])
  ])
}
