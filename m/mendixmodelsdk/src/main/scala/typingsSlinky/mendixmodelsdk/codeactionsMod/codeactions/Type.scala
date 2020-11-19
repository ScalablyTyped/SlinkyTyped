package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsBasicParameterType, containerAsCodeAction, containerAsListType */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.Type")
@js.native
abstract class Type protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsBasicParameterType: BasicParameterType = js.native
  @JSName("containerAsBasicParameterType")
  val containerAsBasicParameterType_FType: IBasicParameterType = js.native
  
  def containerAsCodeAction: CodeAction = js.native
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_FType: ICodeAction = js.native
  
  def containerAsListType: ListType = js.native
  @JSName("containerAsListType")
  val containerAsListType_FType: IListType = js.native
  
  @JSName("model")
  var model_FType: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.Type")
@js.native
object Type extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
