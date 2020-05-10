package typingsSlinky.ebml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBMLDefaultableTagSchema extends EBMLTagSchemaBase {
  var default: js.UndefOr[js.Any] = js.native
}

object EBMLDefaultableTagSchema {
  @scala.inline
  def apply(description: String, level: Double, name: String, `type`: TagType): EBMLDefaultableTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLDefaultableTagSchema]
  }
  @scala.inline
  implicit class EBMLDefaultableTagSchemaOps[Self <: EBMLDefaultableTagSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Any): Self = {
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

