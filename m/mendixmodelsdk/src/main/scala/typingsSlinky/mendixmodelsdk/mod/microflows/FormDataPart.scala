package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.FormDataPart")
@js.native
class FormDataPart protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.FormDataPart {
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
@JSImport("mendixmodelsdk", "microflows.FormDataPart")
@js.native
object FormDataPart extends js.Object {
  
  /**
    * Creates and returns a new FormDataPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.FormDataPart = js.native
  
  /**
    * Creates and returns a new FormDataPart instance in the SDK and on the server.
    * The new FormDataPart will be automatically stored in the 'parts' property
    * of the parent FormDataRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.FormDataRequestHandling): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.FormDataPart = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
