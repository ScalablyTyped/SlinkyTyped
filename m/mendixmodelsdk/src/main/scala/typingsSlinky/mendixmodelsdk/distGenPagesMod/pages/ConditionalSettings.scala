package typingsSlinky.mendixmodelsdk.distGenPagesMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAttribute
import typingsSlinky.mendixmodelsdk.distGenEnumerationsMod.enumerations.Condition
import typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalSettings")
@js.native
abstract class ConditionalSettings protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FConditionalSettings: IModel = js.native
  def attribute(): IAttribute | Null = js.native
  def attribute(newValue: IAttribute): js.Any = js.native
  def attributeQualifiedName(): String | Null = js.native
  @JSName("attribute")
  def attribute_Any(): js.Any = js.native
  def conditions(): IList[Condition] = js.native
  def containerAsConditionallyEditableWidget(): ConditionallyEditableWidget = js.native
  def containerAsConditionallyVisibleWidget(): ConditionallyVisibleWidget = js.native
  def containerAsControlBarButton(): ControlBarButton = js.native
  def containerAsCustomWidget(): CustomWidget = js.native
  def containerAsLayoutGridRow(): LayoutGridRow = js.native
  def containerAsNavigationListItem(): NavigationListItem = js.native
  def containerAsTabPage(): TabPage = js.native
  def containerAsTableRow(): TableRow = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 7.0.1: introduced
    */
  def expression(): String = js.native
  def expression(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def expressionModel(): Expression = js.native
  def expressionModel(newValue: Expression): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalSettings")
@js.native
object ConditionalSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

