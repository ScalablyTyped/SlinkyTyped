package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XChartShapeContainer extends XInterface {
  val Shape: XShape = js.native
  /** a renderer creates ChartShapes and adds it to this container */
  def addShape(xShape: XShape): Unit = js.native
  def getShape(): XShape = js.native
  /** a renderer can remove ChartShapes from this container (e.g. if the visible range has changed) */
  def removeShape(xShape: XShape): Unit = js.native
}

object XChartShapeContainer {
  @scala.inline
  def apply(
    Shape: XShape,
    acquire: () => Unit,
    addShape: XShape => Unit,
    getShape: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeShape: XShape => Unit
  ): XChartShapeContainer = {
    val __obj = js.Dynamic.literal(Shape = Shape.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addShape = js.Any.fromFunction1(addShape), getShape = js.Any.fromFunction0(getShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeShape = js.Any.fromFunction1(removeShape))
    __obj.asInstanceOf[XChartShapeContainer]
  }
  @scala.inline
  implicit class XChartShapeContainerOps[Self <: XChartShapeContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShape(value: XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddShape(value: XShape => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addShape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetShape(value: () => XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveShape(value: XShape => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeShape")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

