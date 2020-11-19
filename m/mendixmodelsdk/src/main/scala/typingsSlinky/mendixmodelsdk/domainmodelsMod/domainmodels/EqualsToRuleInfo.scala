package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EqualsToRuleInfo")
@js.native
class EqualsToRuleInfo protected () extends RuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def equalsToAttribute: IAttribute | Null = js.native
  
  def equalsToAttributeQualifiedName: String | Null = js.native
  
  def equalsToAttribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def equalsToValue: String = js.native
  def equalsToValue_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FEqualsToRuleInfo: IModel = js.native
  
  def useValue: Boolean = js.native
  def useValue_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EqualsToRuleInfo")
@js.native
object EqualsToRuleInfo extends js.Object {
  
  /**
    * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EqualsToRuleInfo = js.native
  
  /**
    * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
    * The new EqualsToRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: ValidationRule): EqualsToRuleInfo = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
