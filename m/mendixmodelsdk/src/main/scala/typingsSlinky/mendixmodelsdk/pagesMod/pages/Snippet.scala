package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/snippet relevant section in reference guide}
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
- typingsSlinky.mendixmodelsdk.pagesMod.pages.ISnippet because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName, `type` */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Snippet")
@js.native
class Snippet protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("entityQualifiedName")
  val entityQualifiedName_FSnippet: String | Null = js.native
  @JSName("entity")
  val entity_FSnippet: IEntity | Null = js.native
  @JSName("model")
  var model_FSnippet: IModel = js.native
  /**
    * In version 8.4.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("type")
  val type_FSnippet: SnippetType = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MSnippet: FolderBase = js.native
  def entity(): js.Any = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName: String | Null = js.native
  @JSName("entity")
  def entity_Union: IEntity | Null = js.native
  /**
    * In version 8.4.0: added public
    * In version 8.0.0: introduced
    */
  def `type`: SnippetType = js.native
  def `type`(newValue: SnippetType): js.Any = js.native
  def widget(): js.Any = js.native
  def widget(newValue: Widget): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  @JSName("widget")
  def widget_Union: Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Snippet")
@js.native
object Snippet extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Snippet unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Snippet = js.native
}

