package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
@js.native
trait EnableDebugOptions
  extends BaseOptions[js.Any, js.Any] {
  var enableDebug: Boolean = js.native
}

object EnableDebugOptions {
  @scala.inline
  def apply(enableDebug: Boolean): EnableDebugOptions = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDebugOptions]
  }
  @scala.inline
  implicit class EnableDebugOptionsOps[Self <: EnableDebugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

