package typingsSlinky.mendixmodelsdk.restMod.rest

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.QueryBasedRemoteEntitySource
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntitySource because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySource because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IQueryBasedRemoteEntitySource because Already inherited
- typingsSlinky.mendixmodelsdk.restMod.rest.IODataRemoteEntitySource because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined key */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteEntitySource")
@js.native
class ODataRemoteEntitySource protected () extends QueryBasedRemoteEntitySource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsEntity")
  def containerAsEntity_MODataRemoteEntitySource: Entity = js.native
  
  /**
    * In version 8.11.0: introduced
    */
  def entitySet: String = js.native
  def entitySet_=(newValue: String): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  def key: ODataKey | Null = js.native
  def key_=(newValue: ODataKey | Null): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSName("key")
  val key_FODataRemoteEntitySource: IODataKey | Null = js.native
  
  def remoteName: String = js.native
  def remoteName_=(newValue: String): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def sourceDocument: IConsumedODataService | Null = js.native
  
  def sourceDocumentQualifiedName: String | Null = js.native
  
  def sourceDocument_=(newValue: IConsumedODataService | Null): Unit = js.native
}
object ODataRemoteEntitySource {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteEntitySource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteEntitySource.create")
  @js.native
  def create(model: IModel): ODataRemoteEntitySource = js.native
  
  /**
    * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
    * The new ODataRemoteEntitySource will be automatically stored in the 'source' property
    * of the parent domainmodels.Entity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteEntitySource.createIn")
  @js.native
  def createIn(container: Entity): ODataRemoteEntitySource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteEntitySource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteEntitySource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
