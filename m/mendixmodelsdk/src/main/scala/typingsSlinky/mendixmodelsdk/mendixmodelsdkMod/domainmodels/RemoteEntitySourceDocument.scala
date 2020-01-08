package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.2.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.RemoteEntitySourceDocument")
@js.native
abstract class RemoteEntitySourceDocument protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.RemoteEntitySourceDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "domainmodels.RemoteEntitySourceDocument")
@js.native
object RemoteEntitySourceDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

