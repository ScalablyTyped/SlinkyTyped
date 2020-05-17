package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a method to access a collection of charts in a table or spreadsheet. */
@js.native
trait XTableChartsSupplier extends XInterface {
  /**
    * returns the collection of charts.
    * @see com.sun.star.table.TableCharts
    */
  val Charts: XTableCharts = js.native
  /**
    * returns the collection of charts.
    * @see com.sun.star.table.TableCharts
    */
  def getCharts(): XTableCharts = js.native
}

object XTableChartsSupplier {
  @scala.inline
  def apply(
    Charts: XTableCharts,
    acquire: () => Unit,
    getCharts: () => XTableCharts,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTableChartsSupplier = {
    val __obj = js.Dynamic.literal(Charts = Charts.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCharts = js.Any.fromFunction0(getCharts), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTableChartsSupplier]
  }
  @scala.inline
  implicit class XTableChartsSupplierOps[Self <: XTableChartsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharts(value: XTableCharts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Charts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCharts(value: () => XTableCharts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharts")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

