package typingsSlinky.mendixmodelsdk.internalMod

import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractElement")
@js.native
abstract class AbstractElement protected ()
  extends typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement {
  def this(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean
  ) = this()
  def this(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IContainer
  ) = this()
}
