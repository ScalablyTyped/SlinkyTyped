package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 *  返回上一个小程序(参数)
	 */
@js.native
trait navigateBackSmartProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要返回给上一个小程序的数据，上一个小程序可在
  		 * App.onLaunch()，App.onShow() 中获取到这份数据。
  		 */
  var extraData: js.UndefOr[js.Any] = js.native
}

object navigateBackSmartProgramOptions {
  @scala.inline
  def apply(): navigateBackSmartProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[navigateBackSmartProgramOptions]
  }
  @scala.inline
  implicit class navigateBackSmartProgramOptionsOps[Self <: navigateBackSmartProgramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(js.undefined)
        ret
    }
  }
  
}

