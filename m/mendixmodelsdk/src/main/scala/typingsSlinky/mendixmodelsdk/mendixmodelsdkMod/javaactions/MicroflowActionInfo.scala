package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.javaactions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.10.0: removed experimental
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk", "javaactions.MicroflowActionInfo")
@js.native
class MicroflowActionInfo protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.javaactions.MicroflowActionInfo {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "javaactions.MicroflowActionInfo")
@js.native
object MicroflowActionInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.MicroflowActionInfo = js.native
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaAction): typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.MicroflowActionInfo = js.native
}

