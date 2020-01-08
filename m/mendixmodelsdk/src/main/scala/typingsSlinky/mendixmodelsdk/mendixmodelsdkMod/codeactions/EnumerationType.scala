package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.codeactions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "codeactions.EnumerationType")
@js.native
class EnumerationType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.codeactions.EnumerationType {
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
@JSImport("mendixmodelsdk", "codeactions.EnumerationType")
@js.native
object EnumerationType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.BasicParameterType): typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction): typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.EnumerationType = js.native
}

