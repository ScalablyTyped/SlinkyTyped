package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View控件动画参数
  * 指定动画的类型、持续时间等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjViewAnimationOptions extends js.Object {
  /**
    * 动画持续时间
    * 单位为毫秒，默认值为200ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * 动画帧数
    * 必须为大于0的整数，默认值为12。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var frames: js.UndefOr[Double] = js.native
  /**
    * 动画作用区域
    * 支持以下属性：
    * 	top - 区域距离控件顶部的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的高度）,默认值为'0px'；
    * 	bottom - 区域距离控件底部的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的高度）,默认值为'0px'；
    * 	left - 区域距离控件左侧的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的宽度）,默认值为'0px'；
    * 	right - 区域距离控件右侧的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的宽度）,默认值为'0px'。
    * 	如“{top:'44px',bottom:'48px'}”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var region: js.UndefOr[PlusNativeObjRect] = js.native
  /**
    * 动画类型
    * 可取值："shrink" - 从上到下分块收缩清除窗口动画。
    * - shrink: 从上到下分块清除动画
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var `type`: js.UndefOr[shrink] = js.native
}

object PlusNativeObjViewAnimationOptions {
  @scala.inline
  def apply(): PlusNativeObjViewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjViewAnimationOptions]
  }
  @scala.inline
  implicit class PlusNativeObjViewAnimationOptionsOps[Self <: PlusNativeObjViewAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: PlusNativeObjRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: shrink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

