package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    *     不推荐设置此值，如果未设置会自动使用autoclose属性值。
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
    *     不推荐设置此值，如果未设置会自动使用delay属性值。
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    
    @scala.inline
    def setAutoclose_w2a(value: Boolean): Self = this.set("autoclose_w2a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoclose_w2a: Self = this.set("autoclose_w2a", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDelay_w2a(value: Double): Self = this.set("delay_w2a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay_w2a: Self = this.set("delay_w2a", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
