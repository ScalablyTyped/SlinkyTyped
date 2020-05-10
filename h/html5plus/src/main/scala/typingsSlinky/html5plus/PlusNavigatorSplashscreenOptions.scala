package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 更新应用启动界面要设置的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
@js.native
trait PlusNavigatorSplashscreenOptions extends js.Object {
  /**
    * 是否自动关闭启动界面
    * true表示应用启动后自动关闭启动界面，false表示应用启动后不自动关闭启动界面，需要在应用调用plus.navigator.closeSplashscreen()方法关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var autoclose: js.UndefOr[Boolean] = js.native
  /**
    * 是否自动关闭启动界面（WAP2APP应用）
    * 与autoclose属性值作用一致，仅在WAP2APP应用中有效。
    * 	不推荐设置此值，如果未设置会自动使用autoclose属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var autoclose_w2a: js.UndefOr[Boolean] = js.native
  /**
    * 启动界面延时关闭时间
    * 仅在设置为自动关闭启动界面时有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * 启动界面延时关闭时间（WAP2APP应用）
    * 与delay属性值作用一致，仅在WAP2APP应用中有效。
    * 	不推荐设置此值，如果未设置会自动使用delay属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var delay_w2a: js.UndefOr[Double] = js.native
  /**
    * 启动界面的图片路径
    * 仅支持本地文件路径，图片必须为png格式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var image: js.UndefOr[String] = js.native
}

object PlusNavigatorSplashscreenOptions {
  @scala.inline
  def apply(): PlusNavigatorSplashscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNavigatorSplashscreenOptions]
  }
  @scala.inline
  implicit class PlusNavigatorSplashscreenOptionsOps[Self <: PlusNavigatorSplashscreenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoclose_w2a(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose_w2a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose_w2a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose_w2a")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay_w2a(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay_w2a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay_w2a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay_w2a")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
  }
  
}

