package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleRole
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/page relevant section in reference guide}
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
- typingsSlinky.mendixmodelsdk.pagesMod.pages.IPage because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined layoutCall, allowedRoles, allowedRolesQualifiedNames */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Page")
@js.native
class Page protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 7.23.0: added public
    */
  def allowedRoles: IList[IModuleRole] = js.native
  
  def allowedRolesQualifiedNames: js.Array[String] = js.native
  @JSName("allowedRolesQualifiedNames")
  val allowedRolesQualifiedNames_FPage: js.Array[String] = js.native
  
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedRoles")
  val allowedRoles_FPage: IList[IModuleRole] = js.native
  
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
  def containerAsFolderBase_MPage: FolderBase = js.native
  
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
  val layoutCall_FPage: ILayoutCall = js.native
  
  def markAsUsed: Boolean = js.native
  def markAsUsed_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FPage: IModel = js.native
  
  /**
    * In version 6.7.0: introduced
    */
  def popupCloseAction: String = js.native
  def popupCloseAction_=(newValue: String): Unit = js.native
  
  def popupHeight: Double = js.native
  def popupHeight_=(newValue: Double): Unit = js.native
  
  def popupResizable: Boolean = js.native
  def popupResizable_=(newValue: Boolean): Unit = js.native
  
  def popupWidth: Double = js.native
  def popupWidth_=(newValue: Double): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  def title: Text = js.native
  def title_=(newValue: Text): Unit = js.native
  
  /**
    * In version 6.7.0: introduced
    */
  def url: String = js.native
  def url_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Page")
@js.native
object Page extends js.Object {
  
  /**
    * Creates a new Page unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Page = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
