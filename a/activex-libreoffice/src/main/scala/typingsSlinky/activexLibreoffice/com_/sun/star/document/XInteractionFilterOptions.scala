package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A continuation to return filter options from interaction helper.
  * @since OOo 1.1.2
  */
@js.native
trait XInteractionFilterOptions extends XInteractionContinuation {
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  var FilterOptions: SafeArray[PropertyValue] = js.native
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  def getFilterOptions(): SafeArray[PropertyValue] = js.native
  /**
    * Store results to the continuation.
    * @param rProperties the list of properties containing filter options.
    */
  def setFilterOptions(rProperties: SeqEquiv[PropertyValue]): Unit = js.native
}

object XInteractionFilterOptions {
  @scala.inline
  def apply(
    FilterOptions: SafeArray[PropertyValue],
    acquire: () => Unit,
    getFilterOptions: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setFilterOptions: SeqEquiv[PropertyValue] => Unit
  ): XInteractionFilterOptions = {
    val __obj = js.Dynamic.literal(FilterOptions = FilterOptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilterOptions = js.Any.fromFunction0(getFilterOptions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setFilterOptions = js.Any.fromFunction1(setFilterOptions))
    __obj.asInstanceOf[XInteractionFilterOptions]
  }
  @scala.inline
  implicit class XInteractionFilterOptionsOps[Self <: XInteractionFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterOptions(value: SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFilterOptions(value: () => SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFilterOptions(value: SeqEquiv[PropertyValue] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

