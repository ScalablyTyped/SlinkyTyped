package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.ILayoutContent because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.INativeLayoutContent because var conflicts: containerAsLayout, id, isLoaded, model, structureTypeName, unit. Inlined layoutType */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NativeLayoutContent")
@js.native
class NativeLayoutContent protected () extends LayoutContent {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("containerAsLayout")
  def containerAsLayout_MNativeLayoutContent: Layout = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def layoutType: NativeLayoutType = js.native
  def layoutType_=(newValue: NativeLayoutType): Unit = js.native
  /**
    * In version 8.5.0: introduced
    */
  @JSName("layoutType")
  val layoutType_FNativeLayoutContent: NativeLayoutType = js.native
  
  @JSName("model")
  var model_FNativeLayoutContent: IModel = js.native
  
  def rightHeaderPlaceholder: Placeholder | Null = js.native
  def rightHeaderPlaceholder_=(newValue: Placeholder | Null): Unit = js.native
  
  /**
    * In version 8.2.0: introduced
    */
  def showBottomBar: Boolean = js.native
  def showBottomBar_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def sidebar: Boolean = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def sidebarWidgets: IList[Widget] = js.native
  
  def sidebar_=(newValue: Boolean): Unit = js.native
  
  def widgets: IList[Widget] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NativeLayoutContent")
@js.native
object NativeLayoutContent extends js.Object {
  
  /**
    * Creates and returns a new NativeLayoutContent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NativeLayoutContent = js.native
  
  /**
    * Creates and returns a new NativeLayoutContent instance in the SDK and on the server.
    * The new NativeLayoutContent will be automatically stored in the 'content' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: Layout): NativeLayoutContent = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
