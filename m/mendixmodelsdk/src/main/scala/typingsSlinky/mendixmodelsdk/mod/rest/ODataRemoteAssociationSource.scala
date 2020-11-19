package typingsSlinky.mendixmodelsdk.mod.rest

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationBase
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.10.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource")
@js.native
class ODataRemoteAssociationSource protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.rest.ODataRemoteAssociationSource {
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
@JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource")
@js.native
object ODataRemoteAssociationSource extends js.Object {
  
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.restMod.rest.ODataRemoteAssociationSource = js.native
  
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * The new ODataRemoteAssociationSource will be automatically stored in the 'source' property
    * of the parent domainmodels.AssociationBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: AssociationBase): typingsSlinky.mendixmodelsdk.restMod.rest.ODataRemoteAssociationSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
