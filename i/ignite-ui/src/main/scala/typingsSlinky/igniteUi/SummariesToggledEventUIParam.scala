package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummariesToggledEventUIParam extends js.Object {
  /**
  	 * Gets whether summaries are shown or not.
  	 */
  var isToShow: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the igGridSummaries widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object SummariesToggledEventUIParam {
  @scala.inline
  def apply(): SummariesToggledEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesToggledEventUIParam]
  }
  @scala.inline
  implicit class SummariesToggledEventUIParamOps[Self <: SummariesToggledEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsToShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsToShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

