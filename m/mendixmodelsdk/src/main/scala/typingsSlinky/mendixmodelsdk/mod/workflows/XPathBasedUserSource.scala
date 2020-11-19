package typingsSlinky.mendixmodelsdk.mod.workflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.11.0: introduced
  */
@JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource")
@js.native
class XPathBasedUserSource protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.workflows.XPathBasedUserSource {
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
@JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource")
@js.native
object XPathBasedUserSource extends js.Object {
  
  /**
    * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = js.native
  
  /**
    * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
    * The new XPathBasedUserSource will be automatically stored in the 'userSource' property
    * of the parent UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.UserTask): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
