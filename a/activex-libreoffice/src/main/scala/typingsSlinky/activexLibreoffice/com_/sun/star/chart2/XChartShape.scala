package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** this interface is used for a wrapper of objects implementing the service {@link com.sun.star.drawing.Shape} */
@js.native
trait XChartShape extends XInterface {
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  var Position: Point = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} ??????????? deprecated */
  val ShapeType: String = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  var Size: typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def getPosition(): Point = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.beans.XPropertySet} */
  def getPropertyValue(PropertyName: String): js.Any = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} ??????????? deprecated */
  def getShapeType(): String = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def getSize(): Size = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def setPosition(aPosition: Point): Unit = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.beans.XPropertySet} */
  def setPropertyValue(aPropertyName: String, aValue: js.Any): Unit = js.native
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def setSize(aSize: Size): Unit = js.native
}

object XChartShape {
  @scala.inline
  def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    getPosition: () => Point,
    getPropertyValue: String => js.Any,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit
  ): XChartShape = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPosition = js.Any.fromFunction0(getPosition), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XChartShape]
  }
  @scala.inline
  implicit class XChartShapeOps[Self <: XChartShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShapeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPropertyValue(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetShapeType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShapeType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: Point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPropertyValue(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPropertyValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSize(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

