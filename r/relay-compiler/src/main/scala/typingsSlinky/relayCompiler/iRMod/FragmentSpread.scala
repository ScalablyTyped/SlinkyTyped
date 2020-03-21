package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentSpread
  extends IR
     with Selection
     with VisitNode {
  var args: js.Array[Argument]
  var directives: js.Array[Directive]
  var kind: typingsSlinky.relayCompiler.relayCompilerStrings.FragmentSpread
  var loc: Location
  var metadata: Metadata
  var name: String
}

object FragmentSpread {
  @scala.inline
  def apply(
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.FragmentSpread,
    loc: Location,
    name: String,
    metadata: Metadata = null
  ): FragmentSpread = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentSpread]
  }
}

