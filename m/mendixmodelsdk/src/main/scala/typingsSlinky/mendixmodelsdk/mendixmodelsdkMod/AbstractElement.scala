package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod

import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "AbstractElement")
@js.native
abstract class AbstractElement protected ()
  extends typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean
  ) = this()
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IContainer
  ) = this()
}

