package typingsSlinky.hapiHoek.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@hapi/hoek.@hapi/hoek.contain.Options, 'once'> */
@js.native
trait OmitOptionsonce extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
  var only: js.UndefOr[Boolean] = js.native
  var part: js.UndefOr[Boolean] = js.native
  var symbols: js.UndefOr[Boolean] = js.native
}

object OmitOptionsonce {
  @scala.inline
  def apply(): OmitOptionsonce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitOptionsonce]
  }
  @scala.inline
  implicit class OmitOptionsonceOps[Self <: OmitOptionsonce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
    @scala.inline
    def withPart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
  }
  
}

