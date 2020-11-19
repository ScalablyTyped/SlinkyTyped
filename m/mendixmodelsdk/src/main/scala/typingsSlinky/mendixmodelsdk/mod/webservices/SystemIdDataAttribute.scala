package typingsSlinky.mendixmodelsdk.mod.webservices

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 6.7.0: introduced
  */
@JSImport("mendixmodelsdk", "webservices.SystemIdDataAttribute")
@js.native
class SystemIdDataAttribute protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.SystemIdDataAttribute {
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
@JSImport("mendixmodelsdk", "webservices.SystemIdDataAttribute")
@js.native
object SystemIdDataAttribute extends js.Object {
  
  /**
    * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.SystemIdDataAttribute = js.native
  
  /**
    * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
    * The new SystemIdDataAttribute will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntityBase): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.SystemIdDataAttribute = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
