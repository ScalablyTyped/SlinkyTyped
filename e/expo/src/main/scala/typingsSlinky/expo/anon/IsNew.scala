package typingsSlinky.expo.anon

import typingsSlinky.expo.expoBooleans.`false`
import typingsSlinky.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsNew extends UpdateFetchResult {
  var isNew: `false` = js.native
}

object IsNew {
  @scala.inline
  def apply(isNew: `false`): IsNew = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNew]
  }
  @scala.inline
  implicit class IsNewOps[Self <: IsNew] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsNew(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

