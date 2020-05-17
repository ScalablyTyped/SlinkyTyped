package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The {@link XCustomShapeHandle} */
@js.native
trait XCustomShapeHandle extends XInterface {
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  val Position: Point = js.native
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  def getPosition(): Point = js.native
  /** is setting a new position for the handle */
  def setControllerPosition(aPoint: Point): Unit = js.native
}

object XCustomShapeHandle {
  @scala.inline
  def apply(
    Position: Point,
    acquire: () => Unit,
    getPosition: () => Point,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setControllerPosition: Point => Unit
  ): XCustomShapeHandle = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControllerPosition = js.Any.fromFunction1(setControllerPosition))
    __obj.asInstanceOf[XCustomShapeHandle]
  }
  @scala.inline
  implicit class XCustomShapeHandleOps[Self <: XCustomShapeHandle] (val x: Self) extends AnyVal {
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
    def withGetPosition(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetControllerPosition(value: Point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControllerPosition")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

