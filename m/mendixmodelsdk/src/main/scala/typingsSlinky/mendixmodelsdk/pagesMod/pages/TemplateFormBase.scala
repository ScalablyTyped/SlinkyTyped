package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
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
- typingsSlinky.mendixmodelsdk.pagesMod.pages.ITemplateFormBase because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined displayName, documentationUrl */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateFormBase")
@js.native
abstract class TemplateFormBase protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MTemplateFormBase: FolderBase = js.native
  
  /**
    * In version 7.17.0: added public
    */
  def displayName: String = js.native
  def displayName_=(newValue: String): Unit = js.native
  /**
    * In version 7.17.0: added public
    */
  @JSName("displayName")
  val displayName_FTemplateFormBase: String = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def documentationUrl: String = js.native
  def documentationUrl_=(newValue: String): Unit = js.native
  /**
    * In version 7.17.0: introduced
    */
  @JSName("documentationUrl")
  val documentationUrl_FTemplateFormBase: String = js.native
  
  def imageData: String | Null = js.native
  def imageData_=(newValue: String | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateFormBase")
@js.native
object TemplateFormBase extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
