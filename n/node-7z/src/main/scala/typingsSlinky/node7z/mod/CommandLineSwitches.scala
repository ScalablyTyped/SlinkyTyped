package typingsSlinky.node7z.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options are mapped to the 7z program so there is no idea to define all possible types here
@js.native
trait CommandLineSwitches
  extends /* key */ StringDictionary[js.Any] {
  var raw: js.UndefOr[js.Array[String]] = js.native
}

object CommandLineSwitches {
  @scala.inline
  def apply(): CommandLineSwitches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandLineSwitches]
  }
  @scala.inline
  implicit class CommandLineSwitchesOps[Self <: CommandLineSwitches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}

