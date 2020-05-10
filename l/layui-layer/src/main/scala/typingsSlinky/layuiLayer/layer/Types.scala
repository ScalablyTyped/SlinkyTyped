package typingsSlinky.layuiLayer.layer

import typingsSlinky.layuiLayer.layuiLayerNumbers.`0`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`1`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`2`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`3`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  /** 信息框 */
  var dialog: `0` = js.native
  /** iframe层 */
  var iframe: `2` = js.native
  /** 加载层 */
  var loading: `3` = js.native
  /** 页面层 */
  var page: `1` = js.native
  /** tips层 */
  var tips: `4` = js.native
}

object Types {
  @scala.inline
  def apply(dialog: `0`, iframe: `2`, loading: `3`, page: `1`, tips: `4`): Types = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialog(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframe(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTips(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tips")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

