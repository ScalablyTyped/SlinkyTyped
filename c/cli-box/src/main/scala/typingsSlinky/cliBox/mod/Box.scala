package typingsSlinky.cliBox.mod

import typingsSlinky.cliBox.anon.Fullscreen
import typingsSlinky.cliBox.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box extends js.Object {
  var options: Fullscreen = js.native
  var settings: Height = js.native
  def stringify(): String = js.native
}

object Box {
  @scala.inline
  def apply(options: Fullscreen, settings: Height, stringify: () => String): Box = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify))
    __obj.asInstanceOf[Box]
  }
  @scala.inline
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: Fullscreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringify(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

