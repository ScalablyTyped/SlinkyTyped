package typingsSlinky.massive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<massive.massive.SearchDefinition, 'fields' | 'term'> */
@js.native
trait PickSearchDefinitionfield extends js.Object {
  var fields: js.Array[String] = js.native
  var term: String = js.native
}

object PickSearchDefinitionfield {
  @scala.inline
  def apply(fields: js.Array[String], term: String): PickSearchDefinitionfield = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSearchDefinitionfield]
  }
  @scala.inline
  implicit class PickSearchDefinitionfieldOps[Self <: PickSearchDefinitionfield] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

