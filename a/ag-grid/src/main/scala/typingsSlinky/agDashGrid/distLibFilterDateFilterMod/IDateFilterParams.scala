package typingsSlinky.agDashGrid.distLibFilterDateFilterMod

import typingsSlinky.agDashGrid.distLibFilterBaseFilterMod.IComparableFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateFilterParams extends IComparableFilterParams {
  var browserDatePicker: js.UndefOr[Boolean] = js.native
  var comparator: js.UndefOr[IDateComparatorFunc] = js.native
}

