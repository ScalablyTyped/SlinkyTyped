package typingsSlinky.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform[HSS, ESS, S, RS] extends js.Object {
  var in: TransformInbound[HSS, ESS, S] = js.native
  var out: TransformOutbound[ESS, HSS, RS] = js.native
}

object Transform {
  @scala.inline
  def apply[HSS, ESS, S, RS](
    in: (HSS, /* keyof S */ /* key */ String, S) => ESS,
    out: (ESS, /* keyof RS */ /* key */ String, RS) => HSS
  ): Transform[HSS, ESS, S, RS] = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction3(in), out = js.Any.fromFunction3(out))
    __obj.asInstanceOf[Transform[HSS, ESS, S, RS]]
  }
  @scala.inline
  implicit class TransformOps[Self[hss, ess, s, rs] <: Transform[hss, ess, s, rs], HSS, ESS, S, RS] (val x: Self[HSS, ESS, S, RS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[HSS, ESS, S, RS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[HSS, ESS, S, RS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[HSS, ESS, S, RS]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[HSS, ESS, S, RS]) with Other]
    @scala.inline
    def withIn(value: (HSS, /* keyof S */ /* key */ String, S) => ESS): Self[HSS, ESS, S, RS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOut(value: (ESS, /* keyof RS */ /* key */ String, RS) => HSS): Self[HSS, ESS, S, RS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

