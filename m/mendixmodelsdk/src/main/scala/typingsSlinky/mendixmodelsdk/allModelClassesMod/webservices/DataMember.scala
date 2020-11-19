package typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices

import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `WebServices`.
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataMember")
@js.native
abstract class DataMember protected ()
  extends typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataMember {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataMember")
@js.native
object DataMember extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
