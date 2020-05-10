package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowProperties extends js.Object {
  var minRowHeight: js.UndefOr[Dimension] = js.native
}

object TableRowProperties {
  @scala.inline
  def apply(): TableRowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowProperties]
  }
  @scala.inline
  implicit class TableRowPropertiesOps[Self <: TableRowProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinRowHeight(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowHeight")(js.undefined)
        ret
    }
  }
  
}

