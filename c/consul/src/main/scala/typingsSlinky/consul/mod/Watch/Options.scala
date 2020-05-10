package typingsSlinky.consul.mod.Watch

import typingsSlinky.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var backoffFactor: js.UndefOr[Double] = js.native
  var backoffMax: js.UndefOr[Double] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var method: js.Function = js.native
  var options: js.UndefOr[CommonOptions with WatchOptions] = js.native
}

object Options {
  @scala.inline
  def apply(method: js.Function): Options = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackoffFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoffFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackoffMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoffMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffMax")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: CommonOptions with WatchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

