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

// @internal
@js.native
trait _DangerousChangeType extends js.Object {
  var ARG_DEFAULT_VALUE_CHANGE: typingsSlinky.graphql.graphqlStrings.ARG_DEFAULT_VALUE_CHANGE = js.native
  var INTERFACE_ADDED_TO_OBJECT: typingsSlinky.graphql.graphqlStrings.INTERFACE_ADDED_TO_OBJECT = js.native
  var OPTIONAL_ARG_ADDED: typingsSlinky.graphql.graphqlStrings.OPTIONAL_ARG_ADDED = js.native
  var OPTIONAL_INPUT_FIELD_ADDED: typingsSlinky.graphql.graphqlStrings.OPTIONAL_INPUT_FIELD_ADDED = js.native
  var TYPE_ADDED_TO_UNION: typingsSlinky.graphql.graphqlStrings.TYPE_ADDED_TO_UNION = js.native
  var VALUE_ADDED_TO_ENUM: typingsSlinky.graphql.graphqlStrings.VALUE_ADDED_TO_ENUM = js.native
}

object _DangerousChangeType {
  @scala.inline
  def apply(
    ARG_DEFAULT_VALUE_CHANGE: ARG_DEFAULT_VALUE_CHANGE,
    INTERFACE_ADDED_TO_OBJECT: INTERFACE_ADDED_TO_OBJECT,
    OPTIONAL_ARG_ADDED: OPTIONAL_ARG_ADDED,
    OPTIONAL_INPUT_FIELD_ADDED: OPTIONAL_INPUT_FIELD_ADDED,
    TYPE_ADDED_TO_UNION: TYPE_ADDED_TO_UNION,
    VALUE_ADDED_TO_ENUM: VALUE_ADDED_TO_ENUM
  ): _DangerousChangeType = {
    val __obj = js.Dynamic.literal(ARG_DEFAULT_VALUE_CHANGE = ARG_DEFAULT_VALUE_CHANGE.asInstanceOf[js.Any], INTERFACE_ADDED_TO_OBJECT = INTERFACE_ADDED_TO_OBJECT.asInstanceOf[js.Any], OPTIONAL_ARG_ADDED = OPTIONAL_ARG_ADDED.asInstanceOf[js.Any], OPTIONAL_INPUT_FIELD_ADDED = OPTIONAL_INPUT_FIELD_ADDED.asInstanceOf[js.Any], TYPE_ADDED_TO_UNION = TYPE_ADDED_TO_UNION.asInstanceOf[js.Any], VALUE_ADDED_TO_ENUM = VALUE_ADDED_TO_ENUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DangerousChangeType]
  }
  @scala.inline
  implicit class _DangerousChangeTypeOps[Self <: _DangerousChangeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARG_DEFAULT_VALUE_CHANGE(value: ARG_DEFAULT_VALUE_CHANGE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARG_DEFAULT_VALUE_CHANGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTERFACE_ADDED_TO_OBJECT(value: INTERFACE_ADDED_TO_OBJECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERFACE_ADDED_TO_OBJECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPTIONAL_ARG_ADDED(value: OPTIONAL_ARG_ADDED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONAL_ARG_ADDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPTIONAL_INPUT_FIELD_ADDED(value: OPTIONAL_INPUT_FIELD_ADDED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONAL_INPUT_FIELD_ADDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_ADDED_TO_UNION(value: TYPE_ADDED_TO_UNION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_ADDED_TO_UNION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVALUE_ADDED_TO_ENUM(value: VALUE_ADDED_TO_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VALUE_ADDED_TO_ENUM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

