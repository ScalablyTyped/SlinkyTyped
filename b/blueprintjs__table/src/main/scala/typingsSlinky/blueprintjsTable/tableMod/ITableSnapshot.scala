package typingsSlinky.blueprintjsTable.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableSnapshot extends js.Object {
  var nextScrollLeft: js.UndefOr[Double] = js.native
  var nextScrollTop: js.UndefOr[Double] = js.native
}

object ITableSnapshot {
  @scala.inline
  def apply(): ITableSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableSnapshot]
  }
  @scala.inline
  implicit class ITableSnapshotOps[Self <: ITableSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withNextScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScrollTop")(js.undefined)
        ret
    }
  }
  
}

