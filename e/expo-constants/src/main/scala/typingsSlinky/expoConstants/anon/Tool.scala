package typingsSlinky.expoConstants.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tool
  extends /* key */ StringDictionary[js.Any] {
  var tool: js.UndefOr[String] = js.native
}

object Tool {
  @scala.inline
  def apply(): Tool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tool]
  }
  @scala.inline
  implicit class ToolOps[Self <: Tool] (val x: Self) extends AnyVal {
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

