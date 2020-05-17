package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ChartToolTipController class.
  */
@js.native
trait ASPxClientToolTipController extends ASPxClientWebChartElement {
  /**
    * Gets a value that defines the position of an image within a tooltip.
    */
  var imagePosition: String = js.native
  /**
    * Gets a value that defines when tooltips should be invoked.
    */
  var openMode: String = js.native
  /**
    * Gets a value indicating whether an image should be shown in tooltips.
    */
  var showImage: Boolean = js.native
  /**
    * Gets a value indicating whether it is necessary to show text in tooltips.
    */
  var showText: Boolean = js.native
}

object ASPxClientToolTipController {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    imagePosition: String,
    openMode: String,
    showImage: Boolean,
    showText: Boolean
  ): ASPxClientToolTipController = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], imagePosition = imagePosition.asInstanceOf[js.Any], openMode = openMode.asInstanceOf[js.Any], showImage = showImage.asInstanceOf[js.Any], showText = showText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipController]
  }
  @scala.inline
  implicit class ASPxClientToolTipControllerOps[Self <: ASPxClientToolTipController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImagePosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

