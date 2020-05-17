package typingsSlinky.atmosphereJs.Atmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Atmosphere extends js.Object {
  var AtmosphereRequest: js.UndefOr[typingsSlinky.atmosphereJs.Atmosphere.AtmosphereRequest] = js.native
  /**
    * The atmosphere API is a little bit special here: the first parameter can either be
    * a URL string or a Request object. If it is a URL string, then the additional parameters are expected.
    */
  var subscribe: js.UndefOr[
    js.Function3[
      /* requestOrUrl */ js.Any, 
      /* callback */ js.UndefOr[js.Function], 
      /* request */ js.UndefOr[Request], 
      Request
    ]
  ] = js.native
  var unsubscribe: js.UndefOr[js.Function0[Unit]] = js.native
}

object Atmosphere {
  @scala.inline
  def apply(): Atmosphere = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Atmosphere]
  }
  @scala.inline
  implicit class AtmosphereOps[Self <: typingsSlinky.atmosphereJs.Atmosphere.Atmosphere] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtmosphereRequest(value: AtmosphereRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtmosphereRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtmosphereRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtmosphereRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribe(
      value: (/* requestOrUrl */ js.Any, /* callback */ js.UndefOr[js.Function], /* request */ js.UndefOr[Request]) => Request
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsubscribe(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnsubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.undefined)
        ret
    }
  }
  
}

