package typingsSlinky.jestWatcher.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageData extends js.Object {
  var key: String = js.native
  var prompt: String = js.native
}

object UsageData {
  @scala.inline
  def apply(key: String, prompt: String): UsageData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageData]
  }
  @scala.inline
  implicit class UsageDataOps[Self <: UsageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

