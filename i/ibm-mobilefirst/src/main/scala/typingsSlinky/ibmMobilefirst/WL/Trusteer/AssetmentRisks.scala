package typingsSlinky.ibmMobilefirst.WL.Trusteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetmentRisks extends js.Object {
  var device_key: String = js.native
  @JSName("malware.any")
  var malwareDotany: js.UndefOr[AssesmentRisk] = js.native
  @JSName("network.wifi")
  var networkDotwifi: js.UndefOr[AssesmentRisk] = js.native
  @JSName("os.rooted")
  var osDotrooted: js.UndefOr[AssesmentRisk] = js.native
  @JSName("os.rooted.hiders")
  var osDotrootedDothiders: js.UndefOr[AssesmentRisk] = js.native
  @JSName("os.rooted.native")
  var osDotrootedDotnative: js.UndefOr[AssesmentRisk] = js.native
  @JSName("os.ver_up_to_date")
  var osDotver_up_to_date: js.UndefOr[AssesmentRisk] = js.native
  @JSName("plat.android.apprestrict")
  var platDotandroidDotapprestrict: js.UndefOr[AssesmentRisk] = js.native
  @JSName("plat.android.dumpsys")
  var platDotandroidDotdumpsys: js.UndefOr[AssesmentRisk] = js.native
  @JSName("tas.config_update")
  var tasDotconfig_update: js.UndefOr[AssesmentRisk] = js.native
  @JSName("total.risk.generic")
  var totalDotriskDotgeneric: js.UndefOr[AssesmentRisk] = js.native
}

object AssetmentRisks {
  @scala.inline
  def apply(device_key: String): AssetmentRisks = {
    val __obj = js.Dynamic.literal(device_key = device_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetmentRisks]
  }
  @scala.inline
  implicit class AssetmentRisksOps[Self <: AssetmentRisks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMalwareDotany(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("malware.any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMalwareDotany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("malware.any")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkDotwifi(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network.wifi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDotwifi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network.wifi")(js.undefined)
        ret
    }
    @scala.inline
    def withOsDotrooted(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os.rooted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsDotrooted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os.rooted")(js.undefined)
        ret
    }
    @scala.inline
    def withOsDotrootedDothiders(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os.rooted.hiders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsDotrootedDothiders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os.rooted.hiders")(js.undefined)
        ret
    }
    @scala.inline
    def withOsDotrootedDotnative(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os.rooted.native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsDotrootedDotnative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os.rooted.native")(js.undefined)
        ret
    }
    @scala.inline
    def withOsDotver_up_to_date(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os.ver_up_to_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsDotver_up_to_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os.ver_up_to_date")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatDotandroidDotapprestrict(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plat.android.apprestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatDotandroidDotapprestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plat.android.apprestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatDotandroidDotdumpsys(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plat.android.dumpsys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatDotandroidDotdumpsys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plat.android.dumpsys")(js.undefined)
        ret
    }
    @scala.inline
    def withTasDotconfig_update(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tas.config_update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasDotconfig_update: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tas.config_update")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDotriskDotgeneric(value: AssesmentRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total.risk.generic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDotriskDotgeneric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total.risk.generic")(js.undefined)
        ret
    }
  }
  
}

