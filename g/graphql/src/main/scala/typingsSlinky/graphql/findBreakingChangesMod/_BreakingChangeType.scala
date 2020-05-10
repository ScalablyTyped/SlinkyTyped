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

// @internal
@js.native
trait _BreakingChangeType extends js.Object {
  var ARG_CHANGED_KIND: typingsSlinky.graphql.graphqlStrings.ARG_CHANGED_KIND = js.native
  var ARG_REMOVED: typingsSlinky.graphql.graphqlStrings.ARG_REMOVED = js.native
  var DIRECTIVE_ARG_REMOVED: typingsSlinky.graphql.graphqlStrings.DIRECTIVE_ARG_REMOVED = js.native
  var DIRECTIVE_LOCATION_REMOVED: typingsSlinky.graphql.graphqlStrings.DIRECTIVE_LOCATION_REMOVED = js.native
  var DIRECTIVE_REMOVED: typingsSlinky.graphql.graphqlStrings.DIRECTIVE_REMOVED = js.native
  var FIELD_CHANGED_KIND: typingsSlinky.graphql.graphqlStrings.FIELD_CHANGED_KIND = js.native
  var FIELD_REMOVED: typingsSlinky.graphql.graphqlStrings.FIELD_REMOVED = js.native
  var INTERFACE_REMOVED_FROM_OBJECT: typingsSlinky.graphql.graphqlStrings.INTERFACE_REMOVED_FROM_OBJECT = js.native
  var REQUIRED_ARG_ADDED: typingsSlinky.graphql.graphqlStrings.REQUIRED_ARG_ADDED = js.native
  var REQUIRED_DIRECTIVE_ARG_ADDED: typingsSlinky.graphql.graphqlStrings.REQUIRED_DIRECTIVE_ARG_ADDED = js.native
  var REQUIRED_INPUT_FIELD_ADDED: typingsSlinky.graphql.graphqlStrings.REQUIRED_INPUT_FIELD_ADDED = js.native
  var TYPE_CHANGED_KIND: typingsSlinky.graphql.graphqlStrings.TYPE_CHANGED_KIND = js.native
  var TYPE_REMOVED: typingsSlinky.graphql.graphqlStrings.TYPE_REMOVED = js.native
  var TYPE_REMOVED_FROM_UNION: typingsSlinky.graphql.graphqlStrings.TYPE_REMOVED_FROM_UNION = js.native
  var VALUE_REMOVED_FROM_ENUM: typingsSlinky.graphql.graphqlStrings.VALUE_REMOVED_FROM_ENUM = js.native
}

object _BreakingChangeType {
  @scala.inline
  def apply(
    ARG_CHANGED_KIND: ARG_CHANGED_KIND,
    ARG_REMOVED: ARG_REMOVED,
    DIRECTIVE_ARG_REMOVED: DIRECTIVE_ARG_REMOVED,
    DIRECTIVE_LOCATION_REMOVED: DIRECTIVE_LOCATION_REMOVED,
    DIRECTIVE_REMOVED: DIRECTIVE_REMOVED,
    FIELD_CHANGED_KIND: FIELD_CHANGED_KIND,
    FIELD_REMOVED: FIELD_REMOVED,
    INTERFACE_REMOVED_FROM_OBJECT: INTERFACE_REMOVED_FROM_OBJECT,
    REQUIRED_ARG_ADDED: REQUIRED_ARG_ADDED,
    REQUIRED_DIRECTIVE_ARG_ADDED: REQUIRED_DIRECTIVE_ARG_ADDED,
    REQUIRED_INPUT_FIELD_ADDED: REQUIRED_INPUT_FIELD_ADDED,
    TYPE_CHANGED_KIND: TYPE_CHANGED_KIND,
    TYPE_REMOVED: TYPE_REMOVED,
    TYPE_REMOVED_FROM_UNION: TYPE_REMOVED_FROM_UNION,
    VALUE_REMOVED_FROM_ENUM: VALUE_REMOVED_FROM_ENUM
  ): _BreakingChangeType = {
    val __obj = js.Dynamic.literal(ARG_CHANGED_KIND = ARG_CHANGED_KIND.asInstanceOf[js.Any], ARG_REMOVED = ARG_REMOVED.asInstanceOf[js.Any], DIRECTIVE_ARG_REMOVED = DIRECTIVE_ARG_REMOVED.asInstanceOf[js.Any], DIRECTIVE_LOCATION_REMOVED = DIRECTIVE_LOCATION_REMOVED.asInstanceOf[js.Any], DIRECTIVE_REMOVED = DIRECTIVE_REMOVED.asInstanceOf[js.Any], FIELD_CHANGED_KIND = FIELD_CHANGED_KIND.asInstanceOf[js.Any], FIELD_REMOVED = FIELD_REMOVED.asInstanceOf[js.Any], INTERFACE_REMOVED_FROM_OBJECT = INTERFACE_REMOVED_FROM_OBJECT.asInstanceOf[js.Any], REQUIRED_ARG_ADDED = REQUIRED_ARG_ADDED.asInstanceOf[js.Any], REQUIRED_DIRECTIVE_ARG_ADDED = REQUIRED_DIRECTIVE_ARG_ADDED.asInstanceOf[js.Any], REQUIRED_INPUT_FIELD_ADDED = REQUIRED_INPUT_FIELD_ADDED.asInstanceOf[js.Any], TYPE_CHANGED_KIND = TYPE_CHANGED_KIND.asInstanceOf[js.Any], TYPE_REMOVED = TYPE_REMOVED.asInstanceOf[js.Any], TYPE_REMOVED_FROM_UNION = TYPE_REMOVED_FROM_UNION.asInstanceOf[js.Any], VALUE_REMOVED_FROM_ENUM = VALUE_REMOVED_FROM_ENUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BreakingChangeType]
  }
  @scala.inline
  implicit class _BreakingChangeTypeOps[Self <: _BreakingChangeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARG_CHANGED_KIND(value: ARG_CHANGED_KIND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARG_CHANGED_KIND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARG_REMOVED(value: ARG_REMOVED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARG_REMOVED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDIRECTIVE_ARG_REMOVED(value: DIRECTIVE_ARG_REMOVED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIRECTIVE_ARG_REMOVED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDIRECTIVE_LOCATION_REMOVED(value: DIRECTIVE_LOCATION_REMOVED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIRECTIVE_LOCATION_REMOVED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDIRECTIVE_REMOVED(value: DIRECTIVE_REMOVED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIRECTIVE_REMOVED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIELD_CHANGED_KIND(value: FIELD_CHANGED_KIND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIELD_CHANGED_KIND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIELD_REMOVED(value: FIELD_REMOVED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIELD_REMOVED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTERFACE_REMOVED_FROM_OBJECT(value: INTERFACE_REMOVED_FROM_OBJECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERFACE_REMOVED_FROM_OBJECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREQUIRED_ARG_ADDED(value: REQUIRED_ARG_ADDED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUIRED_ARG_ADDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREQUIRED_DIRECTIVE_ARG_ADDED(value: REQUIRED_DIRECTIVE_ARG_ADDED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUIRED_DIRECTIVE_ARG_ADDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREQUIRED_INPUT_FIELD_ADDED(value: REQUIRED_INPUT_FIELD_ADDED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUIRED_INPUT_FIELD_ADDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_CHANGED_KIND(value: TYPE_CHANGED_KIND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_CHANGED_KIND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_REMOVED(value: TYPE_REMOVED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_REMOVED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_REMOVED_FROM_UNION(value: TYPE_REMOVED_FROM_UNION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_REMOVED_FROM_UNION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVALUE_REMOVED_FROM_ENUM(value: VALUE_REMOVED_FROM_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VALUE_REMOVED_FROM_ENUM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

