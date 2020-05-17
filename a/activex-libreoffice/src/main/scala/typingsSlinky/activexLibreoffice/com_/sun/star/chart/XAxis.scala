package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows easier access to the different subelements of an axis.
  * @since OOo 3.4
  */
@js.native
trait XAxis extends XInterface {
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  val AxisTitle: XPropertySet = js.native
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MajorGrid: XPropertySet = js.native
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MinorGrid: XPropertySet = js.native
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  def getAxisTitle(): XPropertySet = js.native
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMajorGrid(): XPropertySet = js.native
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMinorGrid(): XPropertySet = js.native
}

object XAxis {
  @scala.inline
  def apply(
    AxisTitle: XPropertySet,
    MajorGrid: XPropertySet,
    MinorGrid: XPropertySet,
    acquire: () => Unit,
    getAxisTitle: () => XPropertySet,
    getMajorGrid: () => XPropertySet,
    getMinorGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxis = {
    val __obj = js.Dynamic.literal(AxisTitle = AxisTitle.asInstanceOf[js.Any], MajorGrid = MajorGrid.asInstanceOf[js.Any], MinorGrid = MinorGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAxisTitle = js.Any.fromFunction0(getAxisTitle), getMajorGrid = js.Any.fromFunction0(getMajorGrid), getMinorGrid = js.Any.fromFunction0(getMinorGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxis]
  }
  @scala.inline
  implicit class XAxisOps[Self <: XAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisTitle(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorGrid(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorGrid(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAxisTitle(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxisTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMajorGrid(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMajorGrid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinorGrid(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinorGrid")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

