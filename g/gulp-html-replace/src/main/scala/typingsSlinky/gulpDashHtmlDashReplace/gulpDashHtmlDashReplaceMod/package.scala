package typingsSlinky.gulpDashHtmlDashReplace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashHtmlDashReplaceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.NodeJS.ReadWriteStream

  type HtmlReplace = js.Function2[/* tasks */ Tasks, /* options */ js.UndefOr[Options], ReadWriteStream]
  type Tasks = StringDictionary[String | js.Array[String] | AdvancedTask]
}
