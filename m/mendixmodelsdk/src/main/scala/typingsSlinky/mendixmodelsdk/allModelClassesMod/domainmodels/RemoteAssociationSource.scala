package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.10.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.RemoteAssociationSource")
@js.native
abstract class RemoteAssociationSource protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteAssociationSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.RemoteAssociationSource")
@js.native
object RemoteAssociationSource extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
