package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View控件事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjViewEvents extends js.Object {
  /**
    * 点击事件
    * 当手指点击屏幕时触发。
    * 	注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var click: js.UndefOr[String] = js.native
  /**
    * 双击事件
    * 双击屏幕时触发。
    * 	注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var doubleclick: js.UndefOr[String] = js.native
  /**
    * 结束触屏事件
    * 当手指从屏幕上离开的时候触发。
    * 	注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchend: js.UndefOr[String] = js.native
  /**
    * 触摸滑屏事件
    * 当手指在屏幕上滑动的时候连续地触发。
    * 	注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchmove: js.UndefOr[String] = js.native
  /**
    * 开始触屏事件
    * 当手指触摸屏幕时候触发。
    * 	注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchstart: js.UndefOr[String] = js.native
}

object PlusNativeObjViewEvents {
  @scala.inline
  def apply(): PlusNativeObjViewEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjViewEvents]
  }
  @scala.inline
  implicit class PlusNativeObjViewEventsOps[Self <: PlusNativeObjViewEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleclick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleclick")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchmove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchmove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchstart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(js.undefined)
        ret
    }
  }
  
}

