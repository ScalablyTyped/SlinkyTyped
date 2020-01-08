package typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions

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
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IParameterType because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IEntityTypeParameterType because var conflicts: containerAsCodeActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EntityTypeParameterType")
@js.native
class EntityTypeParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityTypeParameterType: IModel = js.native
  @JSName("typeParameter")
  val typeParameter_FEntityTypeParameterType: ITypeParameter | Null = js.native
  @JSName("containerAsCodeActionParameter")
  def containerAsCodeActionParameter_MEntityTypeParameterType(): CodeActionParameter = js.native
  def typeParameter(): TypeParameter | Null = js.native
  def typeParameter(newValue: TypeParameter): js.Any = js.native
  @JSName("typeParameter")
  def typeParameter_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EntityTypeParameterType")
@js.native
object EntityTypeParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityTypeParameterType = js.native
}

