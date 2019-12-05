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
  var attribute: IAttribute | Null = js.native
  val attributeQualifiedName: String | Null = js.native
  val conditions: IList[Condition] = js.native
  val containerAsConditionallyEditableWidget: ConditionallyEditableWidget = js.native
  val containerAsConditionallyVisibleWidget: ConditionallyVisibleWidget = js.native
  val containerAsControlBarButton: ControlBarButton = js.native
  val containerAsCustomWidget: CustomWidget = js.native
  val containerAsLayoutGridRow: LayoutGridRow = js.native
  val containerAsNavigationListItem: NavigationListItem = js.native
  val containerAsTabPage: TabPage = js.native
  val containerAsTableRow: TableRow = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 7.0.1: introduced
    */
  var expression: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  var expressionModel: Expression = js.native
  @JSName("model")
  var model_ConditionalSettings: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalSettings")
@js.native
object ConditionalSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

