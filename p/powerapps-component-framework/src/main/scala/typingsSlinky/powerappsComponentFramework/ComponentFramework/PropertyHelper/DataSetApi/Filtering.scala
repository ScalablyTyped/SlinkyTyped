package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Filter state for a dataset.
			 */
@js.native
trait Filtering extends js.Object {
  /**
  				 * Clears the filter associated with the data-set.
  				 */
  def clearFilter(): Unit = js.native
  /**
  				 * Returns the top-most filter associated with the data-set
  				 */
  def getFilter(): FilterExpression = js.native
  /**
  				 * Sets the top-most filter associated with the data-set
  				 * @expression filter expression to be set
  				 */
  def setFilter(expression: FilterExpression): Unit = js.native
}

object Filtering {
  @scala.inline
  def apply(clearFilter: () => Unit, getFilter: () => FilterExpression, setFilter: FilterExpression => Unit): Filtering = {
    val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), getFilter = js.Any.fromFunction0(getFilter), setFilter = js.Any.fromFunction1(setFilter))
    __obj.asInstanceOf[Filtering]
  }
  @scala.inline
  implicit class FilteringOps[Self <: Filtering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearFilter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilter(value: () => FilterExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFilter(value: FilterExpression => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

