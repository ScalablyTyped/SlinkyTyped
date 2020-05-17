package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsKeystone.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLExtensionSchema extends js.Object {
  var mutations: js.UndefOr[js.Array[GraphQLExtension[_, _]]] = js.native
  var queries: js.UndefOr[js.Array[GraphQLExtension[_, _]]] = js.native
  var types: js.UndefOr[js.Array[Type]] = js.native
}

object GraphQLExtensionSchema {
  @scala.inline
  def apply(): GraphQLExtensionSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLExtensionSchema]
  }
  @scala.inline
  implicit class GraphQLExtensionSchemaOps[Self <: GraphQLExtensionSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutations(value: js.Array[GraphQLExtension[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: js.Array[GraphQLExtension[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

