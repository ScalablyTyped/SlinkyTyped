package typingsSlinky.pdfmake

import typingsSlinky.pdfmake.interfacesMod.PageOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHorizontalRatio extends js.Object {
  var horizontalRatio: Double = js.native
  var left: Double = js.native
  var pageInnerHeight: Double = js.native
  var pageInnerWidth: Double = js.native
  var pageNumber: Double = js.native
  var pageOrientation: PageOrientation = js.native
  var top: Double = js.native
  var verticalRatio: Double = js.native
}

object AnonHorizontalRatio {
  @scala.inline
  def apply(
    horizontalRatio: Double,
    left: Double,
    pageInnerHeight: Double,
    pageInnerWidth: Double,
    pageNumber: Double,
    pageOrientation: PageOrientation,
    top: Double,
    verticalRatio: Double
  ): AnonHorizontalRatio = {
    val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pageInnerHeight = pageInnerHeight.asInstanceOf[js.Any], pageInnerWidth = pageInnerWidth.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], verticalRatio = verticalRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHorizontalRatio]
  }
  @scala.inline
  implicit class AnonHorizontalRatioOps[Self <: AnonHorizontalRatio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageInnerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInnerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageInnerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInnerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageOrientation(value: PageOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalRatio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

