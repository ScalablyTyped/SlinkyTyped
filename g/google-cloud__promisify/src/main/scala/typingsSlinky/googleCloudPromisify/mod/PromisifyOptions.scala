package typingsSlinky.googleCloudPromisify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisifyOptions extends js.Object {
  /**
    * Resolve the promise with single arg instead of an array.
    */
  var singular: js.UndefOr[Boolean] = js.native
}

object PromisifyOptions {
  @scala.inline
  def apply(): PromisifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromisifyOptions]
  }
  @scala.inline
  implicit class PromisifyOptionsOps[Self <: PromisifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSingular(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(js.undefined)
        ret
    }
  }
  
}

