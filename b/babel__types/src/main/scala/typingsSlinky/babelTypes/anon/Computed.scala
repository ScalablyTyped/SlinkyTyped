package typingsSlinky.babelTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Computed extends js.Object {
  var computed: Boolean | Null = js.native
}

object Computed {
  @scala.inline
  def apply(): Computed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computed]
  }
  @scala.inline
  implicit class ComputedOps[Self <: Computed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(null)
        ret
    }
  }
  
}

