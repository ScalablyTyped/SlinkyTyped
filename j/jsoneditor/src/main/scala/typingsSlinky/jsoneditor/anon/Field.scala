package typingsSlinky.jsoneditor.anon

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

trait Field extends js.Object {
  var field: String | `@`
  var relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
  var value: String
}

object Field {
  @scala.inline
  def apply(
    field: String | `@`,
    relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    value: String
  ): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

