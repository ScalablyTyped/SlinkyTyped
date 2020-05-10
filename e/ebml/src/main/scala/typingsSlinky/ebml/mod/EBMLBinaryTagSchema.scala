package typingsSlinky.ebml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.ebml.mod.EBMLTagSchema because Already inherited */ @js.native
trait EBMLBinaryTagSchema extends EBMLTagSchemaBase {
  var bytesize: js.UndefOr[Double] = js.native
}

object EBMLBinaryTagSchema {
  @scala.inline
  def apply(description: String, level: Double, name: String, `type`: TagType): EBMLBinaryTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLBinaryTagSchema]
  }
  @scala.inline
  implicit class EBMLBinaryTagSchemaOps[Self <: EBMLBinaryTagSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesize")(js.undefined)
        ret
    }
  }
  
}

