package typingsSlinky.pgPromise.anon

import typingsSlinky.pgPromise.mod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CndMode extends js.Object {
  var cnd: js.UndefOr[js.Any] = js.native
  var mode: js.UndefOr[TransactionMode | Null] = js.native
  var tag: js.UndefOr[js.Any] = js.native
}

object CndMode {
  @scala.inline
  def apply(): CndMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CndMode]
  }
  @scala.inline
  implicit class CndModeOps[Self <: CndMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: TransactionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withModeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(null)
        ret
    }
    @scala.inline
    def withTag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

