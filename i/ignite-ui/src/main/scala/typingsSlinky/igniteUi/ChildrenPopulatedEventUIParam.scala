package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenPopulatedEventUIParam extends js.Object {
  /**
  	 * Gets the data ID of the row.
  	 */
  var id: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets access the hierarchical grid object.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets access the row element for the row that was populated.
  	 */
  var parentrow: js.UndefOr[String] = js.native
}

object ChildrenPopulatedEventUIParam {
  @scala.inline
  def apply(): ChildrenPopulatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenPopulatedEventUIParam]
  }
  @scala.inline
  implicit class ChildrenPopulatedEventUIParamOps[Self <: ChildrenPopulatedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withParentrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentrow")(js.undefined)
        ret
    }
  }
  
}

