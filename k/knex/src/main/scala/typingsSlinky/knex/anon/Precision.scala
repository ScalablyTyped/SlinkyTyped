package typingsSlinky.knex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Precision extends js.Object {
  var precision: js.UndefOr[Double] = js.native
  var useTz: js.UndefOr[Boolean] = js.native
}

object Precision {
  @scala.inline
  def apply(): Precision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precision]
  }
  @scala.inline
  implicit class PrecisionOps[Self <: Precision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTz(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTz")(js.undefined)
        ret
    }
  }
  
}

