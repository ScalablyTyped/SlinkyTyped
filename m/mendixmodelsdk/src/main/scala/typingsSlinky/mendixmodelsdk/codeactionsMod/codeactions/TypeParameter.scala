package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
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
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.ITypeParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, name */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.TypeParameter")
@js.native
class TypeParameter protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsCodeAction: CodeAction = js.native
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_FTypeParameter: ICodeAction = js.native
  
  @JSName("model")
  var model_FTypeParameter: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FTypeParameter: String = js.native
  
  @JSName("qualifiedName")
  def qualifiedName_MTypeParameter: String | Null = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.TypeParameter")
@js.native
object TypeParameter extends js.Object {
  
  /**
    * Creates and returns a new TypeParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TypeParameter = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
