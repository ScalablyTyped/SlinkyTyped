package typingsSlinky.ionicCliFramework.anon

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.Footnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadata<@ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadataInput, @ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadataOption>> */
@js.native
trait RequiredCommandMetadataCo extends js.Object {
  var description: String = js.native
  var exampleCommands: js.Array[String] = js.native
  var footnotes: js.Array[Footnote] = js.native
  var groups: js.Array[String] = js.native
  var inputs: js.Array[CommandMetadataInput] = js.native
  var name: String = js.native
  var options: js.Array[CommandMetadataOption] = js.native
  var summary: String = js.native
}

object RequiredCommandMetadataCo {
  @scala.inline
  def apply(
    description: String,
    exampleCommands: js.Array[String],
    footnotes: js.Array[Footnote],
    groups: js.Array[String],
    inputs: js.Array[CommandMetadataInput],
    name: String,
    options: js.Array[CommandMetadataOption],
    summary: String
  ): RequiredCommandMetadataCo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exampleCommands = exampleCommands.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredCommandMetadataCo]
  }
  @scala.inline
  implicit class RequiredCommandMetadataCoOps[Self <: RequiredCommandMetadataCo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFootnotes(value: js.Array[Footnote]): Self = {
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
    def withInputs(value: js.Array[CommandMetadataInput]): Self = {
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
    def withOptions(value: js.Array[CommandMetadataOption]): Self = {
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

