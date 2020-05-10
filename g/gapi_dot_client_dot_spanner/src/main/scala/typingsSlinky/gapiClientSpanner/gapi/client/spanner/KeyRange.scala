package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRange extends js.Object {
  /**
    * If the end is closed, then the range includes all rows whose
    * first `len(end_closed)` key columns exactly match `end_closed`.
    */
  var endClosed: js.UndefOr[js.Array[_]] = js.native
  /**
    * If the end is open, then the range excludes rows whose first
    * `len(end_open)` key columns exactly match `end_open`.
    */
  var endOpen: js.UndefOr[js.Array[_]] = js.native
  /**
    * If the start is closed, then the range includes all rows whose
    * first `len(start_closed)` key columns exactly match `start_closed`.
    */
  var startClosed: js.UndefOr[js.Array[_]] = js.native
  /**
    * If the start is open, then the range excludes rows whose first
    * `len(start_open)` key columns exactly match `start_open`.
    */
  var startOpen: js.UndefOr[js.Array[_]] = js.native
}

object KeyRange {
  @scala.inline
  def apply(): KeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRange]
  }
  @scala.inline
  implicit class KeyRangeOps[Self <: KeyRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndClosed(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOpen(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withStartClosed(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOpen(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(js.undefined)
        ret
    }
  }
  
}

