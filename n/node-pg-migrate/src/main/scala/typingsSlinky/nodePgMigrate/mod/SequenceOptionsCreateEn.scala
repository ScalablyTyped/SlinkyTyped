package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceOptionsCreateEn extends js.Object {
  var ifNotExists: js.UndefOr[Boolean] = js.native
  var temporary: js.UndefOr[Boolean] = js.native
}

object SequenceOptionsCreateEn {
  @scala.inline
  def apply(): SequenceOptionsCreateEn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceOptionsCreateEn]
  }
  @scala.inline
  implicit class SequenceOptionsCreateEnOps[Self <: SequenceOptionsCreateEn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfNotExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfNotExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(js.undefined)
        ret
    }
  }
  
}

