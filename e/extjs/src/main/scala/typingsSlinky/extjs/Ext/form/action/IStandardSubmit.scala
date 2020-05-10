package typingsSlinky.extjs.Ext.form.action

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStandardSubmit extends ISubmit {
  /** [Config Option] (String) */
  var target: js.UndefOr[String] = js.native
}

object IStandardSubmit {
  @scala.inline
  def apply(): IStandardSubmit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStandardSubmit]
  }
  @scala.inline
  implicit class IStandardSubmitOps[Self <: IStandardSubmit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

