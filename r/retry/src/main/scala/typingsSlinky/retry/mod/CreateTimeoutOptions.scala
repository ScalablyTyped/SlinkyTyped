package typingsSlinky.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTimeoutOptions extends js.Object {
  /**
    * The exponential factor to use.
    * @default 2
    */
  var factor: js.UndefOr[Double] = js.native
  /**
    * The maximum number of milliseconds between two retries.
    * @default Infinity
    */
  var maxTimeout: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds before starting the first retry.
    * @default 1000
    */
  var minTimeout: js.UndefOr[Double] = js.native
  /**
    * Randomizes the timeouts by multiplying a factor between 1-2.
    * @default false
    */
  var randomize: js.UndefOr[Boolean] = js.native
}

object CreateTimeoutOptions {
  @scala.inline
  def apply(): CreateTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTimeoutOptions]
  }
  @scala.inline
  implicit class CreateTimeoutOptionsOps[Self <: CreateTimeoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(js.undefined)
        ret
    }
  }
  
}

