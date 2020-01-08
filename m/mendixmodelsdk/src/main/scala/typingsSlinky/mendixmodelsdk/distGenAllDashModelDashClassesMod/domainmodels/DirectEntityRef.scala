package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels

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
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef")
@js.native
class DirectEntityRef protected ()
  extends typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef")
@js.native
object DirectEntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef = js.native
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef = js.native
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.EntityPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef = js.native
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent documenttemplates.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInEntityWidgetUnderEntityRef(container: EntityWidget): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef = js.native
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 7.16.0
    */
  def createInNewButtonUnderEntityRef(container: NewButton): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef = js.native
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef = js.native
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.SelectorXPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef = js.native
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInWidgetValueUnderEntityRef(container: WidgetValue): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.DirectEntityRef = js.native
}

