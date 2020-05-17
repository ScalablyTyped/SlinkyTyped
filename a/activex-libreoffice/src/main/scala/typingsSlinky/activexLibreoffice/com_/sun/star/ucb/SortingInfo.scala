package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a sorting info. */
@js.native
trait SortingInfo extends js.Object {
  /** contains a flag indicating the sort mode (ascending or descending). */
  var Ascending: Boolean = js.native
  /** specifies the name of a property to use for sorting ( e.g. "Title" ). */
  var PropertyName: String = js.native
}

object SortingInfo {
  @scala.inline
  def apply(Ascending: Boolean, PropertyName: String): SortingInfo = {
    val __obj = js.Dynamic.literal(Ascending = Ascending.asInstanceOf[js.Any], PropertyName = PropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortingInfo]
  }
  @scala.inline
  implicit class SortingInfoOps[Self <: SortingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

