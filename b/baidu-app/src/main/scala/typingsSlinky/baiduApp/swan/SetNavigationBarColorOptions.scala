package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.Duration
import typingsSlinky.baiduApp.baiduAppStrings.Numbersign000000
import typingsSlinky.baiduApp.baiduAppStrings.Numbersignffffff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNavigationBarColorOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 动画效果
  		 */
  var animation: js.UndefOr[Duration] = js.native
  /**
  		 * 背景颜色值，有效值为十六进制颜色
  		 */
  var backgroundColor: String = js.native
  /**
  		 * 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
  		 */
  var frontColor: Numbersignffffff | Numbersign000000 = js.native
}

object SetNavigationBarColorOptions {
  @scala.inline
  def apply(backgroundColor: String, frontColor: Numbersignffffff | Numbersign000000): SetNavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarColorOptions]
  }
  @scala.inline
  implicit class SetNavigationBarColorOptionsOps[Self <: SetNavigationBarColorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrontColor(value: Numbersignffffff | Numbersign000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
  }
  
}

