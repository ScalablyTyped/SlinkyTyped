package typingsSlinky.graphqlTools.interfacesMod

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMockOptions extends js.Object {
  var mocks: js.UndefOr[IMocks] = js.native
  var preserveResolvers: js.UndefOr[Boolean] = js.native
  var schema: GraphQLSchema = js.native
}

object IMockOptions {
  @scala.inline
  def apply(schema: GraphQLSchema): IMockOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMockOptions]
  }
  @scala.inline
  implicit class IMockOptionsOps[Self <: IMockOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMocks(value: IMocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveResolvers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveResolvers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveResolvers")(js.undefined)
        ret
    }
  }
  
}

