package typingsSlinky.filePathFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnyFilter = typingsSlinky.filePathFilter.typesMod.FilterCriteria | typingsSlinky.filePathFilter.anon.PartialFiltersFilterCrite
  type FilterCriteria = typingsSlinky.filePathFilter.typesMod.FilterCriterion | js.Array[typingsSlinky.filePathFilter.typesMod.FilterCriterion]
  type FilterCriterion = scala.Boolean | java.lang.String | js.RegExp | typingsSlinky.filePathFilter.typesMod.FilterFunction
  type FilterFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type MapFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
}
