package typingsSlinky.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaults_ extends ClientConfig {
  var binary: js.UndefOr[Boolean] = js.native
  var parseInt8: js.UndefOr[Boolean] = js.native
  var poolIdleTimeout: js.UndefOr[Double] = js.native
  var poolSize: js.UndefOr[Double] = js.native
  var reapIntervalMillis: js.UndefOr[Double] = js.native
}

object Defaults_ {
  @scala.inline
  def apply(): Defaults_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaults_]
  }
  @scala.inline
  implicit class Defaults_Ops[Self <: Defaults_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withParseInt8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInt8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseInt8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInt8")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolIdleTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolIdleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolIdleTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolIdleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReapIntervalMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapIntervalMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReapIntervalMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapIntervalMillis")(js.undefined)
        ret
    }
  }
  
}

