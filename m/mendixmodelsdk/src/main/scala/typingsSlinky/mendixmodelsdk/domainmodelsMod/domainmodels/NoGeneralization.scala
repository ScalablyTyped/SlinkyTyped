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
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.INoGeneralization because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined hasChangedDate, hasCreatedDate, hasOwner, hasChangedBy, persistable */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.NoGeneralization")
@js.native
class NoGeneralization protected () extends GeneralizationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsEntity")
  def containerAsEntity_MNoGeneralization: Entity = js.native
  
  /**
    * In version 8.2.0: added public
    */
  def hasChangedBy: Boolean = js.native
  def hasChangedBy_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.2.0: added public
    */
  @JSName("hasChangedBy")
  val hasChangedBy_FNoGeneralization: Boolean = js.native
  
  /**
    * In version 8.2.0: added public
    */
  def hasChangedDate: Boolean = js.native
  def hasChangedDate_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.2.0: added public
    */
  @JSName("hasChangedDate")
  val hasChangedDate_FNoGeneralization: Boolean = js.native
  
  /**
    * In version 8.2.0: added public
    */
  def hasCreatedDate: Boolean = js.native
  def hasCreatedDate_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.2.0: added public
    */
  @JSName("hasCreatedDate")
  val hasCreatedDate_FNoGeneralization: Boolean = js.native
  
  /**
    * In version 8.2.0: added public
    */
  def hasOwner: Boolean = js.native
  def hasOwner_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.2.0: added public
    */
  @JSName("hasOwner")
  val hasOwner_FNoGeneralization: Boolean = js.native
  
  def persistable: Boolean = js.native
  def persistable_=(newValue: Boolean): Unit = js.native
  @JSName("persistable")
  val persistable_FNoGeneralization: Boolean = js.native
}
object NoGeneralization {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.NoGeneralization")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NoGeneralization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.NoGeneralization.create")
  @js.native
  def create(model: IModel): NoGeneralization = js.native
  
  /**
    * Creates and returns a new NoGeneralization instance in the SDK and on the server.
    * The new NoGeneralization will be automatically stored in the 'generalization' property
    * of the parent Entity element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.NoGeneralization.createIn")
  @js.native
  def createIn(container: Entity): NoGeneralization = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.NoGeneralization.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.NoGeneralization.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
