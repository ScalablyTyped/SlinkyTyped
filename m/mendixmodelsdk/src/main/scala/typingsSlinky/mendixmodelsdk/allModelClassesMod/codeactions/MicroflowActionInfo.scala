package typingsSlinky.mendixmodelsdk.allModelClassesMod.codeactions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.Microflow
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.MicroflowActionInfo")
@js.native
class MicroflowActionInfo protected ()
  extends typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.MicroflowActionInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.MicroflowActionInfo")
@js.native
object MicroflowActionInfo extends js.Object {
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.MicroflowActionInfo = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.CodeAction): typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.MicroflowActionInfo = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderModelerActionInfo(container: typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.CodeAction): typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.MicroflowActionInfo = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
    * of the parent microflows.Microflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInMicroflowUnderMicroflowActionInfo(container: Microflow): typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.MicroflowActionInfo = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
