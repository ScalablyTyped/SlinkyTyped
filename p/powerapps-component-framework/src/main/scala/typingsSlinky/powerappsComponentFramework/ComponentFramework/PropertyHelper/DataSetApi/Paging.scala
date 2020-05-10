package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Paging state for a dataset
			 */
@js.native
trait Paging extends js.Object {
  /**
  				 * Whether the result set can be paged forwards.
  				 */
  var hasNextPage: Boolean = js.native
  /**
  				 * Whether the result set can be paged backwards.
  				 */
  var hasPreviousPage: Boolean = js.native
  /**
  				 * Total number of results on the server for the current query.
  				 */
  var totalResultCount: Double = js.native
  /**
  				 * Request the next page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
  				 */
  def loadNextPage(): Unit = js.native
  /**
  				 * Request the previous page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
  				 */
  def loadPreviousPage(): Unit = js.native
  /**
  				 * Reload the results from the server, and reset to page 1.
  				 */
  def reset(): Unit = js.native
  /**
  				 * Sets the number of results to return per page on the next data refresh.
  				 * @pageSize pageSize to be set.
  				 */
  def setPageSize(pageSize: Double): Unit = js.native
}

object Paging {
  @scala.inline
  def apply(
    hasNextPage: Boolean,
    hasPreviousPage: Boolean,
    loadNextPage: () => Unit,
    loadPreviousPage: () => Unit,
    reset: () => Unit,
    setPageSize: Double => Unit,
    totalResultCount: Double
  ): Paging = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any], loadNextPage = js.Any.fromFunction0(loadNextPage), loadPreviousPage = js.Any.fromFunction0(loadPreviousPage), reset = js.Any.fromFunction0(reset), setPageSize = js.Any.fromFunction1(setPageSize), totalResultCount = totalResultCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paging]
  }
  @scala.inline
  implicit class PagingOps[Self <: Paging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNextPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPreviousPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPreviousPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadNextPage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadNextPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadPreviousPage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPreviousPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPageSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTotalResultCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResultCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

