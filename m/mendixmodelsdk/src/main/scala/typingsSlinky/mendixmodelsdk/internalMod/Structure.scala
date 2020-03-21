package typingsSlinky.mendixmodelsdk.internalMod

import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "Structure")
@js.native
abstract class Structure protected ()
  extends typingsSlinky.mendixmodelsdk.structuresMod.Structure {
  def this(
    _model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String
  ) = this()
  def this(
    _model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean
  ) = this()
  def this(
    _model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean,
    container: IContainer
  ) = this()
}

