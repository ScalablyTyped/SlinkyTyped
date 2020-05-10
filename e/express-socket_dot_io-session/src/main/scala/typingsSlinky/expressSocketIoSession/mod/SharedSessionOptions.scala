package typingsSlinky.expressSocketIoSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedSessionOptions extends js.Object {
  var autoSave: js.UndefOr[Boolean] = js.native
  var saveUninitialized: js.UndefOr[Boolean] = js.native
}

object SharedSessionOptions {
  @scala.inline
  def apply(): SharedSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedSessionOptions]
  }
  @scala.inline
  implicit class SharedSessionOptionsOps[Self <: SharedSessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveUninitialized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveUninitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveUninitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveUninitialized")(js.undefined)
        ret
    }
  }
  
}

