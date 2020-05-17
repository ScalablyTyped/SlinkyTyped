package typingsSlinky.atomKeymap.mod.global.AtomKeymap.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeymapLoaded extends js.Object {
  /** The path of the keymap file. */
  var path: String = js.native
}

object KeymapLoaded {
  @scala.inline
  def apply(path: String): KeymapLoaded = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeymapLoaded]
  }
  @scala.inline
  implicit class KeymapLoadedOps[Self <: KeymapLoaded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

