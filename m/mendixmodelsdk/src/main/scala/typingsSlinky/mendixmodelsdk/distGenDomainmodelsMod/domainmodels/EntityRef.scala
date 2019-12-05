package typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.EntityWidget
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CreateObjectClientAction
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.EntityPathSource
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NewButton
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSelector
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SelectorXPathSource
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRef")
@js.native
abstract class EntityRef protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsCreateObjectClientAction: CreateObjectClientAction = js.native
  val containerAsEntityPathSource: EntityPathSource = js.native
  val containerAsEntityWidget: EntityWidget = js.native
  val containerAsMemberRef: MemberRef = js.native
  val containerAsNewButton: NewButton = js.native
  val containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  val containerAsSelectorXPathSource: SelectorXPathSource = js.native
  val containerAsWidgetValue: WidgetValue = js.native
  @JSName("model")
  var model_EntityRef: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRef")
@js.native
object EntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

