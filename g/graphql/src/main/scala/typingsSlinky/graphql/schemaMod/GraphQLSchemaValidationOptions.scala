package typingsSlinky.graphql.schemaMod

import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLSchemaValidationOptions extends js.Object {
  /**
    * If provided, the schema will consider fields or types with names included
    * in this list valid, even if they do not adhere to the specification's
    * schema validation rules.
    *
    * This option is provided to ease adoption and will be removed in v15.
    */
  var allowedLegacyNames: js.UndefOr[Maybe[js.Array[String]]] = js.native
  /**
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[Boolean] = js.native
}

object GraphQLSchemaValidationOptions {
  @scala.inline
  def apply(): GraphQLSchemaValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLSchemaValidationOptions]
  }
  @scala.inline
  implicit class GraphQLSchemaValidationOptionsOps[Self <: GraphQLSchemaValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedLegacyNames(value: Maybe[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedLegacyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedLegacyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedLegacyNames")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedLegacyNamesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedLegacyNames")(null)
        ret
    }
    @scala.inline
    def withAssumeValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeValid")(js.undefined)
        ret
    }
  }
  
}

