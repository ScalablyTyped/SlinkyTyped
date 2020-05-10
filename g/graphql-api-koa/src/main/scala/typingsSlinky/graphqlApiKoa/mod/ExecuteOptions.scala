package typingsSlinky.graphqlApiKoa.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteOptions extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.native
  var fieldResolver: js.UndefOr[js.Any] = js.native
  var rootValue: js.UndefOr[js.Any] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
}

object ExecuteOptions {
  @scala.inline
  def apply(): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteOptions]
  }
  @scala.inline
  implicit class ExecuteOptionsOps[Self <: ExecuteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldResolver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withRootValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
  }
  
}

