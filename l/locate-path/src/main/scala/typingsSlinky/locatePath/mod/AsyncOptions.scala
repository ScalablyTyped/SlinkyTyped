package typingsSlinky.locatePath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncOptions extends Options {
  /**
  		Number of concurrently pending promises. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[Double] = js.native
  /**
  		Preserve `paths` order when searching.
  		Disable this to improve performance if you don't care about the order.
  		@default true
  		*/
  val preserveOrder: js.UndefOr[Boolean] = js.native
}

object AsyncOptions {
  @scala.inline
  def apply(): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions]
  }
  @scala.inline
  implicit class AsyncOptionsOps[Self <: AsyncOptions] (val x: Self) extends AnyVal {
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

