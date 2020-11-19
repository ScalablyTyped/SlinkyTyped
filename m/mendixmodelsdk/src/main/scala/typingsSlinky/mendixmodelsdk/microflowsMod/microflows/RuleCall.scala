package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RuleCall")
@js.native
class RuleCall protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsRuleSplitCondition: RuleSplitCondition = js.native
  
  @JSName("model")
  var model_FRuleCall: IModel = js.native
  
  def parameterMappings: IList[RuleCallParameterMapping] = js.native
  
  def rule: IRule | Null = js.native
  
  def ruleQualifiedName: String | Null = js.native
  
  def rule_=(newValue: IRule | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RuleCall")
@js.native
object RuleCall extends js.Object {
  
  /**
    * Creates and returns a new RuleCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RuleCall = js.native
  
  /**
    * Creates and returns a new RuleCall instance in the SDK and on the server.
    * The new RuleCall will be automatically stored in the 'ruleCall' property
    * of the parent RuleSplitCondition element passed as argument.
    */
  def createIn(container: RuleSplitCondition): RuleCall = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
