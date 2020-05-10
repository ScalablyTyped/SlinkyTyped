package typingsSlinky.graphql.introspectionQueryMod

import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionSchema extends js.Object {
  val directives: js.Array[IntrospectionDirective] = js.native
  val mutationType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]] = js.native
  val queryType: IntrospectionNamedTypeRef[IntrospectionObjectType] = js.native
  val subscriptionType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]] = js.native
  val types: js.Array[IntrospectionType] = js.native
}

object IntrospectionSchema {
  @scala.inline
  def apply(
    directives: js.Array[IntrospectionDirective],
    queryType: IntrospectionNamedTypeRef[IntrospectionObjectType],
    types: js.Array[IntrospectionType]
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionSchema]
  }
  @scala.inline
  implicit class IntrospectionSchemaOps[Self <: IntrospectionSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectives(value: js.Array[IntrospectionDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryType(value: IntrospectionNamedTypeRef[IntrospectionObjectType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[IntrospectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutationType(value: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationType")(js.undefined)
        ret
    }
    @scala.inline
    def withMutationTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationType")(null)
        ret
    }
    @scala.inline
    def withSubscriptionType(value: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionType")(null)
        ret
    }
  }
  
}

