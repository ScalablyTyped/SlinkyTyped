package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to retrieve information about controller's border. */
@js.native
trait XControllerBorder extends XInterface {
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  val Border: BorderWidths = js.native
  /** adds the specified listener to receive events about controller's border resizing. */
  def addBorderResizeListener(xListener: XBorderResizeListener): Unit = js.native
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  def getBorder(): BorderWidths = js.native
  /**
    * allows to get suggestion for resizing of object area surrounded by the border.
    *
    * If the view is going to be resized/moved this method can be used to get suggested object area. Pixels are used as units.
    * @returns suggestion for the resizing
    */
  def queryBorderedArea(aPreliminaryRectangle: Rectangle): Rectangle = js.native
  /** removes the specified listener. */
  def removeBorderResizeListener(xListener: XBorderResizeListener): Unit = js.native
}

object XControllerBorder {
  @scala.inline
  def apply(
    Border: BorderWidths,
    acquire: () => Unit,
    addBorderResizeListener: XBorderResizeListener => Unit,
    getBorder: () => BorderWidths,
    queryBorderedArea: Rectangle => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeBorderResizeListener: XBorderResizeListener => Unit
  ): XControllerBorder = {
    val __obj = js.Dynamic.literal(Border = Border.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addBorderResizeListener = js.Any.fromFunction1(addBorderResizeListener), getBorder = js.Any.fromFunction0(getBorder), queryBorderedArea = js.Any.fromFunction1(queryBorderedArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBorderResizeListener = js.Any.fromFunction1(removeBorderResizeListener))
    __obj.asInstanceOf[XControllerBorder]
  }
  @scala.inline
  implicit class XControllerBorderOps[Self <: XControllerBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: BorderWidths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddBorderResizeListener(value: XBorderResizeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBorderResizeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBorder(value: () => BorderWidths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryBorderedArea(value: Rectangle => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBorderedArea")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveBorderResizeListener(value: XBorderResizeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBorderResizeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

