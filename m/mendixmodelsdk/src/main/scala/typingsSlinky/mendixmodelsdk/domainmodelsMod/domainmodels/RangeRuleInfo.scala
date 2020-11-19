package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo")
@js.native
class RangeRuleInfo protected () extends RuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def maxAttribute: IAttribute | Null = js.native
  
  def maxAttributeQualifiedName: String | Null = js.native
  
  def maxAttribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def maxValue: String = js.native
  def maxValue_=(newValue: String): Unit = js.native
  
  def minAttribute: IAttribute | Null = js.native
  
  def minAttributeQualifiedName: String | Null = js.native
  
  def minAttribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def minValue: String = js.native
  def minValue_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FRangeRuleInfo: IModel = js.native
  
  def typeOfRange: RangeType = js.native
  def typeOfRange_=(newValue: RangeType): Unit = js.native
  
  def useMaxValue: Boolean = js.native
  def useMaxValue_=(newValue: Boolean): Unit = js.native
  
  def useMinValue: Boolean = js.native
  def useMinValue_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RangeRuleInfo")
@js.native
object RangeRuleInfo extends js.Object {
  
  /**
    * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RangeRuleInfo = js.native
  
  /**
    * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
    * The new RangeRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: ValidationRule): RangeRuleInfo = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
