package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **x** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying an **x** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
@js.native
trait XAxisXSupplier extends XInterface {
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val XAxis: XPropertySet = js.native
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  val XAxisTitle: XShape = js.native
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XHelpGrid: XPropertySet = js.native
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XMainGrid: XPropertySet = js.native
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getXAxis(): XPropertySet = js.native
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  def getXAxisTitle(): XShape = js.native
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXHelpGrid(): XPropertySet = js.native
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXMainGrid(): XPropertySet = js.native
}

object XAxisXSupplier {
  @scala.inline
  def apply(
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
  ): XAxisXSupplier = {
    val __obj = js.Dynamic.literal(XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisXSupplier]
  }
  @scala.inline
  implicit class XAxisXSupplierOps[Self <: XAxisXSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXAxis(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXAxisTitle(value: XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXHelpGrid(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XHelpGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMainGrid(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMainGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetXAxis(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetXAxisTitle(value: () => XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXAxisTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetXHelpGrid(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXHelpGrid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetXMainGrid(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXMainGrid")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

