package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreConfigInfo extends js.Object {
  var configInfo: StringDictionary[js.Any] = js.native
}

object RestoreConfigInfo {
  @scala.inline
  def apply(configInfo: StringDictionary[js.Any]): RestoreConfigInfo = {
    val __obj = js.Dynamic.literal(configInfo = configInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreConfigInfo]
  }
  @scala.inline
  implicit class RestoreConfigInfoOps[Self <: RestoreConfigInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigInfo(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

