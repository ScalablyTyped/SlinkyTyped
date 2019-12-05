package typingsSlinky.jestDashHasteDashMap

import typingsSlinky.jestDashHasteDashMap.buildTypesMod.InternalHasteMap
import typingsSlinky.jestDashHasteDashMap.jestDashHasteDashMapNumbers.`0`
import typingsSlinky.jestDashHasteDashMap.jestDashHasteDashMapNumbers.`1`
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var hasteMap: InternalHasteMap
  var removedFiles: Map[
    String, 
    js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
  ]
}

object Anon_0 {
  @scala.inline
  def apply(
    hasteMap: InternalHasteMap,
    removedFiles: Map[
      String, 
      js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
    ]
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(hasteMap = hasteMap.asInstanceOf[js.Any], removedFiles = removedFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_0]
  }
}

