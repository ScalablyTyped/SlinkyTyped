package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  errMsg  :string} & baidu-app.swan.ExtConfig */
@js.native
trait errMsgstringExtConfig extends js.Object {
  /* 调用结果 */
  var errMsg: String = js.native
  /** 第三方平台自定义的数据 */
  var extConfig: js.Any = js.native
}

object errMsgstringExtConfig {
  @scala.inline
  def apply(errMsg: String, extConfig: js.Any): errMsgstringExtConfig = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[errMsgstringExtConfig]
  }
  @scala.inline
  implicit class errMsgstringExtConfigOps[Self <: errMsgstringExtConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

