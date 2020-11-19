package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.regularexpressionsMod.regularexpressions.IRegularExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RegExRuleInfo")
@js.native
class RegExRuleInfo protected () extends RuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FRegExRuleInfo: IModel = js.native
  
  def regularExpression: IRegularExpression | Null = js.native
  
  def regularExpressionQualifiedName: String | Null = js.native
  
  def regularExpression_=(newValue: IRegularExpression | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RegExRuleInfo")
@js.native
object RegExRuleInfo extends js.Object {
  
  /**
    * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RegExRuleInfo = js.native
  
  /**
    * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
    * The new RegExRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: ValidationRule): RegExRuleInfo = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
