package typingsSlinky.ebml.mod

import typingsSlinky.ebml.ebmlStrings.f
import typingsSlinky.ebml.ebmlStrings.i
import typingsSlinky.ebml.ebmlStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.ebml.mod.EBMLTagSchema because Already inherited */ @js.native
trait EBMLNumericTagSchema extends EBMLDefaultableTagSchema {
  var br: js.UndefOr[
    String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String])
  ] = js.native
  var range: String = js.native
  @JSName("type")
  var type_EBMLNumericTagSchema: u | i | f = js.native
}

object EBMLNumericTagSchema {
  @scala.inline
  def apply(description: String, level: Double, name: String, range: String, `type`: u | i | f): EBMLNumericTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLNumericTagSchema]
  }
  @scala.inline
  implicit class EBMLNumericTagSchemaOps[Self <: EBMLNumericTagSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: u | i | f): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBr(
      value: String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(js.undefined)
        ret
    }
  }
  
}

