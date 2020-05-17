package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contrast extends js.Object {
  var contrast: js.UndefOr[Double] = js.native
}

object Contrast {
  @scala.inline
  def apply(): Contrast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contrast]
  }
  @scala.inline
  implicit class ContrastOps[Self <: Contrast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(js.undefined)
        ret
    }
  }
  
}

