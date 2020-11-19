package typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.AttributeWidget")
@js.native
abstract class AttributeWidget protected ()
  extends typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.AttributeWidget {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.AttributeWidget")
@js.native
object AttributeWidget extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
