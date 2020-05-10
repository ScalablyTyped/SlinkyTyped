package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 按键类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
  */
@js.native
trait PlusKeyKeyType extends js.Object {
  /**
    * 设备“返回”按钮按键事件
    * 如果需要改变默认“返回”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"backbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var backbutton: js.UndefOr[String] = js.native
  /**
    * 键按下事件
    * 如果需要改变默认键按下的处理逻辑，则可通过plus.key.addEventListener来注册监听"keydown"事件。
    * 	可通过回调函数中KeyEvent对象的keyCode来获取按下的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keydown: js.UndefOr[String] = js.native
  /**
    * 键松开事件
    * 如果需要改变默认键松开的处理逻辑，则可通过plus.key.addEventListener来注册监听"keyup"事件。
    * 	可通过回调函数中KeyEvent对象的keyCode来获取松开的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyup: js.UndefOr[String] = js.native
  /**
    * 长按键事件
    * 如果需要改变默认长按键的处理逻辑，则可通过plus.key.addEventListener来注册监听"longpressed"事件。
    * 	长按键时会多次触发回调函数，通过回调函数中KeyEvent对象的keyCode来获取长按的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var longpressed: js.UndefOr[String] = js.native
  /**
    * 设备“菜单”按钮按键事件
    * 如果需要改变默认“菜单”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"menubutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var menubutton: js.UndefOr[String] = js.native
  /**
    * 设备“搜索”按钮按键事件
    * 如果需要改变默认“搜索”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"searchbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var searchbutton: js.UndefOr[String] = js.native
  /**
    * 设备“音量-”按钮按键事件
    * 如果需要改变默认“音量-”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"volumedownbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var volumedownbutton: js.UndefOr[String] = js.native
  /**
    * 设备“音量+”按钮按键事件
    * 如果需要改变默认“音量+”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"volumeupbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var volumeupbutton: js.UndefOr[String] = js.native
}

object PlusKeyKeyType {
  @scala.inline
  def apply(): PlusKeyKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusKeyKeyType]
  }
  @scala.inline
  implicit class PlusKeyKeyTypeOps[Self <: PlusKeyKeyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackbutton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backbutton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackbutton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backbutton")(js.undefined)
        ret
    }
    @scala.inline
    def withKeydown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.undefined)
        ret
    }
    @scala.inline
    def withLongpressed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongpressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpressed")(js.undefined)
        ret
    }
    @scala.inline
    def withMenubutton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menubutton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenubutton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menubutton")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchbutton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchbutton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchbutton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchbutton")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumedownbutton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumedownbutton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumedownbutton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumedownbutton")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeupbutton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeupbutton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeupbutton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeupbutton")(js.undefined)
        ret
    }
  }
  
}

