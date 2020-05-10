package typingsSlinky.graphql.directiveLocationMod

import typingsSlinky.graphql.graphqlStrings.ARGUMENT_DEFINITION
import typingsSlinky.graphql.graphqlStrings.ENUM
import typingsSlinky.graphql.graphqlStrings.ENUM_VALUE
import typingsSlinky.graphql.graphqlStrings.FIELD
import typingsSlinky.graphql.graphqlStrings.FIELD_DEFINITION
import typingsSlinky.graphql.graphqlStrings.FRAGMENT_DEFINITION
import typingsSlinky.graphql.graphqlStrings.FRAGMENT_SPREAD
import typingsSlinky.graphql.graphqlStrings.INLINE_FRAGMENT
import typingsSlinky.graphql.graphqlStrings.INPUT_FIELD_DEFINITION
import typingsSlinky.graphql.graphqlStrings.INPUT_OBJECT
import typingsSlinky.graphql.graphqlStrings.INTERFACE
import typingsSlinky.graphql.graphqlStrings.MUTATION
import typingsSlinky.graphql.graphqlStrings.OBJECT
import typingsSlinky.graphql.graphqlStrings.QUERY
import typingsSlinky.graphql.graphqlStrings.SCALAR
import typingsSlinky.graphql.graphqlStrings.SCHEMA
import typingsSlinky.graphql.graphqlStrings.SUBSCRIPTION
import typingsSlinky.graphql.graphqlStrings.UNION
import typingsSlinky.graphql.graphqlStrings.VARIABLE_DEFINITION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// @internal
@js.native
trait _DirectiveLocation extends js.Object {
  var ARGUMENT_DEFINITION: typingsSlinky.graphql.graphqlStrings.ARGUMENT_DEFINITION = js.native
  var ENUM: typingsSlinky.graphql.graphqlStrings.ENUM = js.native
  var ENUM_VALUE: typingsSlinky.graphql.graphqlStrings.ENUM_VALUE = js.native
  var FIELD: typingsSlinky.graphql.graphqlStrings.FIELD = js.native
  var FIELD_DEFINITION: typingsSlinky.graphql.graphqlStrings.FIELD_DEFINITION = js.native
  var FRAGMENT_DEFINITION: typingsSlinky.graphql.graphqlStrings.FRAGMENT_DEFINITION = js.native
  var FRAGMENT_SPREAD: typingsSlinky.graphql.graphqlStrings.FRAGMENT_SPREAD = js.native
  var INLINE_FRAGMENT: typingsSlinky.graphql.graphqlStrings.INLINE_FRAGMENT = js.native
  var INPUT_FIELD_DEFINITION: typingsSlinky.graphql.graphqlStrings.INPUT_FIELD_DEFINITION = js.native
  var INPUT_OBJECT: typingsSlinky.graphql.graphqlStrings.INPUT_OBJECT = js.native
  var INTERFACE: typingsSlinky.graphql.graphqlStrings.INTERFACE = js.native
  var MUTATION: typingsSlinky.graphql.graphqlStrings.MUTATION = js.native
  var OBJECT: typingsSlinky.graphql.graphqlStrings.OBJECT = js.native
  // Request Definitions
  var QUERY: typingsSlinky.graphql.graphqlStrings.QUERY = js.native
  var SCALAR: typingsSlinky.graphql.graphqlStrings.SCALAR = js.native
  // Type System Definitions
  var SCHEMA: typingsSlinky.graphql.graphqlStrings.SCHEMA = js.native
  var SUBSCRIPTION: typingsSlinky.graphql.graphqlStrings.SUBSCRIPTION = js.native
  var UNION: typingsSlinky.graphql.graphqlStrings.UNION = js.native
  var VARIABLE_DEFINITION: typingsSlinky.graphql.graphqlStrings.VARIABLE_DEFINITION = js.native
}

object _DirectiveLocation {
  @scala.inline
  def apply(
    ARGUMENT_DEFINITION: ARGUMENT_DEFINITION,
    ENUM: ENUM,
    ENUM_VALUE: ENUM_VALUE,
    FIELD: FIELD,
    FIELD_DEFINITION: FIELD_DEFINITION,
    FRAGMENT_DEFINITION: FRAGMENT_DEFINITION,
    FRAGMENT_SPREAD: FRAGMENT_SPREAD,
    INLINE_FRAGMENT: INLINE_FRAGMENT,
    INPUT_FIELD_DEFINITION: INPUT_FIELD_DEFINITION,
    INPUT_OBJECT: INPUT_OBJECT,
    INTERFACE: INTERFACE,
    MUTATION: MUTATION,
    OBJECT: OBJECT,
    QUERY: QUERY,
    SCALAR: SCALAR,
    SCHEMA: SCHEMA,
    SUBSCRIPTION: SUBSCRIPTION,
    UNION: UNION,
    VARIABLE_DEFINITION: VARIABLE_DEFINITION
  ): _DirectiveLocation = {
    val __obj = js.Dynamic.literal(ARGUMENT_DEFINITION = ARGUMENT_DEFINITION.asInstanceOf[js.Any], ENUM = ENUM.asInstanceOf[js.Any], ENUM_VALUE = ENUM_VALUE.asInstanceOf[js.Any], FIELD = FIELD.asInstanceOf[js.Any], FIELD_DEFINITION = FIELD_DEFINITION.asInstanceOf[js.Any], FRAGMENT_DEFINITION = FRAGMENT_DEFINITION.asInstanceOf[js.Any], FRAGMENT_SPREAD = FRAGMENT_SPREAD.asInstanceOf[js.Any], INLINE_FRAGMENT = INLINE_FRAGMENT.asInstanceOf[js.Any], INPUT_FIELD_DEFINITION = INPUT_FIELD_DEFINITION.asInstanceOf[js.Any], INPUT_OBJECT = INPUT_OBJECT.asInstanceOf[js.Any], INTERFACE = INTERFACE.asInstanceOf[js.Any], MUTATION = MUTATION.asInstanceOf[js.Any], OBJECT = OBJECT.asInstanceOf[js.Any], QUERY = QUERY.asInstanceOf[js.Any], SCALAR = SCALAR.asInstanceOf[js.Any], SCHEMA = SCHEMA.asInstanceOf[js.Any], SUBSCRIPTION = SUBSCRIPTION.asInstanceOf[js.Any], UNION = UNION.asInstanceOf[js.Any], VARIABLE_DEFINITION = VARIABLE_DEFINITION.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DirectiveLocation]
  }
  @scala.inline
  implicit class _DirectiveLocationOps[Self <: _DirectiveLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARGUMENT_DEFINITION(value: ARGUMENT_DEFINITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DEFINITION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENUM(value: ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENUM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENUM_VALUE(value: ENUM_VALUE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENUM_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIELD(value: FIELD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIELD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIELD_DEFINITION(value: FIELD_DEFINITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIELD_DEFINITION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAGMENT_DEFINITION(value: FRAGMENT_DEFINITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT_DEFINITION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAGMENT_SPREAD(value: FRAGMENT_SPREAD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT_SPREAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINLINE_FRAGMENT(value: INLINE_FRAGMENT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INLINE_FRAGMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINPUT_FIELD_DEFINITION(value: INPUT_FIELD_DEFINITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPUT_FIELD_DEFINITION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINPUT_OBJECT(value: INPUT_OBJECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPUT_OBJECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTERFACE(value: INTERFACE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERFACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMUTATION(value: MUTATION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MUTATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOBJECT(value: OBJECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBJECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUERY(value: QUERY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUERY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCALAR(value: SCALAR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCALAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCHEMA(value: SCHEMA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCHEMA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUBSCRIPTION(value: SUBSCRIPTION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUBSCRIPTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNION(value: UNION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVARIABLE_DEFINITION(value: VARIABLE_DEFINITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VARIABLE_DEFINITION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

