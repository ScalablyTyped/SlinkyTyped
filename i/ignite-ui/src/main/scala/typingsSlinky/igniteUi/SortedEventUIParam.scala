package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortedEventUIParam extends js.Object {
  /**
  	 * Gets an array of the tuple indices and sort directions that were actually applied to the table view.
  	 */
  var appliedSortDirections: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets an array of the tuple indices and sort directions that were passed to the table view.
  	 */
  var sortDirections: js.UndefOr[js.Array[_]] = js.native
}

object SortedEventUIParam {
  @scala.inline
  def apply(): SortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortedEventUIParam]
  }
  @scala.inline
  implicit class SortedEventUIParamOps[Self <: SortedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppliedSortDirections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedSortDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedSortDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedSortDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirections")(js.undefined)
        ret
    }
  }
  
}

