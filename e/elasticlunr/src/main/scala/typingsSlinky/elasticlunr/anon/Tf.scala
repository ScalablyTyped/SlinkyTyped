package typingsSlinky.elasticlunr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tf extends js.Object {
  var tf: js.UndefOr[Double] = js.native
}

object Tf {
  @scala.inline
  def apply(): Tf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tf]
  }
  @scala.inline
  implicit class TfOps[Self <: Tf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tf")(js.undefined)
        ret
    }
  }
  
}

