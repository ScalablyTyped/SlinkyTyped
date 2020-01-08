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
  @JSName("model")
  var model_FEntityRef: IModel = js.native
  def containerAsCreateObjectClientAction(): CreateObjectClientAction = js.native
  def containerAsEntityPathSource(): EntityPathSource = js.native
  def containerAsEntityWidget(): EntityWidget = js.native
  def containerAsMemberRef(): MemberRef = js.native
  def containerAsNewButton(): NewButton = js.native
  def containerAsReferenceSetSelector(): ReferenceSetSelector = js.native
  def containerAsSelectorXPathSource(): SelectorXPathSource = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRef")
@js.native
object EntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

