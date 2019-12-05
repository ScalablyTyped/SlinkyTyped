package typingsSlinky.gulpDashResponsiveDashImages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashResponsiveDashImagesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.gulpDashRename.gulpDashRenameMod.Options
  import typingsSlinky.gulpDashRename.gulpDashRenameMod.ParsedPath

  type Matchers = StringDictionary[js.Array[Settings]]
  type Rename = String | (js.Function1[/* path */ ParsedPath, js.Any]) | Options
  type SamplingFactor = js.Tuple2[Double, Double]
}
