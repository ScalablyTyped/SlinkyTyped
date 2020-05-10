package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadersSortingEventUIParam extends js.Object {
  /**
  	 * Gets an array of the level names and sort directions that will be used.
  	 */
  var levelSortDirections: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object HeadersSortingEventUIParam {
  @scala.inline
  def apply(): HeadersSortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersSortingEventUIParam]
  }
  @scala.inline
  implicit class HeadersSortingEventUIParamOps[Self <: HeadersSortingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

