package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.17.0: added public
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.ILayoutCall because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsLayout, containerAsPage, containerAsPageTemplate, containerAsWebLayoutContent, layout, layoutQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall")
@js.native
class LayoutCall protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def arguments: IList[LayoutCallArgument] = js.native
  
  def containerAsLayout: Layout = js.native
  @JSName("containerAsLayout")
  val containerAsLayout_FLayoutCall: ILayout = js.native
  
  def containerAsPage: Page = js.native
  
  def containerAsPageTemplate: PageTemplate = js.native
  @JSName("containerAsPageTemplate")
  val containerAsPageTemplate_FLayoutCall: IPageTemplate = js.native
  
  @JSName("containerAsPage")
  val containerAsPage_FLayoutCall: IPage = js.native
  
  def containerAsWebLayoutContent: WebLayoutContent = js.native
  @JSName("containerAsWebLayoutContent")
  val containerAsWebLayoutContent_FLayoutCall: IWebLayoutContent = js.native
  
  /**
    * In version 8.0.0: removed optional
    * In version 7.17.0: added public
    */
  def layout: ILayout | Null = js.native
  
  def layoutQualifiedName: String | Null = js.native
  @JSName("layoutQualifiedName")
  val layoutQualifiedName_FLayoutCall: String | Null = js.native
  
  def layout_=(newValue: ILayout | Null): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.0.0: removed optional
    * In version 7.17.0: added public
    */
  @JSName("layout")
  val layout_FLayoutCall: ILayout | Null = js.native
}
object LayoutCall {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall.create")
  @js.native
  def create(model: IModel): LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall.createInLayoutUnderLayoutCall")
  @js.native
  def createInLayoutUnderLayoutCall(container: Layout): LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall.createInPageTemplateUnderLayoutCall")
  @js.native
  def createInPageTemplateUnderLayoutCall(container: PageTemplate): LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Page element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall.createInPageUnderLayoutCall")
  @js.native
  def createInPageUnderLayoutCall(container: Page): LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall.createInWebLayoutContentUnderLayoutCall")
  @js.native
  def createInWebLayoutContentUnderLayoutCall(container: WebLayoutContent): LayoutCall = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
