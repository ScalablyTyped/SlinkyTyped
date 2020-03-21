package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EqualsToRuleInfo")
@js.native
class EqualsToRuleInfo protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EqualsToRuleInfo {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EqualsToRuleInfo")
@js.native
object EqualsToRuleInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EqualsToRuleInfo = js.native
  /**
    * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
    * The new EqualsToRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.ValidationRule): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EqualsToRuleInfo = js.native
}

