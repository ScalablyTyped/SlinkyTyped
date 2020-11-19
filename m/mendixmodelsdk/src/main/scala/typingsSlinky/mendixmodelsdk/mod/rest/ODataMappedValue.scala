package typingsSlinky.mendixmodelsdk.mod.rest

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
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
@JSImport("mendixmodelsdk", "rest.ODataMappedValue")
@js.native
class ODataMappedValue protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.rest.ODataMappedValue {
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
@JSImport("mendixmodelsdk", "rest.ODataMappedValue")
@js.native
object ODataMappedValue extends js.Object {
  
  /**
    * Creates and returns a new ODataMappedValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.restMod.rest.ODataMappedValue = js.native
  
  /**
    * Creates and returns a new ODataMappedValue instance in the SDK and on the server.
    * The new ODataMappedValue will be automatically stored in the 'value' property
    * of the parent domainmodels.Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: Attribute): typingsSlinky.mendixmodelsdk.restMod.rest.ODataMappedValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
