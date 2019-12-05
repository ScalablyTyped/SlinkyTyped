package typingsSlinky.fileDashPathDashFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typingsSlinky.std.Partial

  type AnyFilter = FilterCriteria | Partial[Filters[FilterCriteria]]
  type FilterCriteria = FilterCriterion | js.Array[FilterCriterion]
  type FilterCriterion = Boolean | String | js.RegExp | FilterFunction
  type FilterFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type MapFunction = js.Function1[/* repeated */ js.Any, String]
}
