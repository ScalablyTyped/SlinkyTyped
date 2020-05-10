package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnsTotalCount extends js.Object {
  /** To customize the totalCount text properties.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}

object ColumnsTotalCount {
  @scala.inline
  def apply(): ColumnsTotalCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnsTotalCount]
  }
  @scala.inline
  implicit class ColumnsTotalCountOps[Self <: ColumnsTotalCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

