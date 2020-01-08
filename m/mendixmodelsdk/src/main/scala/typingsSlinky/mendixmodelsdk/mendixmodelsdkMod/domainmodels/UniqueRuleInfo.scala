package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.UniqueRuleInfo")
@js.native
class UniqueRuleInfo protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.UniqueRuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "domainmodels.UniqueRuleInfo")
@js.native
object UniqueRuleInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.UniqueRuleInfo = js.native
  /**
    * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
    * The new UniqueRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ValidationRule): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.UniqueRuleInfo = js.native
}

