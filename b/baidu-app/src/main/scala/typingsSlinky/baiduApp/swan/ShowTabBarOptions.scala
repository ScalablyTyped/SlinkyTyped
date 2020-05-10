package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowTabBarOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否需要动画效果，默认无 */
  var aniamtion: js.UndefOr[Boolean] = js.native
}

object ShowTabBarOptions {
  @scala.inline
  def apply(): ShowTabBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowTabBarOptions]
  }
  @scala.inline
  implicit class ShowTabBarOptionsOps[Self <: ShowTabBarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAniamtion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aniamtion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAniamtion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aniamtion")(js.undefined)
        ret
    }
  }
  
}

