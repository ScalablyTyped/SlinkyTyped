package typingsSlinky.nodelibFsWalk.readerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reader extends js.Object {
  val _root: String = js.native
  val _settings: typingsSlinky.nodelibFsWalk.settingsMod.default = js.native
}

object Reader {
  @scala.inline
  def apply(_root: String, _settings: typingsSlinky.nodelibFsWalk.settingsMod.default): Reader = {
    val __obj = js.Dynamic.literal(_root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reader]
  }
  @scala.inline
  implicit class ReaderOps[Self <: Reader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_root(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_settings(value: typingsSlinky.nodelibFsWalk.settingsMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

