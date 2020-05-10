package typingsSlinky.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agilite extends js.Object {
  var ApiKeys: typingsSlinky.agilite.mod.ApiKeys = js.native
  var BPM: typingsSlinky.agilite.mod.BPM = js.native
  var Connectors: typingsSlinky.agilite.mod.Connectors = js.native
  var DataMappings: typingsSlinky.agilite.mod.DataMappings = js.native
  var Files: typingsSlinky.agilite.mod.Files = js.native
  var Keywords: typingsSlinky.agilite.mod.Keywords = js.native
  var Numbering: typingsSlinky.agilite.mod.Numbering = js.native
  var Roles: typingsSlinky.agilite.mod.Roles = js.native
  var Templates: typingsSlinky.agilite.mod.Templates = js.native
  var TierStructures: typingsSlinky.agilite.mod.TierStructures = js.native
  var Utils: typingsSlinky.agilite.mod.Utils = js.native
  var appName: typingsSlinky.agilite.mod.appName = js.native
  var config: AgiliteConfig = js.native
  var reqType: typingsSlinky.agilite.mod.reqType = js.native
  def executeCRUDRequest(appName: String, reqType: String, data: js.Any, headers: js.Any): js.Any = js.native
  def getConfig(): AgiliteConfig = js.native
}

object Agilite {
  @scala.inline
  def apply(
    ApiKeys: ApiKeys,
    BPM: BPM,
    Connectors: Connectors,
    DataMappings: DataMappings,
    Files: Files,
    Keywords: Keywords,
    Numbering: Numbering,
    Roles: Roles,
    Templates: Templates,
    TierStructures: TierStructures,
    Utils: Utils,
    appName: appName,
    config: AgiliteConfig,
    executeCRUDRequest: (String, String, js.Any, js.Any) => js.Any,
    getConfig: () => AgiliteConfig,
    reqType: reqType
  ): Agilite = {
    val __obj = js.Dynamic.literal(ApiKeys = ApiKeys.asInstanceOf[js.Any], BPM = BPM.asInstanceOf[js.Any], Connectors = Connectors.asInstanceOf[js.Any], DataMappings = DataMappings.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Numbering = Numbering.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any], Templates = Templates.asInstanceOf[js.Any], TierStructures = TierStructures.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], executeCRUDRequest = js.Any.fromFunction4(executeCRUDRequest), getConfig = js.Any.fromFunction0(getConfig), reqType = reqType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agilite]
  }
  @scala.inline
  implicit class AgiliteOps[Self <: Agilite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKeys(value: ApiKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBPM(value: BPM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BPM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectors(value: Connectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataMappings(value: DataMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: Files): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: Keywords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbering(value: Numbering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Numbering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoles(value: Roles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplates(value: Templates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTierStructures(value: TierStructures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TierStructures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: Utils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppName(value: appName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: AgiliteConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecuteCRUDRequest(value: (String, String, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCRUDRequest")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetConfig(value: () => AgiliteConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReqType(value: reqType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

