package typingsSlinky.eggCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsWeakDep extends js.Object {
  var isWeakDep: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object AnonIsWeakDep {
  @scala.inline
  def apply(): AnonIsWeakDep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIsWeakDep]
  }
  @scala.inline
  implicit class AnonIsWeakDepOps[Self <: AnonIsWeakDep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsWeakDep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWeakDep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWeakDep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWeakDep")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

