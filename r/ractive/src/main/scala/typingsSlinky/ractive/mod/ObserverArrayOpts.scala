package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverArrayOpts extends ObserverBaseOpts {
  /**
  	 * Create an array observer, which fires array changes objects rather than the usual callback when array modification methods are used.
  	 */
  var array: Boolean = js.native
}

object ObserverArrayOpts {
  @scala.inline
  def apply(array: Boolean): ObserverArrayOpts = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverArrayOpts]
  }
  @scala.inline
  implicit class ObserverArrayOptsOps[Self <: ObserverArrayOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

