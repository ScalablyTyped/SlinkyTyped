package typingsSlinky.poly2tri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SweepContextOptions extends js.Object {
  /**
    * cloneArrays - if `true`, do a shallow copy of the Array parameters (contour, holes).
    * Points inside arrays are never copied.
    * Default is `false` : keep a reference to the array arguments, who will be modified in place.
    */
  var cloneArrays: js.UndefOr[Boolean] = js.native
}

object SweepContextOptions {
  @scala.inline
  def apply(): SweepContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SweepContextOptions]
  }
  @scala.inline
  implicit class SweepContextOptionsOps[Self <: SweepContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneArrays")(js.undefined)
        ret
    }
  }
  
}

