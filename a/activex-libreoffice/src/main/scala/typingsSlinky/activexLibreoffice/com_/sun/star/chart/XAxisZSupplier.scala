package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **z** -axis of a chart.
  * @see XDiagram
  */
@js.native
trait XAxisZSupplier extends XInterface {
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val ZAxis: XPropertySet = js.native
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  val ZAxisTitle: XShape = js.native
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZHelpGrid: XPropertySet = js.native
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZMainGrid: XPropertySet = js.native
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getZAxis(): XPropertySet = js.native
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  def getZAxisTitle(): XShape = js.native
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZHelpGrid(): XPropertySet = js.native
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZMainGrid(): XPropertySet = js.native
}

object XAxisZSupplier {
  @scala.inline
  def apply(
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
  ): XAxisZSupplier = {
    val __obj = js.Dynamic.literal(ZAxis = ZAxis.asInstanceOf[js.Any], ZAxisTitle = ZAxisTitle.asInstanceOf[js.Any], ZHelpGrid = ZHelpGrid.asInstanceOf[js.Any], ZMainGrid = ZMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getZAxis = js.Any.fromFunction0(getZAxis), getZAxisTitle = js.Any.fromFunction0(getZAxisTitle), getZHelpGrid = js.Any.fromFunction0(getZHelpGrid), getZMainGrid = js.Any.fromFunction0(getZMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisZSupplier]
  }
  @scala.inline
  implicit class XAxisZSupplierOps[Self <: XAxisZSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZAxis(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZAxisTitle(value: XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZHelpGrid(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZHelpGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZMainGrid(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZMainGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetZAxis(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetZAxisTitle(value: () => XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZAxisTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetZHelpGrid(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZHelpGrid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetZMainGrid(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZMainGrid")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

