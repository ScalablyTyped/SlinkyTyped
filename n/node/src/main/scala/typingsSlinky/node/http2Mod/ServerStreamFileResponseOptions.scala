package typingsSlinky.node.http2Mod

import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerStreamFileResponseOptions extends js.Object {
  var length: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var statCheck: js.UndefOr[
    js.Function3[
      /* stats */ Stats, 
      /* headers */ OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      Unit | Boolean
    ]
  ] = js.native
  var waitForTrailers: js.UndefOr[Boolean] = js.native
}

object ServerStreamFileResponseOptions {
  @scala.inline
  def apply(): ServerStreamFileResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamFileResponseOptions]
  }
  @scala.inline
  implicit class ServerStreamFileResponseOptionsOps[Self <: ServerStreamFileResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withStatCheck(
      value: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statCheck")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStatCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForTrailers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTrailers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForTrailers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTrailers")(js.undefined)
        ret
    }
  }
  
}

