package typingsSlinky.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollEvent extends js.Object {
  val scrollHeight: Double = js.native
  val scrollHeightChanged: Boolean = js.native
  val scrollLeft: Double = js.native
  val scrollLeftChanged: Boolean = js.native
  val scrollTop: Double = js.native
  val scrollTopChanged: Boolean = js.native
  val scrollWidth: Double = js.native
  val scrollWidthChanged: Boolean = js.native
}

object IScrollEvent {
  @scala.inline
  def apply(
    scrollHeight: Double,
    scrollHeightChanged: Boolean,
    scrollLeft: Double,
    scrollLeftChanged: Boolean,
    scrollTop: Double,
    scrollTopChanged: Boolean,
    scrollWidth: Double,
    scrollWidthChanged: Boolean
  ): IScrollEvent = {
    val __obj = js.Dynamic.literal(scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollHeightChanged = scrollHeightChanged.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollLeftChanged = scrollLeftChanged.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollTopChanged = scrollTopChanged.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], scrollWidthChanged = scrollWidthChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollEvent]
  }
  @scala.inline
  implicit class IScrollEventOps[Self <: IScrollEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollHeightChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeightChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollLeftChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeftChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTopChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTopChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollWidthChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidthChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

