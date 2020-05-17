package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XText
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the text contents of a header or footer on a page.
  * @see com.sun.star.sheet.HeaderFooterContent
  * @see com.sun.star.sheet.TablePageStyle
  */
@js.native
trait XHeaderFooterContent extends XInterface {
  /**
    * returns the text which is printed in the center part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val CenterText: XText = js.native
  /**
    * returns the text which is printed in the left part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val LeftText: XText = js.native
  /**
    * returns the text which is printed in the right part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val RightText: XText = js.native
  /**
    * returns the text which is printed in the center part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getCenterText(): XText = js.native
  /**
    * returns the text which is printed in the left part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getLeftText(): XText = js.native
  /**
    * returns the text which is printed in the right part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getRightText(): XText = js.native
}

object XHeaderFooterContent {
  @scala.inline
  def apply(
    CenterText: XText,
    LeftText: XText,
    RightText: XText,
    acquire: () => Unit,
    getCenterText: () => XText,
    getLeftText: () => XText,
    getRightText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHeaderFooterContent = {
    val __obj = js.Dynamic.literal(CenterText = CenterText.asInstanceOf[js.Any], LeftText = LeftText.asInstanceOf[js.Any], RightText = RightText.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCenterText = js.Any.fromFunction0(getCenterText), getLeftText = js.Any.fromFunction0(getLeftText), getRightText = js.Any.fromFunction0(getRightText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHeaderFooterContent]
  }
  @scala.inline
  implicit class XHeaderFooterContentOps[Self <: XHeaderFooterContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterText(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CenterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftText(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightText(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCenterText(value: () => XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenterText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLeftText(value: () => XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeftText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRightText(value: () => XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRightText")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

