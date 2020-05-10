package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpts extends js.Object {
  /**
  	 * Whether or not to unwrap the value if it happens to be wrapped, returning the original value. Defaults to true.
  	 */
  var unwrap: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether or not to include links and computations in the output. This creates a deep copy of the data, so changing any of it directly will have no effect on the data in Ractive's models. Defaults to true for root data and false everywhere else.
  	 */
  var virtual: js.UndefOr[Boolean] = js.native
}

object GetOpts {
  @scala.inline
  def apply(): GetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpts]
  }
  @scala.inline
  implicit class GetOptsOps[Self <: GetOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnwrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnwrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrap")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(js.undefined)
        ret
    }
  }
  
}

