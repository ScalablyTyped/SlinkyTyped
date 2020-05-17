package typingsSlinky.keystonejsAppGraphql.mod

import typingsSlinky.keystonejsAppGraphql.anon.Introspection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLAppOptions extends js.Object {
  var apiPath: js.UndefOr[String] = js.native
  var apollo: js.UndefOr[Introspection] = js.native
  var graphiqlPath: js.UndefOr[String] = js.native
  var schemaName: js.UndefOr[String] = js.native
}

object GraphQLAppOptions {
  @scala.inline
  def apply(): GraphQLAppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLAppOptions]
  }
  @scala.inline
  implicit class GraphQLAppOptionsOps[Self <: GraphQLAppOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiPath")(js.undefined)
        ret
    }
    @scala.inline
    def withApollo(value: Introspection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apollo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApollo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apollo")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphiqlPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphiqlPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphiqlPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphiqlPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(js.undefined)
        ret
    }
  }
  
}

