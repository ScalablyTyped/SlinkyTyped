package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.codeactions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "codeactions.ListType")
@js.native
class ListType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.codeactions.ListType {
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
@JSImport("mendixmodelsdk", "codeactions.ListType")
@js.native
object ListType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.ListType = js.native
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.BasicParameterType): typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.ListType = js.native
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction): typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.ListType = js.native
}

