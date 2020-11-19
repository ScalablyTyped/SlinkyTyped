package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RuleSplitCondition")
@js.native
class RuleSplitCondition protected () extends SplitCondition {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FRuleSplitCondition: IModel = js.native
  
  def ruleCall: RuleCall = js.native
  def ruleCall_=(newValue: RuleCall): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RuleSplitCondition")
@js.native
object RuleSplitCondition extends js.Object {
  
  /**
    * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RuleSplitCondition = js.native
  
  /**
    * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
    * The new RuleSplitCondition will be automatically stored in the 'splitCondition' property
    * of the parent ExclusiveSplit element passed as argument.
    */
  def createIn(container: ExclusiveSplit): RuleSplitCondition = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
