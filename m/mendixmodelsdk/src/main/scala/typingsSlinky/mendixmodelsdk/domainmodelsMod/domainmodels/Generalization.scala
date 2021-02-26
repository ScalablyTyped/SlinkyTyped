package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IGeneralizationBase because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IGeneralization because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined generalization, generalizationQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Generalization")
@js.native
class Generalization protected () extends GeneralizationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsEntity")
  def containerAsEntity_MGeneralization: Entity = js.native
  
  def generalization: IEntity = js.native
  
  def generalizationQualifiedName: String = js.native
  @JSName("generalizationQualifiedName")
  val generalizationQualifiedName_FGeneralization: String = js.native
  
  def generalization_=(newValue: IEntity): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("generalization")
  val generalization_FGeneralization: IEntity = js.native
}
object Generalization {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Generalization")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Generalization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Generalization.create")
  @js.native
  def create(model: IModel): Generalization = js.native
  
  /**
    * Creates and returns a new Generalization instance in the SDK and on the server.
    * The new Generalization will be automatically stored in the 'generalization' property
    * of the parent Entity element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Generalization.createIn")
  @js.native
  def createIn(container: Entity): Generalization = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Generalization.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Generalization.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
