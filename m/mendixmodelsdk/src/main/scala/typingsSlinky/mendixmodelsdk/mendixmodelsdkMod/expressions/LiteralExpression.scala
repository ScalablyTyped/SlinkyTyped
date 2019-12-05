package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.expressions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "expressions.LiteralExpression")
@js.native
abstract class LiteralExpression protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.expressions.LiteralExpression {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "expressions.LiteralExpression")
@js.native
object LiteralExpression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
}

