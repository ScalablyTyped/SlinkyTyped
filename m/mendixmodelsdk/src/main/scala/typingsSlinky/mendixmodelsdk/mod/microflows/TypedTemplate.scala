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
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.TypedTemplate")
@js.native
class TypedTemplate protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.TypedTemplate {
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
@JSImport("mendixmodelsdk", "microflows.TypedTemplate")
@js.native
object TypedTemplate extends js.Object {
  
  /**
    * Creates and returns a new TypedTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.TypedTemplate = js.native
  
  /**
    * Creates and returns a new TypedTemplate instance in the SDK and on the server.
    * The new TypedTemplate will be automatically stored in the 'typedTemplate' property
    * of the parent StringTemplateParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplateParameterValue): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.TypedTemplate = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
