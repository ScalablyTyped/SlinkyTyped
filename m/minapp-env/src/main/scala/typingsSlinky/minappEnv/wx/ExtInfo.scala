package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtInfo extends js.Object {
  /** 第三方平台自定义的数据 */
  var extConfig: js.Object = js.native
}

object ExtInfo {
  @scala.inline
  def apply(extConfig: js.Object): ExtInfo = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtInfo]
  }
  @scala.inline
  implicit class ExtInfoOps[Self <: ExtInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

