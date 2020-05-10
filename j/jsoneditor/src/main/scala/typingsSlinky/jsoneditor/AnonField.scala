package typingsSlinky.jsoneditor

import typingsSlinky.jsoneditor.jsoneditorStrings.EqualssignEqualssign
import typingsSlinky.jsoneditor.jsoneditorStrings.ExclamationmarkEqualssign
import typingsSlinky.jsoneditor.jsoneditorStrings.Greaterthansign
import typingsSlinky.jsoneditor.jsoneditorStrings.GreaterthansignEqualssign
import typingsSlinky.jsoneditor.jsoneditorStrings.Lessthansign
import typingsSlinky.jsoneditor.jsoneditorStrings.LessthansignEqualssign
import typingsSlinky.jsoneditor.jsoneditorStrings.`@`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonField extends js.Object {
  var field: String | `@` = js.native
  var relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign = js.native
  var value: String = js.native
}

object AnonField {
  @scala.inline
  def apply(
    field: String | `@`,
    relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    value: String
  ): AnonField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonField]
  }
  @scala.inline
  implicit class AnonFieldOps[Self <: AnonField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String | `@`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelation(
      value: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

