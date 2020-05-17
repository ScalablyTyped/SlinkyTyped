package typingsSlinky.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascadeSaveOption extends js.Object {
  /** If `false`, nested objects will not be saved (default is `true`). */
  var cascadeSave: js.UndefOr[Boolean] = js.native
}

object CascadeSaveOption {
  @scala.inline
  def apply(): CascadeSaveOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascadeSaveOption]
  }
  @scala.inline
  implicit class CascadeSaveOptionOps[Self <: CascadeSaveOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCascadeSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascadeSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeSave")(js.undefined)
        ret
    }
  }
  
}

