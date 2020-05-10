package typingsSlinky.deoxxaContentType.ContentType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectOptions extends js.Object {
  var sortAccepted: js.UndefOr[Boolean] = js.native
  var sortAvailable: js.UndefOr[Boolean] = js.native
}

object SelectOptions {
  @scala.inline
  def apply(): SelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectOptions]
  }
  @scala.inline
  implicit class SelectOptionsOps[Self <: SelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSortAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAccepted")(js.undefined)
        ret
    }
    @scala.inline
    def withSortAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAvailable")(js.undefined)
        ret
    }
  }
  
}

