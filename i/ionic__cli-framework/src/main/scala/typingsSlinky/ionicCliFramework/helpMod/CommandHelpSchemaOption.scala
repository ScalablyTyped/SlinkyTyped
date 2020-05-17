package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.anon.ValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandHelpSchemaOption extends js.Object {
  val aliases: js.Array[String] = js.native
  val default: js.UndefOr[String | Boolean] = js.native
  val groups: js.Array[String] = js.native
  val name: String = js.native
  val spec: ValueString = js.native
  val summary: String = js.native
  val `type`: String = js.native
}

object CommandHelpSchemaOption {
  @scala.inline
  def apply(
    aliases: js.Array[String],
    groups: js.Array[String],
    name: String,
    spec: ValueString,
    summary: String,
    `type`: String
  ): CommandHelpSchemaOption = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaOption]
  }
  @scala.inline
  implicit class CommandHelpSchemaOptionOps[Self <: CommandHelpSchemaOption] (val x: Self) extends AnyVal {
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
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: ValueString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
  }
  
}

