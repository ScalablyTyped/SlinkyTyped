package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/page-templates relevant section in reference guide}
  *
  * In version 7.7.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.IFormBase because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.ITemplateFormBase because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.IPageTemplate because var conflicts: containerAsFolderBase, displayName, documentationUrl, id, isLoaded, model, structureTypeName, unit. Inlined `type`, layoutCall, templateType */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageTemplate")
@js.native
class PageTemplate protected () extends TemplateFormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPageTemplate: FolderBase = js.native
  
  /**
    * In version 7.17.0: added public
    */
  def layoutCall: LayoutCall = js.native
  def layoutCall_=(newValue: LayoutCall): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  @JSName("layoutCall")
  val layoutCall_FPageTemplate: ILayoutCall = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.13.0: introduced
    */
  def templateType: TemplateType = js.native
  def templateType_=(newValue: TemplateType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.13.0: introduced
    */
  @JSName("templateType")
  val templateType_FPageTemplate: ITemplateType = js.native
  
  /**
    * In version 8.13.0: deleted
    * In version 7.17.0: added public
    */
  def `type`: PageTemplateType = js.native
  def type_=(newValue: PageTemplateType): Unit = js.native
  /**
    * In version 8.13.0: deleted
    * In version 7.17.0: added public
    */
  @JSName("type")
  val type_FPageTemplate: PageTemplateType = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageTemplate")
@js.native
object PageTemplate extends js.Object {
  
  /**
    * Creates a new PageTemplate unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): PageTemplate = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
