package typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/document-templates relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DocumentTemplate")
@js.native
class DocumentTemplate protected ()
  extends typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object DocumentTemplate {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DocumentTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DocumentTemplate unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DocumentTemplate.createIn")
  @js.native
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DocumentTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DocumentTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
