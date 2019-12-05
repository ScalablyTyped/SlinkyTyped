package typingsSlinky.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agilite extends js.Object {
  var ApiKeys: typingsSlinky.agilite.agiliteMod.ApiKeys
  var BPM: typingsSlinky.agilite.agiliteMod.BPM
  var Connectors: typingsSlinky.agilite.agiliteMod.Connectors
  var DataMappings: typingsSlinky.agilite.agiliteMod.DataMappings
  var Files: typingsSlinky.agilite.agiliteMod.Files
  var Keywords: typingsSlinky.agilite.agiliteMod.Keywords
  var Numbering: typingsSlinky.agilite.agiliteMod.Numbering
  var Roles: typingsSlinky.agilite.agiliteMod.Roles
  var Templates: typingsSlinky.agilite.agiliteMod.Templates
  var TierStructures: typingsSlinky.agilite.agiliteMod.TierStructures
  var Utils: typingsSlinky.agilite.agiliteMod.Utils
  var appName: typingsSlinky.agilite.agiliteMod.appName
  var config: AgiliteConfig
  var reqType: typingsSlinky.agilite.agiliteMod.reqType
  def executeCRUDRequest(appName: String, reqType: String, data: js.Any, headers: js.Any): js.Any
  def getConfig(): AgiliteConfig
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
}

