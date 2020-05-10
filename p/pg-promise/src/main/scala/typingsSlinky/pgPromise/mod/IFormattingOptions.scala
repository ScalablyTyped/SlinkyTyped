package typingsSlinky.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormattingOptions extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.native
  var `def`: js.UndefOr[js.Any] = js.native
  var partial: js.UndefOr[Boolean] = js.native
}

object IFormattingOptions {
  @scala.inline
  def apply(): IFormattingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormattingOptions]
  }
  @scala.inline
  implicit class IFormattingOptionsOps[Self <: IFormattingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapSQL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capSQL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapSQL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capSQL")(js.undefined)
        ret
    }
    @scala.inline
    def withDef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(js.undefined)
        ret
    }
    @scala.inline
    def withPartial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(js.undefined)
        ret
    }
  }
  
}

