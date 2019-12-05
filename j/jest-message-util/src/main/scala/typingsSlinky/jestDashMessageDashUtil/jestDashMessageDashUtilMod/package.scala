package typingsSlinky.jestDashMessageDashUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashMessageDashUtilMod {
  import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
  import typingsSlinky.jestDashMessageDashUtil.jestDashMessageDashUtilStrings.rootDir
  import typingsSlinky.jestDashMessageDashUtil.jestDashMessageDashUtilStrings.testMatch
  import typingsSlinky.std.Pick

  type StackTraceConfig = Pick[ProjectConfig, rootDir | testMatch]
}
