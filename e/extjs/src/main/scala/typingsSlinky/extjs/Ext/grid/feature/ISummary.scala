package typingsSlinky.extjs.Ext.grid.feature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISummary extends IAbstractSummary {
  /** [Config Option] (String) */
  var dock: js.UndefOr[String] = js.native
}

object ISummary {
  @scala.inline
  def apply(): ISummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISummary]
  }
  @scala.inline
  implicit class ISummaryOps[Self <: ISummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(js.undefined)
        ret
    }
  }
  
}

