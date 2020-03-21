package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.schemaMod.InputTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition
  - typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition
*/
trait ArgumentDefinition extends js.Object

object ArgumentDefinition {
  @scala.inline
  def LocalArgumentDefinition(
    defaultValue: js.Any,
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.LocalArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID,
    metadata: Metadata = null
  ): ArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentDefinition]
  }
  @scala.inline
  def RootArgumentDefinition(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.RootArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID
  ): ArgumentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentDefinition]
  }
}

