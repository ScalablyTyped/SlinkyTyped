package typingsSlinky.mendixmodelsdk.allModelClassesMod.javaactions

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/java-actions relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaAction")
@js.native
class JavaAction protected ()
  extends typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.JavaAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object JavaAction {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new JavaAction unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaAction.createIn")
  @js.native
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.JavaAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
