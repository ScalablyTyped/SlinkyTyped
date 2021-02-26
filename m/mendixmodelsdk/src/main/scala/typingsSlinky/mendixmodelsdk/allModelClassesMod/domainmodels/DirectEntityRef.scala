package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.EntityWidget
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.CreateObjectClientAction
import typingsSlinky.mendixmodelsdk.pagesMod.pages.EntityPathSource
import typingsSlinky.mendixmodelsdk.pagesMod.pages.NewButton
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector
import typingsSlinky.mendixmodelsdk.pagesMod.pages.SelectorXPathSource
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef")
@js.native
class DirectEntityRef protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DirectEntityRef {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.createInCreateObjectClientActionUnderEntityRef")
  @js.native
  def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.EntityPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.createInEntityPathSourceUnderEntityRef")
  @js.native
  def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent documenttemplates.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.createInEntityWidgetUnderEntityRef")
  @js.native
  def createInEntityWidgetUnderEntityRef(container: EntityWidget): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.createInNewButtonUnderEntityRef")
  @js.native
  def createInNewButtonUnderEntityRef(container: NewButton): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.createInReferenceSetSelectorUnderConstrainedByRefs")
  @js.native
  def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.SelectorXPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.createInSelectorXPathSourceUnderConstrainedByRefs")
  @js.native
  def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.createInWidgetValueUnderEntityRef")
  @js.native
  def createInWidgetValueUnderEntityRef(container: WidgetValue): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DirectEntityRef = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DirectEntityRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
