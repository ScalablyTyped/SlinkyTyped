package typingsSlinky.nodelibFsWalk.readerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reader extends js.Object {
  val _root: String
  val _settings: typingsSlinky.nodelibFsWalk.settingsMod.default
}

object Reader {
  @scala.inline
  def apply(_root: String, _settings: typingsSlinky.nodelibFsWalk.settingsMod.default): Reader = {
    val __obj = js.Dynamic.literal(_root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reader]
  }
}

