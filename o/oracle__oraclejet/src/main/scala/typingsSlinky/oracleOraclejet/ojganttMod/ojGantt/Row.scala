package typingsSlinky.oracleOraclejet.ojganttMod.ojGantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait Row[K2] extends js.Object {
  var id: js.UndefOr[js.Any] = js.native
  var label: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[js.Object] = js.native
  var tasks: js.UndefOr[js.Array[RowTask[K2]]] = js.native
}

object Row {
  @scala.inline
  def apply[K2](): Row[K2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row[K2]]
  }
  @scala.inline
  implicit class RowOps[Self[k2] <: Row[k2], K2] (val x: Self[K2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K2] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K2] with Other]
    @scala.inline
    def withId(value: js.Any): Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTasks(value: js.Array[RowTask[K2]]): Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasks: Self[K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(js.undefined)
        ret
    }
  }
  
}

