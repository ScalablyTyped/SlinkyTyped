package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupExpandedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the jQuery object for the column being expanded (th).
  	 */
  var element: js.UndefOr[String] = js.native
  /**
  	 * Gets the reference to the GridMultiColumnHeaders widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object GroupExpandedEventUIParam {
  @scala.inline
  def apply(): GroupExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupExpandedEventUIParam]
  }
  @scala.inline
  implicit class GroupExpandedEventUIParamOps[Self <: GroupExpandedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
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

