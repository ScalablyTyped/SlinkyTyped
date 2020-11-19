package typingsSlinky.mendixmodelsdk.allModelClassesMod.datatypes

import typingsSlinky.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DataType")
@js.native
abstract class DataType protected ()
  extends typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DataType")
@js.native
object DataType extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
