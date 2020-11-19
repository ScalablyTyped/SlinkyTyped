package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Structure")
@js.native
abstract class Structure protected ()
  extends typingsSlinky.mendixmodelsdk.internalMod.Structure {
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
    _isPartial: js.UndefOr[scala.Nothing],
    container: IContainer
  ) = this()
  def this(
    _model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean,
    container: IContainer
  ) = this()
}
