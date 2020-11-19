package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.Microflow
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
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IMicroflowActionInfo because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, containerAsMicroflow, caption, category, icon, iconQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.MicroflowActionInfo")
@js.native
class MicroflowActionInfo protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  @JSName("caption")
  val caption_FMicroflowActionInfo: String = js.native
  
  def category: String = js.native
  def category_=(newValue: String): Unit = js.native
  @JSName("category")
  val category_FMicroflowActionInfo: String = js.native
  
  def containerAsCodeAction: CodeAction = js.native
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_FMicroflowActionInfo: ICodeAction = js.native
  
  def containerAsMicroflow: Microflow = js.native
  @JSName("containerAsMicroflow")
  val containerAsMicroflow_FMicroflowActionInfo: IMicroflow = js.native
  
  def icon: IImage | Null = js.native
  
  def iconQualifiedName: String | Null = js.native
  @JSName("iconQualifiedName")
  val iconQualifiedName_FMicroflowActionInfo: String | Null = js.native
  
  def icon_=(newValue: IImage | Null): Unit = js.native
  @JSName("icon")
  val icon_FMicroflowActionInfo: IImage | Null = js.native
  
  @JSName("model")
  var model_FMicroflowActionInfo: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.MicroflowActionInfo")
@js.native
object MicroflowActionInfo extends js.Object {
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MicroflowActionInfo = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createIn(container: CodeAction): MicroflowActionInfo = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderModelerActionInfo(container: CodeAction): MicroflowActionInfo = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
    * of the parent microflows.Microflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInMicroflowUnderMicroflowActionInfo(container: Microflow): MicroflowActionInfo = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
