package typingsSlinky.mendixmodelsdk.mod.domainmodels

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
@JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef")
@js.native
class IndirectEntityRef protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels.IndirectEntityRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object IndirectEntityRef {
  
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.createInCreateObjectClientActionUnderEntityRef")
  @js.native
  def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.EntityPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.createInEntityPathSourceUnderEntityRef")
  @js.native
  def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent documenttemplates.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.createInEntityWidgetUnderEntityRef")
  @js.native
  def createInEntityWidgetUnderEntityRef(container: EntityWidget): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent MemberRef element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.createInMemberRefUnderEntityRef")
  @js.native
  def createInMemberRefUnderEntityRef(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.MemberRef): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.createInNewButtonUnderEntityRef")
  @js.native
  def createInNewButtonUnderEntityRef(container: NewButton): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.createInReferenceSetSelectorUnderConstrainedByRefs")
  @js.native
  def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.SelectorXPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.createInSelectorXPathSourceUnderConstrainedByRefs")
  @js.native
  def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.createInWidgetValueUnderEntityRef")
  @js.native
  def createInWidgetValueUnderEntityRef(container: WidgetValue): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
