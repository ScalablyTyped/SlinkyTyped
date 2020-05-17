package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GEHtmlBalloon extends GEAbstractBalloon {
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  def getBackgroundColor(): String = js.native
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  def getForegroundColor(): String = js.native
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  def setForegroundColor(foregroundColor: String): Unit = js.native
}

object GEHtmlBalloon {
  @scala.inline
  def apply(
    getBackgroundColor: () => String,
    getCloseButtonEnabled: () => Boolean,
    getFeature: () => KmlFeature,
    getForegroundColor: () => String,
    getId: () => String,
    getMaxHeight: () => Double,
    getMaxWidth: () => Double,
    getMinHeight: () => Double,
    getMinWidth: () => Double,
    setBackgroundColor: String => Unit,
    setCloseButtonEnabled: Boolean => Unit,
    setFeature: KmlFeature => Unit,
    setForegroundColor: String => Unit,
    setId: String => Unit,
    setMaxHeight: Double => Unit,
    setMaxWidth: Double => Unit,
    setMinHeight: Double => Unit,
    setMinWidth: Double => Unit
  ): GEHtmlBalloon = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction0(getBackgroundColor), getCloseButtonEnabled = js.Any.fromFunction0(getCloseButtonEnabled), getFeature = js.Any.fromFunction0(getFeature), getForegroundColor = js.Any.fromFunction0(getForegroundColor), getId = js.Any.fromFunction0(getId), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getMaxWidth = js.Any.fromFunction0(getMaxWidth), getMinHeight = js.Any.fromFunction0(getMinHeight), getMinWidth = js.Any.fromFunction0(getMinWidth), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setCloseButtonEnabled = js.Any.fromFunction1(setCloseButtonEnabled), setFeature = js.Any.fromFunction1(setFeature), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setId = js.Any.fromFunction1(setId), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setMaxWidth = js.Any.fromFunction1(setMaxWidth), setMinHeight = js.Any.fromFunction1(setMinHeight), setMinWidth = js.Any.fromFunction1(setMinWidth))
    __obj.asInstanceOf[GEHtmlBalloon]
  }
  @scala.inline
  implicit class GEHtmlBalloonOps[Self <: GEHtmlBalloon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBackgroundColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackgroundColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetForegroundColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForegroundColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBackgroundColor(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetForegroundColor(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForegroundColor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

