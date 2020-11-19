package typingsSlinky.mendixmodelsdk.allModelClassesMod.rest

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.ODataKeyPart")
@js.native
class ODataKeyPart protected ()
  extends typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.ODataKeyPart")
@js.native
object ODataKeyPart extends js.Object {
  
  /**
    * Creates and returns a new ODataKeyPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart = js.native
  
  /**
    * Creates and returns a new ODataKeyPart instance in the SDK and on the server.
    * The new ODataKeyPart will be automatically stored in the 'parts' property
    * of the parent ODataKey element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.restMod.rest.ODataKey): typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
