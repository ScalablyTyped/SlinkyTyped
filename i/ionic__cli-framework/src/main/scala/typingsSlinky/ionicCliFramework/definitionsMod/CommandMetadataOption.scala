package typingsSlinky.ionicCliFramework.definitionsMod

import typingsSlinky.ionicCliFramework.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandMetadataOption extends Metadata {
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var default: js.UndefOr[String | Boolean] = js.native
  var spec: js.UndefOr[Value] = js.native
  var `type`: js.UndefOr[CommandOptionType] = js.native
}

object CommandMetadataOption {
  @scala.inline
  def apply(name: String, summary: String): CommandMetadataOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
  @scala.inline
  implicit class CommandMetadataOptionOps[Self <: CommandMetadataOption] (val x: Self) extends AnyVal {
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
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
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
    @scala.inline
    def withSpec(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CommandOptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

