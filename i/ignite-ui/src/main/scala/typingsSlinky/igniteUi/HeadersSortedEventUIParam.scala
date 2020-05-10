package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadersSortedEventUIParam extends js.Object {
  /**
  	 * Gets an array of the level names and sort directions that were actually applied to the table view.
  	 */
  var appliedLevelSortDirections: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets an array of the level names and sort directions that were used.
  	 */
  var levelSortDirections: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object HeadersSortedEventUIParam {
  @scala.inline
  def apply(): HeadersSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersSortedEventUIParam]
  }
  @scala.inline
  implicit class HeadersSortedEventUIParamOps[Self <: HeadersSortedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppliedLevelSortDirections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedLevelSortDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedLevelSortDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedLevelSortDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelSortDirections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelSortDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelSortDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelSortDirections")(js.undefined)
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
  }
  
}

