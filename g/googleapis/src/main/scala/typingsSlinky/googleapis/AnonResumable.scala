package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResumable extends js.Object {
  var resumable: js.UndefOr[AnonMultipart] = js.native
  var simple: js.UndefOr[AnonMultipart] = js.native
}

object AnonResumable {
  @scala.inline
  def apply(): AnonResumable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonResumable]
  }
  @scala.inline
  implicit class AnonResumableOps[Self <: AnonResumable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResumable(value: AnonMultipart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumable")(js.undefined)
        ret
    }
    @scala.inline
    def withSimple(value: AnonMultipart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(js.undefined)
        ret
    }
  }
  
}

