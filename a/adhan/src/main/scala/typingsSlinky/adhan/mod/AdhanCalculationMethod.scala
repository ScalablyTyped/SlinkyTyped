package typingsSlinky.adhan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdhanCalculationMethod extends js.Object {
  def Dubai(): Parameter = js.native
  def Egyptian(): Parameter = js.native
  def Karachi(): Parameter = js.native
  def Kuwait(): Parameter = js.native
  def MoonsightingCommittee(): Parameter = js.native
  def MuslimWorldLeague(): Parameter = js.native
  def NorthAmerica(): Parameter = js.native
  def Other(): Parameter = js.native
  def Qatar(): Parameter = js.native
  def Singapore(): Parameter = js.native
  def UmmAlQura(): Parameter = js.native
}

object AdhanCalculationMethod {
  @scala.inline
  def apply(
    Dubai: () => Parameter,
    Egyptian: () => Parameter,
    Karachi: () => Parameter,
    Kuwait: () => Parameter,
    MoonsightingCommittee: () => Parameter,
    MuslimWorldLeague: () => Parameter,
    NorthAmerica: () => Parameter,
    Other: () => Parameter,
    Qatar: () => Parameter,
    Singapore: () => Parameter,
    UmmAlQura: () => Parameter
  ): AdhanCalculationMethod = {
    val __obj = js.Dynamic.literal(Dubai = js.Any.fromFunction0(Dubai), Egyptian = js.Any.fromFunction0(Egyptian), Karachi = js.Any.fromFunction0(Karachi), Kuwait = js.Any.fromFunction0(Kuwait), MoonsightingCommittee = js.Any.fromFunction0(MoonsightingCommittee), MuslimWorldLeague = js.Any.fromFunction0(MuslimWorldLeague), NorthAmerica = js.Any.fromFunction0(NorthAmerica), Other = js.Any.fromFunction0(Other), Qatar = js.Any.fromFunction0(Qatar), Singapore = js.Any.fromFunction0(Singapore), UmmAlQura = js.Any.fromFunction0(UmmAlQura))
    __obj.asInstanceOf[AdhanCalculationMethod]
  }
  @scala.inline
  implicit class AdhanCalculationMethodOps[Self <: AdhanCalculationMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDubai(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dubai")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEgyptian(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Egyptian")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKarachi(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Karachi")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKuwait(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Kuwait")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoonsightingCommittee(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoonsightingCommittee")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMuslimWorldLeague(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MuslimWorldLeague")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNorthAmerica(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NorthAmerica")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOther(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Other")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQatar(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qatar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSingapore(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Singapore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUmmAlQura(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UmmAlQura")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

