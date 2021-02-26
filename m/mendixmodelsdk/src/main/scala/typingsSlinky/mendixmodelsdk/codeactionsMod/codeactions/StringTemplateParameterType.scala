package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.5.0: removed experimental
  * In version 8.4.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IParameterType because Already inherited
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IStringTemplateParameterType because var conflicts: containerAsCodeActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined grammar */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType")
@js.native
class StringTemplateParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsCodeActionParameter")
  def containerAsCodeActionParameter_MStringTemplateParameterType: CodeActionParameter = js.native
  
  /**
    * In version 8.8.0: introduced
    */
  def grammar: StringTemplateParameterGrammar = js.native
  def grammar_=(newValue: StringTemplateParameterGrammar): Unit = js.native
  /**
    * In version 8.8.0: introduced
    */
  @JSName("grammar")
  val grammar_FStringTemplateParameterType: StringTemplateParameterGrammar = js.native
}
object StringTemplateParameterType {
  
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringTemplateParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType.create")
  @js.native
  def create(model: IModel): StringTemplateParameterType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringTemplateParameterType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
