package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.IJavaAction
import typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.JavaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.ICodeActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, containerAsJavaAction, name, actionParameterType, description */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeActionParameter")
@js.native
abstract class CodeActionParameter protected ()
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
  
  /**
    * In version 7.21.0: introduced
    */
  def actionParameterType: ParameterType = js.native
  def actionParameterType_=(newValue: ParameterType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: introduced
    */
  @JSName("actionParameterType")
  val actionParameterType_FCodeActionParameter: IParameterType = js.native
  
  /**
    * In version 7.18.0: introduced
    */
  def category: String = js.native
  def category_=(newValue: String): Unit = js.native
  
  def containerAsCodeAction: CodeAction = js.native
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_FCodeActionParameter: ICodeAction = js.native
  
  def containerAsJavaAction: JavaAction = js.native
  @JSName("containerAsJavaAction")
  val containerAsJavaAction_FCodeActionParameter: IJavaAction = js.native
  
  /**
    * In version 6.10.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  /**
    * In version 6.10.0: introduced
    */
  @JSName("description")
  val description_FCodeActionParameter: String = js.native
  
  @JSName("model")
  var model_FCodeActionParameter: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FCodeActionParameter: String = js.native
  
  @JSName("qualifiedName")
  def qualifiedName_MCodeActionParameter: String | Null = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeActionParameter")
@js.native
object CodeActionParameter extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
