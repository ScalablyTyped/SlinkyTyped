package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method getData().
  * @since OOo 3.4
  */
@js.native
trait XDateCategories extends js.Object {
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  var DateCategories: SafeArray[Double] = js.native
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  def getDateCategories(): SafeArray[Double] = js.native
  /**
    * sets dates as categories
    * @param rDates a sequence of sequences of doubles representing dates.
    */
  def setDateCategories(rDates: SeqEquiv[Double]): Unit = js.native
}

object XDateCategories {
  @scala.inline
  def apply(
    DateCategories: SafeArray[Double],
    getDateCategories: () => SafeArray[Double],
    setDateCategories: SeqEquiv[Double] => Unit
  ): XDateCategories = {
    val __obj = js.Dynamic.literal(DateCategories = DateCategories.asInstanceOf[js.Any], getDateCategories = js.Any.fromFunction0(getDateCategories), setDateCategories = js.Any.fromFunction1(setDateCategories))
    __obj.asInstanceOf[XDateCategories]
  }
  @scala.inline
  implicit class XDateCategoriesOps[Self <: XDateCategories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateCategories(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDateCategories(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateCategories")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDateCategories(value: SeqEquiv[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateCategories")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

