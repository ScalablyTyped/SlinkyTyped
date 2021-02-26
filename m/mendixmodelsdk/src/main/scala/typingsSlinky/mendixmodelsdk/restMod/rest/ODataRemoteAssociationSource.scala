package typingsSlinky.mendixmodelsdk.restMod.rest

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationBase
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteAssociationSource
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
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationSource because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteAssociationSource because Already inherited
- typingsSlinky.mendixmodelsdk.restMod.rest.IODataRemoteAssociationSource because var conflicts: containerAsAssociationBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource")
@js.native
class ODataRemoteAssociationSource protected () extends RemoteAssociationSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAssociationBase")
  def containerAsAssociationBase_MODataRemoteAssociationSource: AssociationBase = js.native
  
  def remoteChildNavigationProperty: String = js.native
  def remoteChildNavigationProperty_=(newValue: String): Unit = js.native
  
  def remoteParentNavigationProperty: String = js.native
  def remoteParentNavigationProperty_=(newValue: String): Unit = js.native
}
object ODataRemoteAssociationSource {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource.create")
  @js.native
  def create(model: IModel): ODataRemoteAssociationSource = js.native
  
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * The new ODataRemoteAssociationSource will be automatically stored in the 'source' property
    * of the parent domainmodels.AssociationBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource.createIn")
  @js.native
  def createIn(container: AssociationBase): ODataRemoteAssociationSource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
