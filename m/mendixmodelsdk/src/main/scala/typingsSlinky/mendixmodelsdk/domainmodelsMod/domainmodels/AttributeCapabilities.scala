package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.13.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeCapabilities because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAttribute, filterable, sortable, canDeleteFromModel */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities")
@js.native
class AttributeCapabilities protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.0.0: introduced
    */
  def canDeleteFromModel: Boolean = js.native
  def canDeleteFromModel_=(newValue: Boolean): Unit = js.native
  /**
    * In version 9.0.0: introduced
    */
  @JSName("canDeleteFromModel")
  val canDeleteFromModel_FAttributeCapabilities: Boolean = js.native
  
  def containerAsAttribute: Attribute = js.native
  @JSName("containerAsAttribute")
  val containerAsAttribute_FAttributeCapabilities: IAttribute = js.native
  
  def filterable: Boolean = js.native
  def filterable_=(newValue: Boolean): Unit = js.native
  @JSName("filterable")
  val filterable_FAttributeCapabilities: Boolean = js.native
  
  def sortable: Boolean = js.native
  def sortable_=(newValue: Boolean): Unit = js.native
  @JSName("sortable")
  val sortable_FAttributeCapabilities: Boolean = js.native
}
object AttributeCapabilities {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AttributeCapabilities instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities.create")
  @js.native
  def create(model: IModel): AttributeCapabilities = js.native
  
  /**
    * Creates and returns a new AttributeCapabilities instance in the SDK and on the server.
    * The new AttributeCapabilities will be automatically stored in the 'capabilities' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities.createIn")
  @js.native
  def createIn(container: Attribute): AttributeCapabilities = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
