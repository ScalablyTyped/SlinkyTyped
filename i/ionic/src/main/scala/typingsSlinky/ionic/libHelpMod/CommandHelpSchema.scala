package typingsSlinky.ionic.libHelpMod

import typingsSlinky.ionicCliFramework.helpMod.CommandHelpSchemaFootnote
import typingsSlinky.ionicCliFramework.helpMod.CommandHelpSchemaInput
import typingsSlinky.ionicCliFramework.helpMod.CommandHelpSchemaOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchema
  extends typingsSlinky.ionicCliFramework.helpMod.CommandHelpSchema {
  var `type`: String
}

object CommandHelpSchema {
  @scala.inline
  def apply(
    aliases: js.Array[String],
    description: String,
    exampleCommands: js.Array[String],
    footnotes: js.Array[CommandHelpSchemaFootnote],
    groups: js.Array[String],
    inputs: js.Array[CommandHelpSchemaInput],
    name: String,
    namespace: js.Array[String],
    options: js.Array[CommandHelpSchemaOption],
    summary: String,
    `type`: String
  ): CommandHelpSchema = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exampleCommands = exampleCommands.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchema]
  }
}

