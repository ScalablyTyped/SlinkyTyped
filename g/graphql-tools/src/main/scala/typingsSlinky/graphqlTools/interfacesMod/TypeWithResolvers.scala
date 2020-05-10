package typingsSlinky.graphqlTools.interfacesMod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeWithResolvers extends js.Object {
  var resolvers: js.UndefOr[IResolvers[_, _]] = js.native
  var `type`: GraphQLNamedType = js.native
}

object TypeWithResolvers {
  @scala.inline
  def apply(`type`: GraphQLNamedType): TypeWithResolvers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeWithResolvers]
  }
  @scala.inline
  implicit class TypeWithResolversOps[Self <: TypeWithResolvers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: GraphQLNamedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvers(value: IResolvers[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
  }
  
}

