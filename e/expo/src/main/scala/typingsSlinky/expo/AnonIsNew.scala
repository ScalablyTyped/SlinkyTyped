package typingsSlinky.expo

import typingsSlinky.expo.expoBooleans.`false`
import typingsSlinky.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsNew extends UpdateFetchResult {
  var isNew: `false` = js.native
}

object AnonIsNew {
  @scala.inline
  def apply(isNew: `false`): AnonIsNew = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsNew]
  }
  @scala.inline
  implicit class AnonIsNewOps[Self <: AnonIsNew] (val x: Self) extends AnyVal {
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

