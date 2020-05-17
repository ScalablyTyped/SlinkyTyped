package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/building-block relevant section in reference guide}
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
- typingsSlinky.mendixmodelsdk.pagesMod.pages.IBuildingBlock because var conflicts: containerAsFolderBase, displayName, documentationUrl, id, isLoaded, model, structureTypeName, unit. Inlined platform */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.BuildingBlock")
@js.native
class BuildingBlock protected () extends TemplateFormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FBuildingBlock: IModel = js.native
  /**
    * In version 8.4.0: added public
    * In version 8.3.0: introduced
    */
  @JSName("platform")
  val platform_FBuildingBlock: SnippetType = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MBuildingBlock: FolderBase = js.native
  /**
    * In version 8.4.0: added public
    * In version 8.3.0: introduced
    */
  def platform: SnippetType = js.native
  def platform(newValue: SnippetType): js.Any = js.native
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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.BuildingBlock")
@js.native
object BuildingBlock extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new BuildingBlock unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): BuildingBlock = js.native
}

