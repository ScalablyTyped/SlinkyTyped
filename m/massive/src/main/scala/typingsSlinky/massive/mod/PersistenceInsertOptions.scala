package typingsSlinky.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistenceInsertOptions extends js.Object {
  var deepInsert: js.UndefOr[Boolean] = js.native
  var onConflictIgnore: js.UndefOr[Boolean] = js.native
}

object PersistenceInsertOptions {
  @scala.inline
  def apply(): PersistenceInsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceInsertOptions]
  }
  @scala.inline
  implicit class PersistenceInsertOptionsOps[Self <: PersistenceInsertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeepInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConflictIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConflictIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnConflictIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConflictIgnore")(js.undefined)
        ret
    }
  }
  
}

