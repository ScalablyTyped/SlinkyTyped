package typingsSlinky.graphql.findBreakingChangesMod

import typingsSlinky.graphql.graphqlStrings.ARG_DEFAULT_VALUE_CHANGE
import typingsSlinky.graphql.graphqlStrings.INTERFACE_ADDED_TO_OBJECT
import typingsSlinky.graphql.graphqlStrings.OPTIONAL_ARG_ADDED
import typingsSlinky.graphql.graphqlStrings.OPTIONAL_INPUT_FIELD_ADDED
import typingsSlinky.graphql.graphqlStrings.TYPE_ADDED_TO_UNION
import typingsSlinky.graphql.graphqlStrings.VALUE_ADDED_TO_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DangerousChange extends js.Object {
  var description: String = js.native
  var `type`: /* keyof graphql.graphql/utilities/findBreakingChanges._DangerousChangeType */ VALUE_ADDED_TO_ENUM | TYPE_ADDED_TO_UNION | OPTIONAL_INPUT_FIELD_ADDED | OPTIONAL_ARG_ADDED | INTERFACE_ADDED_TO_OBJECT | ARG_DEFAULT_VALUE_CHANGE = js.native
}

object DangerousChange {
  @scala.inline
  def apply(
    description: String,
    `type`: /* keyof graphql.graphql/utilities/findBreakingChanges._DangerousChangeType */ VALUE_ADDED_TO_ENUM | TYPE_ADDED_TO_UNION | OPTIONAL_INPUT_FIELD_ADDED | OPTIONAL_ARG_ADDED | INTERFACE_ADDED_TO_OBJECT | ARG_DEFAULT_VALUE_CHANGE
  ): DangerousChange = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerousChange]
  }
  @scala.inline
  implicit class DangerousChangeOps[Self <: DangerousChange] (val x: Self) extends AnyVal {
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
    def withType(
      value: /* keyof graphql.graphql/utilities/findBreakingChanges._DangerousChangeType */ VALUE_ADDED_TO_ENUM | TYPE_ADDED_TO_UNION | OPTIONAL_INPUT_FIELD_ADDED | OPTIONAL_ARG_ADDED | INTERFACE_ADDED_TO_OBJECT | ARG_DEFAULT_VALUE_CHANGE
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

