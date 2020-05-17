package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDataSeriesContainer extends XInterface {
  /** retrieve all data series */
  var DataSeries: SafeArray[XDataSeries] = js.native
  /**
    * add a data series to the data series container
    * @throws IllegalArgumentException If the given data series is already contained in the data series container.
    */
  def addDataSeries(aDataSeries: XDataSeries): Unit = js.native
  /** retrieve all data series */
  def getDataSeries(): SafeArray[XDataSeries] = js.native
  /** removes one data series from the data series container. */
  def removeDataSeries(aDataSeries: XDataSeries): Unit = js.native
  /** set all data series */
  def setDataSeries(aDataSeries: SeqEquiv[XDataSeries]): Unit = js.native
}

object XDataSeriesContainer {
  @scala.inline
  def apply(
    DataSeries: SafeArray[XDataSeries],
    acquire: () => Unit,
    addDataSeries: XDataSeries => Unit,
    getDataSeries: () => SafeArray[XDataSeries],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDataSeries: XDataSeries => Unit,
    setDataSeries: SeqEquiv[XDataSeries] => Unit
  ): XDataSeriesContainer = {
    val __obj = js.Dynamic.literal(DataSeries = DataSeries.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDataSeries = js.Any.fromFunction1(addDataSeries), getDataSeries = js.Any.fromFunction0(getDataSeries), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataSeries = js.Any.fromFunction1(removeDataSeries), setDataSeries = js.Any.fromFunction1(setDataSeries))
    __obj.asInstanceOf[XDataSeriesContainer]
  }
  @scala.inline
  implicit class XDataSeriesContainerOps[Self <: XDataSeriesContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSeries(value: SafeArray[XDataSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddDataSeries(value: XDataSeries => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDataSeries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDataSeries(value: () => SafeArray[XDataSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataSeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveDataSeries(value: XDataSeries => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDataSeries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDataSeries(value: SeqEquiv[XDataSeries] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataSeries")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

