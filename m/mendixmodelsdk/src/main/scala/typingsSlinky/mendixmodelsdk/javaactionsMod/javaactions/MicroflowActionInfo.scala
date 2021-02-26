package typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.10.0: removed experimental
  * In version 6.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.IMicroflowActionInfo because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsJavaAction, caption, category, icon, iconQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.MicroflowActionInfo")
@js.native
class MicroflowActionInfo protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  @JSName("caption")
  val caption_FMicroflowActionInfo: String = js.native
  
  def category: String = js.native
  def category_=(newValue: String): Unit = js.native
  @JSName("category")
  val category_FMicroflowActionInfo: String = js.native
  
  def containerAsJavaAction: JavaAction = js.native
  @JSName("containerAsJavaAction")
  val containerAsJavaAction_FMicroflowActionInfo: IJavaAction = js.native
  
  def icon: IImage | Null = js.native
  
  def iconQualifiedName: String | Null = js.native
  @JSName("iconQualifiedName")
  val iconQualifiedName_FMicroflowActionInfo: String | Null = js.native
  
  def icon_=(newValue: IImage | Null): Unit = js.native
  @JSName("icon")
  val icon_FMicroflowActionInfo: IImage | Null = js.native
}
object MicroflowActionInfo {
  
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.MicroflowActionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.MicroflowActionInfo.create")
  @js.native
  def create(model: IModel): MicroflowActionInfo = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.MicroflowActionInfo.createIn")
  @js.native
  def createIn(container: JavaAction): MicroflowActionInfo = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.MicroflowActionInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.MicroflowActionInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
