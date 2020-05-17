package typingsSlinky.rollupPluginPostcss.anon

import typingsSlinky.rollupPluginPostcss.rollupPluginPostcssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertAt extends js.Object {
  var insertAt: js.UndefOr[top | String] = js.native
}

object InsertAt {
  @scala.inline
  def apply(): InsertAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertAt]
  }
  @scala.inline
  implicit class InsertAtOps[Self <: InsertAt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertAt(value: top | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAt")(js.undefined)
        ret
    }
  }
  
}

