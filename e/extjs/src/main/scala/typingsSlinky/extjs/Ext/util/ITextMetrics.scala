package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextMetrics extends IBase {
  /** [Method] Binds this TextMetrics instance to a new element
  		* @param el String/HTMLElement/Ext.Element The element or its ID.
  		*/
  var bind: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Destroy this instance */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the measured height of the specified text
  		* @param text String The text to measure
  		* @returns Number height The height in pixels
  		*/
  var getHeight: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Double]] = js.native
  /** [Method] Returns the size of the specified text based on the internal element s style and width properties
  		* @param text String The text to measure
  		* @returns Object An object containing the text's size {width: (width), height: (height)}
  		*/
  var getSize: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the measured width of the specified text
  		* @param text String The text to measure
  		* @returns Number width The width in pixels
  		*/
  var getWidth: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Double]] = js.native
  /** [Method] Sets a fixed width on the internal measurement element
  		* @param width Number The width to set on the element
  		*/
  var setFixedWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.native
}

object ITextMetrics {
  @scala.inline
  def apply(): ITextMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextMetrics]
  }
  @scala.inline
  implicit class ITextMetricsOps[Self <: ITextMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: /* el */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeight(value: /* text */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSize(value: /* text */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidth(value: /* text */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFixedWidth(value: /* width */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFixedWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFixedWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFixedWidth")(js.undefined)
        ret
    }
  }
  
}

