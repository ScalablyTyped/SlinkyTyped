package typingsSlinky.expoConstants

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTool
  extends /* key */ StringDictionary[js.Any] {
  var tool: js.UndefOr[String] = js.native
}

object AnonTool {
  @scala.inline
  def apply(): AnonTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTool]
  }
  @scala.inline
  implicit class AnonToolOps[Self <: AnonTool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(js.undefined)
        ret
    }
  }
  
}

