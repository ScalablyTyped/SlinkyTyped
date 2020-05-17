package typingsSlinky.bson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relaxed extends js.Object {
  var relaxed: js.UndefOr[Boolean] = js.native
}

object Relaxed {
  @scala.inline
  def apply(): Relaxed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relaxed]
  }
  @scala.inline
  implicit class RelaxedOps[Self <: Relaxed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelaxed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelaxed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxed")(js.undefined)
        ret
    }
  }
  
}

