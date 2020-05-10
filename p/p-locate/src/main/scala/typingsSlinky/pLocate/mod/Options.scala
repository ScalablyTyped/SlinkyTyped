package typingsSlinky.pLocate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Number of concurrently pending promises returned by `tester`. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[Double] = js.native
  /**
  		Preserve `input` order when searching.
  		Disable this to improve performance if you don't care about the order.
  		@default true
  		*/
  val preserveOrder: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveOrder")(js.undefined)
        ret
    }
  }
  
}

