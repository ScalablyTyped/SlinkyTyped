package typingsSlinky.ionicCore.contentInterfaceMod

import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ionicCore.gestureMod.GestureDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollDetail
  extends GestureDetail
     with ScrollBaseDetail {
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
}

object ScrollDetail {
  @scala.inline
  def apply(
    currentX: Double,
    currentY: Double,
    deltaX: Double,
    deltaY: Double,
    event: UIEvent,
    isScrolling: Boolean,
    scrollLeft: Double,
    scrollTop: Double,
    startTimeStamp: Double,
    startX: Double,
    startY: Double,
    timeStamp: Double,
    `type`: String,
    velocityX: Double,
    velocityY: Double
  ): ScrollDetail = {
    val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], startTimeStamp = startTimeStamp.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollDetail]
  }
  @scala.inline
  implicit class ScrollDetailOps[Self <: ScrollDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

