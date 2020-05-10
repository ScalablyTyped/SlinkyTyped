package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Current sort status of a dataset column
			 */
@js.native
trait SortStatus extends js.Object {
  /**
  				 * The name of the column
  				 */
  var name: String = js.native
  /**
  				 * The current sort direction for the column.
  				 */
  var sortDirection: SortDirection = js.native
}

object SortStatus {
  @scala.inline
  def apply(name: String, sortDirection: SortDirection): SortStatus = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortStatus]
  }
  @scala.inline
  implicit class SortStatusOps[Self <: SortStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDirection(value: SortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

