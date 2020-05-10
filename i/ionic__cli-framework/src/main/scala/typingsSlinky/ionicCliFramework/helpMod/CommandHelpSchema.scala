package typingsSlinky.ionicCliFramework.helpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandHelpSchema extends js.Object {
  val aliases: js.Array[String] = js.native
  val description: String = js.native
  val exampleCommands: js.Array[String] = js.native
  val footnotes: js.Array[CommandHelpSchemaFootnote] = js.native
  val groups: js.Array[String] = js.native
  val inputs: js.Array[CommandHelpSchemaInput] = js.native
  val name: String = js.native
  val namespace: js.Array[String] = js.native
  val options: js.Array[CommandHelpSchemaOption] = js.native
  val summary: String = js.native
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
    summary: String
  ): CommandHelpSchema = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exampleCommands = exampleCommands.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchema]
  }
  @scala.inline
  implicit class CommandHelpSchemaOps[Self <: CommandHelpSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExampleCommands(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnotes(value: js.Array[CommandHelpSchemaFootnote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[CommandHelpSchemaInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[CommandHelpSchemaOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

