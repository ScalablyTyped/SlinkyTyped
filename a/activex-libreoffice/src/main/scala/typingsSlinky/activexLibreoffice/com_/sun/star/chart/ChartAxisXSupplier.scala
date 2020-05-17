package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** has to be supported by charts providing the capabilities of a horizontal axis, i.e., an **x** -axis. */
@js.native
trait ChartAxisXSupplier extends XAxisXSupplier {
  /**
    * This property determines if the x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasXAxis: Boolean = js.native
  /** Determines if the description of the x-axis is shown or hidden. */
  var HasXAxisDescription: Boolean = js.native
  /**
    * Determines if the major grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisGrid: Boolean = js.native
  /**
    * Determines if the minor grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisHelpGrid: Boolean = js.native
  /**
    * Determines if the title of the x-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasXAxisTitle: Boolean = js.native
}

object ChartAxisXSupplier {
  @scala.inline
  def apply(
    HasXAxis: Boolean,
    HasXAxisDescription: Boolean,
    HasXAxisGrid: Boolean,
    HasXAxisHelpGrid: Boolean,
    HasXAxisTitle: Boolean,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: () => Unit,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartAxisXSupplier = {
    val __obj = js.Dynamic.literal(HasXAxis = HasXAxis.asInstanceOf[js.Any], HasXAxisDescription = HasXAxisDescription.asInstanceOf[js.Any], HasXAxisGrid = HasXAxisGrid.asInstanceOf[js.Any], HasXAxisHelpGrid = HasXAxisHelpGrid.asInstanceOf[js.Any], HasXAxisTitle = HasXAxisTitle.asInstanceOf[js.Any], XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ChartAxisXSupplier]
  }
  @scala.inline
  implicit class ChartAxisXSupplierOps[Self <: ChartAxisXSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasXAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasXAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasXAxisDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasXAxisDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasXAxisGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasXAxisGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasXAxisHelpGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasXAxisHelpGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasXAxisTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasXAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

