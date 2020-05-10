package typingsSlinky.graphql.findBreakingChangesMod

import typingsSlinky.graphql.graphqlStrings.ARG_CHANGED_KIND
import typingsSlinky.graphql.graphqlStrings.ARG_REMOVED
import typingsSlinky.graphql.graphqlStrings.DIRECTIVE_ARG_REMOVED
import typingsSlinky.graphql.graphqlStrings.DIRECTIVE_LOCATION_REMOVED
import typingsSlinky.graphql.graphqlStrings.DIRECTIVE_REMOVED
import typingsSlinky.graphql.graphqlStrings.FIELD_CHANGED_KIND
import typingsSlinky.graphql.graphqlStrings.FIELD_REMOVED
import typingsSlinky.graphql.graphqlStrings.INTERFACE_REMOVED_FROM_OBJECT
import typingsSlinky.graphql.graphqlStrings.REQUIRED_ARG_ADDED
import typingsSlinky.graphql.graphqlStrings.REQUIRED_DIRECTIVE_ARG_ADDED
import typingsSlinky.graphql.graphqlStrings.REQUIRED_INPUT_FIELD_ADDED
import typingsSlinky.graphql.graphqlStrings.TYPE_CHANGED_KIND
import typingsSlinky.graphql.graphqlStrings.TYPE_REMOVED
import typingsSlinky.graphql.graphqlStrings.TYPE_REMOVED_FROM_UNION
import typingsSlinky.graphql.graphqlStrings.VALUE_REMOVED_FROM_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakingChange extends js.Object {
  var description: String = js.native
  var `type`: /* keyof graphql.graphql/utilities/findBreakingChanges._BreakingChangeType */ TYPE_REMOVED | TYPE_CHANGED_KIND | TYPE_REMOVED_FROM_UNION | VALUE_REMOVED_FROM_ENUM | REQUIRED_INPUT_FIELD_ADDED | INTERFACE_REMOVED_FROM_OBJECT | FIELD_REMOVED | FIELD_CHANGED_KIND | REQUIRED_ARG_ADDED | ARG_REMOVED | ARG_CHANGED_KIND | DIRECTIVE_REMOVED | DIRECTIVE_ARG_REMOVED | REQUIRED_DIRECTIVE_ARG_ADDED | DIRECTIVE_LOCATION_REMOVED = js.native
}

object BreakingChange {
  @scala.inline
  def apply(
    description: String,
    `type`: /* keyof graphql.graphql/utilities/findBreakingChanges._BreakingChangeType */ TYPE_REMOVED | TYPE_CHANGED_KIND | TYPE_REMOVED_FROM_UNION | VALUE_REMOVED_FROM_ENUM | REQUIRED_INPUT_FIELD_ADDED | INTERFACE_REMOVED_FROM_OBJECT | FIELD_REMOVED | FIELD_CHANGED_KIND | REQUIRED_ARG_ADDED | ARG_REMOVED | ARG_CHANGED_KIND | DIRECTIVE_REMOVED | DIRECTIVE_ARG_REMOVED | REQUIRED_DIRECTIVE_ARG_ADDED | DIRECTIVE_LOCATION_REMOVED
  ): BreakingChange = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakingChange]
  }
  @scala.inline
  implicit class BreakingChangeOps[Self <: BreakingChange] (val x: Self) extends AnyVal {
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
      value: /* keyof graphql.graphql/utilities/findBreakingChanges._BreakingChangeType */ TYPE_REMOVED | TYPE_CHANGED_KIND | TYPE_REMOVED_FROM_UNION | VALUE_REMOVED_FROM_ENUM | REQUIRED_INPUT_FIELD_ADDED | INTERFACE_REMOVED_FROM_OBJECT | FIELD_REMOVED | FIELD_CHANGED_KIND | REQUIRED_ARG_ADDED | ARG_REMOVED | ARG_CHANGED_KIND | DIRECTIVE_REMOVED | DIRECTIVE_ARG_REMOVED | REQUIRED_DIRECTIVE_ARG_ADDED | DIRECTIVE_LOCATION_REMOVED
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

