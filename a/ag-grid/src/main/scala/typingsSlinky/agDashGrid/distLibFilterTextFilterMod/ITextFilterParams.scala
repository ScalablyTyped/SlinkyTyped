package typingsSlinky.agDashGrid.distLibFilterTextFilterMod

import typingsSlinky.agDashGrid.distLibFilterBaseFilterMod.IComparableFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFilterParams extends IComparableFilterParams {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var debounceMs: js.UndefOr[Double] = js.native
  var textCustomComparator: js.UndefOr[TextComparator] = js.native
}

