package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import typingsSlinky.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable
  extends ArgumentValue
     with IR
     with VisitNode {
  var kind: typingsSlinky.relayCompiler.relayCompilerStrings.Variable
  var loc: Location
  var `type`: js.UndefOr[TypeID] = js.undefined
  var variableName: String
}

object Variable {
  @scala.inline
  def apply(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    `type`: TypeID = null
  ): Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

