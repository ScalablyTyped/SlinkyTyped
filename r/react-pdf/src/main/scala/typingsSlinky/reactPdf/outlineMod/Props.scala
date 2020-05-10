package typingsSlinky.reactPdf.outlineMod

import typingsSlinky.pdfjsDist.mod.PDFTreeNode
import typingsSlinky.reactPdf.AnonPageNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Outline'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Function called when an outline item has been clicked.
    * Usually, you would like to use this callback to move the user wherever they requested to.
    */
  var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ AnonPageNumber, Unit]] = js.native
  /**
    * Function called in case of an error while retrieving the outline.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Function called when the outline is successfully retrieved.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* outline */ js.Array[PDFTreeNode], Unit]] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(value: /* hasPageNumber */ AnonPageNumber => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadSuccess(value: /* outline */ js.Array[PDFTreeNode] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadSuccess")(js.undefined)
        ret
    }
  }
  
}

