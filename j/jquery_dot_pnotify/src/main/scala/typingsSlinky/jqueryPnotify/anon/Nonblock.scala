package typingsSlinky.jqueryPnotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nonblock extends js.Object {
  /**
    * Create a non-blocking notice. It lets the user click elements underneath it.
    */
  var nonblock: js.UndefOr[Boolean] = js.native
  /**
    * The opacity of the notice (if it's non-blocking) when the mouse is over it.
    */
  var nonblock_opacity: js.UndefOr[Double] = js.native
}

object Nonblock {
  @scala.inline
  def apply(): Nonblock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nonblock]
  }
  @scala.inline
  implicit class NonblockOps[Self <: Nonblock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonblock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonblock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonblock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonblock")(js.undefined)
        ret
    }
    @scala.inline
    def withNonblock_opacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonblock_opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonblock_opacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonblock_opacity")(js.undefined)
        ret
    }
  }
  
}

