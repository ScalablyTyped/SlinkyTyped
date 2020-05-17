package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper service for chart documents which supply a z-axis. */
@js.native
trait ChartAxisZSupplier extends XAxisZSupplier {
  /**
    * Determines if the z-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasZAxis: Boolean = js.native
  /** Determines if the description of the z-axis is shown or hidden. */
  var HasZAxisDescription: Boolean = js.native
  /**
    * Determines if the major grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisGrid: Boolean = js.native
  /**
    * Determines if the minor grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisHelpGrid: Boolean = js.native
  /**
    * Determines if the title of the z-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasZAxisTitle: Boolean = js.native
}

object ChartAxisZSupplier {
  @scala.inline
  def apply(
    HasZAxis: Boolean,
    HasZAxisDescription: Boolean,
    HasZAxisGrid: Boolean,
    HasZAxisHelpGrid: Boolean,
    HasZAxisTitle: Boolean,
    ZAxis: XPropertySet,
    ZAxisTitle: XShape,
    ZHelpGrid: XPropertySet,
    ZMainGrid: XPropertySet,
    acquire: () => Unit,
    getZAxis: () => XPropertySet,
    getZAxisTitle: () => XShape,
    getZHelpGrid: () => XPropertySet,
    getZMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartAxisZSupplier = {
    val __obj = js.Dynamic.literal(HasZAxis = HasZAxis.asInstanceOf[js.Any], HasZAxisDescription = HasZAxisDescription.asInstanceOf[js.Any], HasZAxisGrid = HasZAxisGrid.asInstanceOf[js.Any], HasZAxisHelpGrid = HasZAxisHelpGrid.asInstanceOf[js.Any], HasZAxisTitle = HasZAxisTitle.asInstanceOf[js.Any], ZAxis = ZAxis.asInstanceOf[js.Any], ZAxisTitle = ZAxisTitle.asInstanceOf[js.Any], ZHelpGrid = ZHelpGrid.asInstanceOf[js.Any], ZMainGrid = ZMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getZAxis = js.Any.fromFunction0(getZAxis), getZAxisTitle = js.Any.fromFunction0(getZAxisTitle), getZHelpGrid = js.Any.fromFunction0(getZHelpGrid), getZMainGrid = js.Any.fromFunction0(getZMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ChartAxisZSupplier]
  }
  @scala.inline
  implicit class ChartAxisZSupplierOps[Self <: ChartAxisZSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasZAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasZAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasZAxisDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasZAxisDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasZAxisGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasZAxisGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasZAxisHelpGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasZAxisHelpGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasZAxisTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasZAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

