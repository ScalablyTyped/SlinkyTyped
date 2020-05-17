package typingsSlinky.esfxTypeModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoneBoolean extends js.Object {
  var done: Boolean = js.native
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ] = js.native
}

object DoneBoolean {
  @scala.inline
  def apply(done: Boolean): DoneBoolean = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneBoolean]
  }
  @scala.inline
  implicit class DoneBooleanOps[Self <: DoneBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

