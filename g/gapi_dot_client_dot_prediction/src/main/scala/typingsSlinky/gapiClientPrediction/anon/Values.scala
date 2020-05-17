package typingsSlinky.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Values extends js.Object {
  /** Number of categorical values for this feature in the data. */
  var count: js.UndefOr[String] = js.native
  /** List of all the categories for this feature in the data set. */
  var values: js.UndefOr[js.Array[Count]] = js.native
}

object Values {
  @scala.inline
  def apply(): Values = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Values]
  }
  @scala.inline
  implicit class ValuesOps[Self <: Values] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Count]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

