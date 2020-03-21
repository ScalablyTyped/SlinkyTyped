package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.AnonFragmentTypeCondition
import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defer
  extends IR
     with Node
     with Selection
     with VisitNode {
  var `if`: ArgumentValue | Null
  var kind: typingsSlinky.relayCompiler.relayCompilerStrings.Defer
  var label: String
  var loc: Location
  var metadata: js.UndefOr[AnonFragmentTypeCondition | Null] = js.undefined
  var selections: js.Array[Selection]
}

object Defer {
  @scala.inline
  def apply(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Defer,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: AnonFragmentTypeCondition = null
  ): Defer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defer]
  }
}

