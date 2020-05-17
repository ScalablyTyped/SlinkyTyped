package typingsSlinky.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  domain  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>}>,   ticks  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>,   text  :std.Partial<react.react.CSSProperties>}>,   legend  :std.Partial<{  text  :std.Partial<react.react.CSSProperties>}>}> */
@js.native
trait PartialdomainPartiallineP extends js.Object {
  var domain: js.UndefOr[PartiallinePartialCSSProp] = js.native
  var legend: js.UndefOr[PartialtextPartialCSSProp] = js.native
  var ticks: js.UndefOr[PartiallinePartialCSSPropLine] = js.native
}

object PartialdomainPartiallineP {
  @scala.inline
  def apply(): PartialdomainPartiallineP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialdomainPartiallineP]
  }
  @scala.inline
  implicit class PartialdomainPartiallinePOps[Self <: PartialdomainPartiallineP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: PartiallinePartialCSSProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: PartialtextPartialCSSProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: PartiallinePartialCSSPropLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
  }
  
}

